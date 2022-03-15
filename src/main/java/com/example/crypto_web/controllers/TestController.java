package com.example.crypto_web.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {


    @GetMapping("/all")
    public String allAccess(){
        return "Public Content";
    }

    @PreAuthorize("hasAuthority('ROLE_USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    @GetMapping("/user")
    public String userAccess(){
        return "User Content";
    }

    @GetMapping("/mod")
    @PreAuthorize("hasAuthority('ROLE_MODERATOR')")
    public String modAccess(){
        return "Moderator Access";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess(){
        return "Admin Access";
    }

}
