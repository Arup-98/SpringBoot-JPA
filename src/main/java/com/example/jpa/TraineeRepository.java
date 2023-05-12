package com.example.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TraineeRepository extends CrudRepository<Trainee, Long> {
    Trainee findBySecondName(String lastName);
    Trainee findByTraineeId(long id);
//    Iterable<Trainee> findAll();
}
