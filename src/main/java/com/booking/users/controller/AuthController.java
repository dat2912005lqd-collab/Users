package com.booking.users.controller;
import com.booking.users.dto.LoginRequest;
import com.booking.users.dto.LoginResponse;
import com.booking.users.entity.User;
import com.booking.users.service.UserService;
import com.booking.users.util.JWtUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api/auth")
public class AuthController {
  private final UserService userService;
    public AuthController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        User user = userService.login(request.getPhoneNumber(), request.getPassword());
        String token = JWtUtil.generateToken(user.getPhoneNumber());
        return new LoginResponse(token, user);
}
}
