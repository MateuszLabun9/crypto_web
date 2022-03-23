package com.example.crypto_web.models;


import com.example.crypto_web.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "holdings")
public class Holdings {

    private @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    Long id;

    @Column(name = "amount")
    private Float amount;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "coin_id", referencedColumnName = "code_id")
    private Coin coins;

    public Holdings() {

    }


    public Holdings(Long id, String name, Float amount) {
        this.id = id;
        this.amount = amount;
    }

    public Coin getCoins() {
        return coins;
    }

    public void setCoins(Coin coins) {
        this.coins = coins;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
