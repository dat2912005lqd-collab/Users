package com.booking.users.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.booking.users.dto.RegisterUserRequest;
import com.booking.users.dto.UserResponseDTO;
import com.booking.users.entity.User;
import com.booking.users.mapper.UserMapper;
import com.booking.users.repository.UserRepository;
import com.booking.users.util.MD5Util;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public UserResponseDTO registerUser(RegisterUserRequest request) {
        User user = new User();
        user.setFullname(request.getFullname());
        user.setEmail(request.getEmail());
        user.setRole(request.getRole());
        user.setPhoneNumber(request.getPhoneNumber());
        String encryptedPassword = MD5Util.encrypt(request.getPassword());
        user.setPassword(encryptedPassword);
        User savedUser = userRepository.save(user);
        return toUserResponseDTO(savedUser);
    }
    private UserResponseDTO toUserResponseDTO(User user) {
        return UserMapper.toResponseDTO(user);
    }
    public void deleteUser(Long id) {
        if (id != null) {
            userRepository.deleteById(id);
        }
    }
    public User register(User user){
        String encryptedPassword = MD5Util.encrypt(user.getPassword());
        user.setPassword(encryptedPassword);
        return userRepository.save(user);
    }
    public User login(String phoneNumber, String password){
       User user = userRepository.findByPhoneNumber(phoneNumber);
       if (user == null) {
            throw new RuntimeException("User not found");
       }
       String encryptedPassword = MD5Util.encrypt(password);
       if (!user.getPassword().equals(encryptedPassword)) {
            throw new RuntimeException("Invalid password");
       }
       return user;
    }
    public User findByPhoneNumber(String phoneNumber) {
        return userRepository.findByPhoneNumber(phoneNumber);
    }
    public UserResponseDTO registerNewUser(RegisterUserRequest request) {
       if (userRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already in use");
       }
       User user = UserMapper.toEntity(request);
       if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("USER");
       }
       String encryptedPassword = MD5Util.encrypt(user.getPassword());
       user.setPassword(encryptedPassword);
       User savedUser = userRepository.save(user);
       return UserMapper.toResponseDTO(savedUser);
    }
    

}
