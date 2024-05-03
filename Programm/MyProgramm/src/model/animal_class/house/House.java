package model.animal_class.house;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class House<E extends HouseItem> implements Serializable, Iterable<E> {

    private List<E> animalsInHouse;
    private int oneId = 1; // хочу нумерацию с 1

    public House() {
        animalsInHouse = new ArrayList<>();
    }

    @Override
    public Iterator<E> iterator() {
        return new AnimalIterator<>(animalsInHouse);
    }
}
