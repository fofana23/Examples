package com.fofana23.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "number",
        "name",
        "credit",
        "balance",
        "holder"
})
public class Account {

    @JsonProperty("number")
    private Integer number;
    @JsonProperty("name")
    private String name;
    @JsonProperty("credit")
    private Boolean credit;
    @JsonProperty("balance")
    private Double balance;
    @JsonProperty("holder")
    private Integer holder;

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("credit")
    public Boolean getCredit() {
        return credit;
    }

    @JsonProperty("credit")
    public void setCredit(Boolean credit) {
        this.credit = credit;
    }

    @JsonProperty("balance")
    public Double getBalance() {
        return balance;
    }

    @JsonProperty("balance")
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @JsonProperty("holder")
    public Integer getHolder() {
        return holder;
    }

    @JsonProperty("holder")
    public void setHolder(Integer holder) {
        this.holder = holder;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", balance=" + balance +
                ", holder=" + holder +
                '}';
    }
}