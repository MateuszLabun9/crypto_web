package com.example.crypto_web.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "coin_history")
public class CoinHistory {

    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "price")
    private Long price;

    @Column(name = "date")
    private Date date;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "coin_id", referencedColumnName = "code_id")
    private Coin coins;

    public Coin getCoins() {
        return coins;
    }

    public void setCoins(Coin coins) {
        this.coins = coins;
    }

    public CoinHistory(Long id, Long price, Date date) {
        this.id = id;
        this.price = price;
        this.date = date;
    }

    public CoinHistory() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
