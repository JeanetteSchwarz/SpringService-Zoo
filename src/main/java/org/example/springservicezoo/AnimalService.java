package org.example.springservicezoo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final ZooRepository zooRepository;


    public List<Animal> getZoo(){
        return zooRepository.findAll();
    }

    public Animal postAnimal(Animal newAnimal){
        Animal animal = new Animal(UUID.randomUUID().toString(), newAnimal.name(),newAnimal.age(), newAnimal.purchasePrice());
        return zooRepository.save(animal);

    }
}
