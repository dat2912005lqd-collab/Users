package com.booking.users.dto;

public class RegisterUserRequest {
    private String email;
    private String fullname;
    private String password;
    private String role;
    private String phoneNumber;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }
    // setters if needed
}
