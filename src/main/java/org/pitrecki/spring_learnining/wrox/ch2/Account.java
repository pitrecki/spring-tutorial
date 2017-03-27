package org.pitrecki.spring_learnining.wrox.ch2;

import java.time.LocalDate;

/**
 * @author Piotr 'pitrecki' Nowak
 *         Created by Pitrecki on 2017-03-27.
 */
class Account
{
    private Long id;
    private String ownerName;
    private Double balance;
    private LocalDate accessTime;

    public Account() {
    }

    public Account(Long id, String ownerName, Double balance, LocalDate accessTime) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
        this.accessTime = accessTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public LocalDate getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(LocalDate accessTime) {
        this.accessTime = accessTime;
    }
}
