package com.booking.users.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.booking.users.dto.RegisterUserRequest;
import com.booking.users.dto.UserResponseDTO;
import com.booking.users.entity.User;
import com.booking.users.repository.UserRepository;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public UserResponseDTO registerUser(RegisterUserRequest request) {
        User user = new User(request.getFullname(), request.getEmail(), request.getPassword(), request.getRole());
        userRepository.save(user);
        UserResponseDTO response = new UserResponseDTO();
        response.setId(String.valueOf(user.getId()));
        response.setEmail(user.getEmail());
        response.setFullname(user.getFullname());
        response.setRole(user.getRole());
        return response;
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
