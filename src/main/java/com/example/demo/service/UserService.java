package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import static org.springframework.data.jpa.domain.Specification.where;

@Service
public class UserService {

    @Autowired
    private ModelMapper modelMapper;

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public Optional<User> getbyId(long id) {
        return userRepository.findById(id);
    }

    public User Add(UserDto userDto) {
        User _user = modelMapper.map(userDto, User.class);
        return userRepository.save(_user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }
    public void deleteAll(){
        userRepository.deleteAll();
    }

    public List<User> findByUsername(String username) {
        return userRepository.findByUsernameContaining(username);
    }

    public List<User> findByFirstNameAndLastName(String firstName, String lastName) {
        Specification<User> userFirstName = userRepository.firstNameContains(firstName);
        Specification<User> userLastName = userRepository.lastNameContains(lastName);
        return userRepository.findAll(where(userFirstName).and(userLastName));
    }


}
