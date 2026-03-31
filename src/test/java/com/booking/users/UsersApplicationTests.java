package com.booking.users;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.booking.users.service.UserService;

@SpringBootTest
class UsersApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }
}
