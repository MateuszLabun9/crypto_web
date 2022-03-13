package com.example.crypto_web.repository;

import com.example.crypto_web.models.ERole;
import com.example.crypto_web.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);

}
