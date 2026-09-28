package tn.esprit.spring.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.UserRepository;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
        user.setId(1L);
    }

    @Test
    void testAddUser() {

        when(userRepository.save(user)).thenReturn(user);

        User result = userService.addUser(user);

        assertNotNull(result);
        assertEquals(user, result);

        verify(userRepository, times(1)).save(user);
    }

    @Test
    void testUpdateUser() {

        when(userRepository.save(user)).thenReturn(user);

        User result = userService.updateUser(user);

        assertNotNull(result);
        assertEquals(user, result);

        verify(userRepository, times(1)).save(user);
    }

    @Test
    void testRetrieveUser() {

        when(userRepository.findById(1L))
                .thenReturn(Optional.of(user));

        User result = userService.retrieveUser("1");

        assertNotNull(result);
        assertEquals(user, result);

        verify(userRepository, times(1)).findById(1L);
    }

    @Test
    void testRetrieveUserNotFound() {

        when(userRepository.findById(1L))
                .thenReturn(Optional.empty());

        User result = userService.retrieveUser("1");

        assertNull(result);

        verify(userRepository, times(1)).findById(1L);
    }

    @Test
    void testDeleteUser() {

        doNothing().when(userRepository).deleteById(1L);

        userService.deleteUser("1");

        verify(userRepository, times(1)).deleteById(1L);
    }
}
