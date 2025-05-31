package com.medicalsystem.controller;

import com.medicalsystem.dto.LoginRequest;
import com.medicalsystem.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}