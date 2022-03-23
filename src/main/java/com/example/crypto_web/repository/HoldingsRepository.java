package com.example.crypto_web.repository;

import com.example.crypto_web.models.Holdings;
import com.example.crypto_web.models.User;
import com.example.crypto_web.payload.response.HoldingsResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HoldingsRepository extends JpaRepository<Holdings, Long> {


    List<Holdings> findByUser(Optional<User> user);

    List<Holdings> findAllByUser(User user);


    @Query("SELECT new com.example.crypto_web.payload.response.HoldingsResponse(holdings.id, users.id, holdings.amount, coins.code, history.price, history.date, coins.name) FROM CoinHistory history LEFT JOIN history.coins coins LEFT JOIN history.coins.holdingsList holdings LEFT JOIN holdings.user users WHERE users.username = :#{#username} AND history.date=(SELECT MAX(b.date) FROM CoinHistory b where b.coins = history.coins)")
    public List<HoldingsResponse>getAllHoldings( @Param("username") String username);

}
