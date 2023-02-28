package com.hoaxify.hoaxify.services;

import com.hoaxify.hoaxify.entities.AppUser;
import com.hoaxify.hoaxify.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AppUser save(AppUser appUser) {
        return userRepository.save(appUser);
    }
}
