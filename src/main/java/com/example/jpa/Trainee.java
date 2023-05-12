package com.example.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Trainee {
    @Id
    @GeneratedValue
    @Column(name= "trainee_name")
    private long traineeId;
    private String firstName;
    private String secondName;

    @Column(nullable = true)
    private Long balance;

    public Trainee(){

    }

    public Trainee(String firstName,String secondName){
        this.firstName=firstName;
        this.secondName=secondName;
    }

    public Trainee(long traineeId,String firstName,String secondName){
        this.traineeId=traineeId;
        this.firstName=firstName;
        this.secondName=secondName;
    }

    public long getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(long traineeId) {
        this.traineeId = traineeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
