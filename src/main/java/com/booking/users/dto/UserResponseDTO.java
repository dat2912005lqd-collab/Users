package com.booking.users.dto;

import lombok.Data;

@Data
public class UserResponseDTO {
    public UserResponseDTO(Long id2, String email2, String fullname2, String role2) {
        this.id = id2;
        this.email = email2;
        this.fullname = fullname2;
        this.role = role2;
    }
    private Long id;
    private String email;
    private String fullname;
    private String role;
}
