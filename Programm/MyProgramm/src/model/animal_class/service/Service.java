package model.animal_class.service;

import model.animal_class.Animal;
import model.animal_class.builder.AnimalBuilder;
import model.animal_class.house.House;

public class Service {

    private House<Animal> house;
    private AnimalBuilder builder;
    private Writable writable;

    public Service() {
        house = new House();
        builder = new AnimalBuilder();
    }


}
