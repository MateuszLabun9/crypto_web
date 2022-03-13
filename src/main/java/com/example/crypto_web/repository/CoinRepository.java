package com.example.crypto_web.repository;

import com.example.crypto_web.CryptoCoin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<CryptoCoin, Long> {
}
