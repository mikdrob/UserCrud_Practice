package com.example.demo.repository;

import com.example.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    void findByUsernameContaining() {
        // given
        String username = "testusername123";
        String query = "test";
        User user = new User();
        user.setUsername(username);
        repository.save(user);

        // when
        List<User> foundUsers = new ArrayList<>(repository.findByUsernameContaining(query));

        // then
        assertThat(foundUsers).isNotEmpty();
    }
}
