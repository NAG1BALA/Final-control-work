package animal_class.pets;

import java.time.LocalDate;

public class Dog  extends Pets {
    public Dog(String name, LocalDate birthdate) {
        super(name, birthdate);
        this.type += ", собака";
    }
}