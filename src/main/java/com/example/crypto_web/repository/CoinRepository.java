package com.example.crypto_web.repository;

import com.example.crypto_web.models.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin, Long> {
}
