package org.example.springservicezoo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

@RestController
@RequestMapping("api/zooshop")
@AllArgsConstructor
public class ZooController {

    private final ZooRepository zooRepository;

    private final AnimalService animalService;

    @GetMapping()
    public List<Animal> getZoo(){
        return animalService.getZoo();
    }

    /*@GetMapping
    public List<ApiAnimal> getAnimals(){
        List<Animal> animals = animalService.getZoo();
        return animals.stream() Stream Animal;
        .map(animal -> new ApiAnimal(animal.id(), animal.name(), animal.age())) Stream<ApiAnimal>
        .toList
    }*/

    @PostMapping()
    public Animal postAnimal(@RequestBody  Animal animal){
        return animalService.postAnimal(animal);

    }
}
