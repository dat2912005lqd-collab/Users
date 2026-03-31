package com.booking.users;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.booking.users.service.UserService;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class UsersApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }

    @Test
    void testUserService() {
        // Simple test to check if UserService is injected
        assertNotNull(userService);
    }

}