package com.example.crypto_web.controllers;

import com.example.crypto_web.models.Holdings;
import com.example.crypto_web.models.User;
import com.example.crypto_web.repository.HoldingsRepository;
import com.example.crypto_web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/wallet/")
public class UserController {

    @Autowired
    private HoldingsRepository holdingsRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<Holdings> getAllHoldings() {
        User user = userRepository.findById(1L).get();
        return user.getHoldingsList();
    }


}
