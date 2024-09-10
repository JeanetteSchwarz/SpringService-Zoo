package org.example.springservicezoo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ZooRepository extends MongoRepository<Animal, String> {
}
