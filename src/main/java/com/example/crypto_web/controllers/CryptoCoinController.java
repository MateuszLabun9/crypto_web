package com.example.crypto_web.controllers;


import com.example.crypto_web.models.Coin;
import com.example.crypto_web.repository.CoinRepository;
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
    public List <Coin> getAllCryptoCoin () {
        return coinRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Coin> getCoin(@PathVariable Long id){
        return coinRepository.findById(id);
    }
}
