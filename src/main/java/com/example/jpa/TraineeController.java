package com.example.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trainee")
public class TraineeController {

    @Autowired
    TraineeService traineeService;

    @Autowired
    TraineeRepository traineeRepository;

    @GetMapping("/detail")
    public Optional<Trainee> detail(@RequestParam long traineeId){
        return traineeRepository.findById(traineeId);
    }

    @GetMapping("/getAllAccount")
    public List<Trainee> getAllAccount(){
        return (List<Trainee>) traineeRepository.findAll();
    }
    @PostMapping("/new")
    public Trainee newTrainee(@RequestBody Trainee trainee){
         return traineeService.saveTrainee(trainee);
    }

    @PutMapping
    ResponseEntity Account(@RequestBody Trainee trainee){
        traineeService.update(trainee);
        return new ResponseEntity<>(trainee, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    void deletetrainee(@PathVariable long id) {
        traineeService.deletetrainee(id);
    }

}
