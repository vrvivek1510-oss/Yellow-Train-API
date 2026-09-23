package com.wishers.yellow_train_journeys.repository;

import com.wishers.yellow_train_journeys.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}