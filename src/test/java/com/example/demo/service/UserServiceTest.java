package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepository userRepository;
    private UserService userService;

    @BeforeEach
    void setUp(){
        userService = new UserService(userRepository);
    }


    @Test
    void canGetAll() {
        // when
        userService.getAll();
        // then
        verify(userRepository).findAll();
    }

    // argument capture test
    @Test
    void canAdd() {
        // given
        UserDto user = new UserDto();
        user.setUsername("testusername");

        // when
        userService.Add(user);

        // then
        ArgumentCaptor<User> personArgumentCaptor = ArgumentCaptor.forClass(User.class);
        verify(userRepository).save(personArgumentCaptor.capture());

        // making sure that an entity passed to service is the same the service will use to add a new record
        User capturedPerson = personArgumentCaptor.getValue();
        assertThat(capturedPerson).isEqualTo(user);
    }

}
