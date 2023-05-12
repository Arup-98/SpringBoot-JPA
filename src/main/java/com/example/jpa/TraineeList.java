package com.example.jpa;

import java.util.List;

public class TraineeList {
    List<Trainee> trainee;

    public TraineeList(){

    }
    public TraineeList(List<Trainee>trainee){
        this.trainee=trainee;
    }
    public List<Trainee> getTrainee(){
        return trainee;
    }
    public void setTrainee(List<Trainee>trainee){
        this.trainee=trainee;
    }
}
