package com.Lucas_Ferrari.Storage_System.service;

import com.Lucas_Ferrari.Storage_System.model.Product;
import com.Lucas_Ferrari.Storage_System.model.User;
import com.Lucas_Ferrari.Storage_System.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user){
        return userRepository.save(user);
    }

    public List<User> listAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Long id){
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User updatedUser){

        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(updatedUser.getName());
        user.setCpf(updatedUser.getCpf());
        user.setCellNumber(updatedUser.getCellNumber());

        return userRepository.save(user);
    }

    public void deleteUserById(Long id){
        deleteUserById(id);
    }
}

