package com.example.crypto_web.controllers;


import com.example.crypto_web.CryptoCoin;
import com.example.crypto_web.repositories.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/coin/")
public class CryptoCoinController {

    @Autowired
    private CoinRepository coinRepository;

    @GetMapping("/")
    public List <CryptoCoin> getAllCryptoCoin () {
        return coinRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CryptoCoin> getCoin(@PathVariable Long id){
        return coinRepository.findById(id);
    }
}
