package com.booking.users.dto;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String email;
    private String fullname;
    private String password;
    private String role;

    public String getEmail() {
        return email;
    }

    public String getFullname() {
        return fullname;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    // setters if needed
}
