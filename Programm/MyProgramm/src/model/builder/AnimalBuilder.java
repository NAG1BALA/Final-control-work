package model.builder;

import model.animals.Animal;
import model.animals.pets.Cat;
import model.animals.pets.Dog;
import model.animals.pets.Hamster;

import java.time.LocalDate;

public class AnimalBuilder {

    public Animal build(int type, String name, LocalDate birthdate) {
        switch (type) {
            case 1 -> {
                return new Dog(name, birthdate);
            }
            case 2 -> {
                return new Cat(name, birthdate);
            }
            case 3 -> {
                return new Hamster(name, birthdate);
            }
        }
        return null;
    }
}
