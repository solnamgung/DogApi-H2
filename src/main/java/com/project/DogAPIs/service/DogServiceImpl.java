package com.project.DogAPIs.service;

import com.project.DogAPIs.entity.Dog;
import com.project.DogAPIs.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//that will actually implement the DogService
@Service
public class DogServiceImpl implements DogService{

    @Autowired
    DogRepository dogRepository;


    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.findAllBreed();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        /**
         *
         The ofNullable() method is used to get an instance of the Optional class with a specified value.
         If the value is null , then an empty Optional object is returned.
         * For the orElseThrow method, a supplier function that returns an Exception object is passed as an argument.
         *  */
        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findAllName();
    }
}
