package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraineeService {
    @Autowired
    TraineeRepository traineeRepository;

    public Trainee findById(long id){
        return traineeRepository.findByTraineeId(id);
    }

    public Trainee saveTrainee(Trainee trainee){
        return traineeRepository.save(trainee);
    }

    public void deletetrainee(Long id){
       traineeRepository.deleteById(id);
    }

    public void update(Trainee trainee) {
        traineeRepository.save(trainee);
    }
}
