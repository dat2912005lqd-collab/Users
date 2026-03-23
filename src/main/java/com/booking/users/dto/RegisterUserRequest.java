package com.booking.users.dto;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String email;
    private String fullname;
    private String password;
    private String role;
}
