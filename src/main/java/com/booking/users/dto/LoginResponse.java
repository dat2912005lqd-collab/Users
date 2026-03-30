package com.booking.users.dto;
import com.booking.users.entity.User;
public class LoginResponse {
    private String token;
    private User user;
    public LoginResponse(String token, User user) {
        this.token = token;
        this.user = user;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
}
