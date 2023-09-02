package com.and.dabbawalla.service;

import com.and.dabbawalla.entity.User;
import com.and.dabbawalla.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void registerUser(User user) {
         userRepository.save(user);
    }

   public Optional<User> getUserById(Long id) {
       final Optional<User> user = userRepository.findById(id);
       return user;
    }


}
