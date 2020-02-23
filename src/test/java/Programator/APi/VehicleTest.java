package Programator.APi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    // TODO napisac test
    void shouldReturnCarsOnly_when_FILTER_CARS_predicate_used() {
        // tworzymy liste vehicli
        List<Vehicle> listToBeFiltered = Arrays.asList(
                new Car(),
                new Car(),
                new Car(),
                new Boat(),
                new Boat(),
                new Boat(),
                new Boat(),
                new Plane(),
                new Plane(),
                new Plane()
        );
        // filtrujemy samochody
        List<Vehicle> filteredList = Vehicle.filteredList(listToBeFiltered, Vehicle.FILTER_CARS);
        // sprawdzamy czy wlasciwa ilosc elementow
        assertEquals(3, filteredList.size());
    }
}