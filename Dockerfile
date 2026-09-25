FROM gradle:8.7.1-jdk17 AS build
WORKDIR /app

COPY . .
RUN ./gradlew clean bootJar --no-daemon

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
