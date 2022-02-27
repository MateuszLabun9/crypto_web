package com.example.crypto_web.repositories;

import com.example.crypto_web.Holdings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoldingsRepository extends JpaRepository<Holdings, Long> {
}
