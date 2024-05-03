package model.animal_class.pets;

import java.time.LocalDate;

public class Cat  extends Pets {
    public Cat(String name, LocalDate birthdate) {
        super(name, birthdate);
        this.type += ", кошка";
    }
}