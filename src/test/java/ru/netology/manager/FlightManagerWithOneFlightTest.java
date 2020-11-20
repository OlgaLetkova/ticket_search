package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Flight;

import static org.junit.jupiter.api.Assertions.*;

class FlightManagerWithOneFlightTest {

    private FlightManager manager = new FlightManager();

    private Flight first = new Flight(1, 265000, "LED", "GOJ", 100);

    @Test
    void findAll() {
        manager.add(first);
        Flight[] actual = manager.findAll("LED", "GOJ");
        Flight[] expected = new Flight[]{first};
        assertArrayEquals(expected, actual);
    }
}