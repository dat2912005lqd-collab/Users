package com.booking.users.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import com.booking.users.dto.LoginRequest;
import com.booking.users.dto.RegisterUserRequest;
import com.booking.users.dto.UserResponseDTO;
import com.booking.users.entity.User;
import com.booking.users.service.UserService;
import com.booking.users.util.JwtUtil;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping()
    public ResponseEntity<UserResponseDTO> registerUser(@RequestBody RegisterUserRequest request) {
        return ResponseEntity.ok(userService.registerUser(request));
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        User user = userService.login(request.getPhoneNumber(), request.getPassword());
        String token = JwtUtil.generateToken(user.getPhoneNumber());
        return ResponseEntity.ok(token);
    }
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("OK");
    }
    @GetMapping("/me")
    public ResponseEntity<User> getMe(@RequestHeader("Authorization") String authHeader) {
        String token = authHeader.replace("Bearer ", "");
        String phone = JwtUtil.getPhoneFromToken(token);
        return ResponseEntity.ok(userService.findByEmail(phone));
    }
}

