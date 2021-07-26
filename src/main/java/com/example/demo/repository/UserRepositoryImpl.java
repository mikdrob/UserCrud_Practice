package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public class UserRepositoryImpl implements UserRepositoryCustom{

    // find users with first names that contain requested string
    @Override
    public Specification<User> firstNameContains(String firstName) {
        return (user, cq, cb) -> cb.like(user.get("firstName"), "%" + firstName + "%");
    }

    // similarly find users with last names that contain requested string
    @Override
    public Specification<User> lastNameContains(String lastName) {
        return (user, cq, cb) -> cb.like(user.get("lastName"), "%" + lastName + "%");
    }
}
