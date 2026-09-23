package com.wishers.yellow_train_journeys.service;

import tools.jackson.databind.json.JsonMapper;
import com.wishers.yellow_train_journeys.dto.User;
import com.wishers.yellow_train_journeys.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    private final JsonMapper jsonMapper;
    private final UserRepository userRepository;

    public UserService(JsonMapper jsonMapper, UserRepository userRepository) {
        this.jsonMapper = jsonMapper;
        this.userRepository = userRepository;
    }

    public User createNewUser(User user) {
        log.info("User data: {}", jsonMapper.writeValueAsString(user));
        return userRepository.save(user);   // NEW — actually persists to MySQL
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }
}