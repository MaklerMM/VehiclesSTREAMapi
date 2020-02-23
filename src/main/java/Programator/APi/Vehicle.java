package Programator.APi;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public interface Vehicle {
    public static final Predicate<Vehicle> FILTER_CARS = v -> v instanceof Car;
    public static final Predicate<Vehicle> FILTER_BOAT = v -> v instanceof Boat;
    public static final Predicate<Vehicle> FILTER_PLANES = v -> v instanceof Plane;

    String start();

    static List<Vehicle> filteredList (List<Vehicle> list, Predicate<Vehicle> predicate) {
        return list.stream()
                .filter(predicate)
                .peek(v-> System.out.println(v))
                .collect(Collectors.toList());
    }
}
