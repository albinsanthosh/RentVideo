package com.example.RentVideo.exchanges.request;

import com.example.RentVideo.entity.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    
}