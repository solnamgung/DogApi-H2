package com.project.DogAPIs.service;

import com.project.DogAPIs.entity.Dog;

import java.util.List;

public interface DogService {
    public List<Dog> retrieveDogs();
    public List<String> retrieveDogBreed();
    public String retrieveDogBreedById(Long id);
    public List<String> retrieveDogNames();
}
