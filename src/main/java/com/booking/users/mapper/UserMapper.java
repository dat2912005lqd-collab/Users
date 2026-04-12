package com.booking.users.mapper;
import com.booking.users.dto.UserResponseDTO;
import com.booking.users.entity.User;
import com.booking.users.dto.RegisterUserRequest;
public class UserMapper {
    public static User toEntity(RegisterUserRequest request) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFullname(request.getFullname());
        user.setRole(request.getRole());
        user.setPhoneNumber(request.getPhoneNumber());
        return user;
    }

    public static UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(
            user.getId(),
            user.getEmail(),
            user.getFullname(),
            user.getRole(),
            user.getPhoneNumber()
        );
    }

}
