package com.example.crypto_web.controllers;


import com.example.crypto_web.models.Holdings;
import com.example.crypto_web.models.User;
import com.example.crypto_web.payload.response.HoldingsResponse;
import com.example.crypto_web.repository.HoldingsRepository;
import com.example.crypto_web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/holdings/")
public class HoldingsController {

    @Autowired
    private HoldingsRepository holdingsRepository;

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/")
    public List<HoldingsResponse> getHoldings() {
        String username;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        username = authentication.getName();

        return holdingsRepository.getAllHoldings(username);


        //Optional<User> user = userRepository.findByUsername(username);
        //return holdingsRepository.findByUser(user);
    }

    @GetMapping("/{id}")
    public Optional<Holdings> getHoldings(@PathVariable Long id) {
        return holdingsRepository.findById(id);
    }


}
