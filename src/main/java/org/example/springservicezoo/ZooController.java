package org.example.springservicezoo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

     @GetMapping()
    public List<ApiAnimal> getAnimals() {
        List<Animal> animals = animalService.getZoo();
        return animals.stream()
                .map(animal -> new ApiAnimal(animal.id(), animal.name(), animal.age()))
                .toList();
    }

    @PostMapping()
    public ApiAnimal postAnimal(@RequestBody NewAnimal newAnimal) {
        Animal newAnimal2 = animalService.save(newAnimal);
        return new ApiAnimal(newAnimal2.id(), newAnimal2.name(), newAnimal2.age());
    }
}
