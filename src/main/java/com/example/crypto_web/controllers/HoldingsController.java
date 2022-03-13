package com.example.crypto_web.controllers;


import com.example.crypto_web.Holdings;
import com.example.crypto_web.repository.HoldingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/holdings/")
public class HoldingsController {

    @Autowired
    private HoldingsRepository holdingsRepository;

    @GetMapping("/")
    public List<Holdings> getAllHoldings(){
        return holdingsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Holdings> getHoldings(@PathVariable Long id){
        return holdingsRepository.findById(id);
    }


    
}
