package com.booking.users.dto;

public class UserResponseDTO {
    public UserResponseDTO(Long id, String email, String fullname, String role) {
        this.id = id;
        this.email = email;
        this.fullname = fullname;
        this.role = role;
    }
    public UserResponseDTO(Long id2, String email2, String fullname2, String role2, String phoneNumber2) {
        this.id = id2;
        this.email = email2;
        this.fullname = fullname2;
        this.role = role2;
        this.phoneNumber = phoneNumber2;
    }
    private Long id;
    private String email;
    private String fullname;
    private String role;
    private String phoneNumber;
}
