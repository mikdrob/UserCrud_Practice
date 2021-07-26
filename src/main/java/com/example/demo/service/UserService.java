package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> GetAll() {
        return userRepository.findAll();
    }

    public Optional<User> GetbyId(long id) {
        return userRepository.findById(id);
    }

    public User Add(User user) {
        return userRepository.save(user);
    }

    public void Delete(Long id){
        userRepository.deleteById(id);
    }
    public void DeleteAll(){
        userRepository.deleteAll();
    }

    public List<User> FindByUsername(String username) {
        return userRepository.findByUsernameContaining(username);
    }
}
