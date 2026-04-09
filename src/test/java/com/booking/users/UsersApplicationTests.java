package com.booking.users;

import org.springframework.beans.factory.annotation.Autowired;
import com.booking.users.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class UsersApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }
}
