package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.domain.Specification;

public interface UserRepositoryCustom {
    Specification<User> firstNameContains(String firstName);
    Specification<User> lastNameContains(String lastName);
}
