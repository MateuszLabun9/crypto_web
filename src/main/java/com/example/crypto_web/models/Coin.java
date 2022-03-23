package com.example.crypto_web.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "coin")
public class Coin {

    private @Id
    @GeneratedValue
    @Column(name = "code_id")
    String code;

    @Column(name = "name")
    private String name;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "coins", cascade = CascadeType.ALL)
    private Set<CoinHistory> coinHistories = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "coins", cascade = CascadeType.ALL)
    private List<Holdings> holdingsList;

    public Coin(String coinName, String code, List<Holdings> holdingsList) {
        this.code = code;
        this.name = coinName;
        this.holdingsList = holdingsList;
    }

    public Coin() {

    }


    public List<Holdings> getHoldingsList() {
        return holdingsList;
    }

    public void setHoldingsList(List<Holdings> holdingsList) {
        this.holdingsList = holdingsList;
    }

    public Coin(List<Holdings> holdingsList) {
        this.holdingsList = holdingsList;
    }


    public Set<CoinHistory> getCoinHistories() {
        return coinHistories;
    }

    public void setCoinHistories(Set<CoinHistory> coinHistories) {
        this.coinHistories = coinHistories;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
