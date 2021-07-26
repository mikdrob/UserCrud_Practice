package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import java.util.List;


//JpaSpecificationExecutor adds different methods to use specifications
//Custom repository defines methods for custom queries with criteria api
@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom, JpaSpecificationExecutor<User> {
    List<User> findByUsernameContaining(String username);
}
