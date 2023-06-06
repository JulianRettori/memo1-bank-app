package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String type;
    private double amount;
    private Long cbu;
    public Transaction(String type, double amount, Long cbu) {
        this.type = type;
        this.amount = amount;
        this.cbu = cbu;
    }

    public Transaction() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Long getCbu() {
        return cbu;
    }
    public Double getAmount() {
        return amount;
    }

    public String getType() {return type;}

}
