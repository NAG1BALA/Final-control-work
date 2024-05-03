package model.animal_class.builder;

import model.animal_class.Animal;

import java.time.LocalDate;

public class AnimalBuilder {

    public Animal build (String name, LocalDate birthdate) {
        Animal animal = new Animal(name, birthdate){

        };
        return animal;
    }

}
