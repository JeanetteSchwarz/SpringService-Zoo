package org.example.springservicezoo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final ZooRepository zooRepository;


    public List<Animal> getZoo(){
        return zooRepository.findAll();
    }

    public Animal save(NewAnimal newAnimal){
        Animal newAnimal2 = new Animal(UUID.randomUUID().toString(), newAnimal.name(),newAnimal.age(), 0);
        return zooRepository.save(newAnimal2);

    }
}
