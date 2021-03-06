package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Flight;

import static org.junit.jupiter.api.Assertions.*;

class FlightManagerWithFewFlightsTest {

    private FlightManager manager = new FlightManager();

    private Flight first = new Flight(1, 265000, "LED", "GOJ", 100);
    private Flight second = new Flight(2, 292500, "AER", "LED", 185);
    private Flight third = new Flight(3, 667000, "DME", "GOJ", 80);
    private Flight forth = new Flight(4, 169000, "DME", "KZN", 95);
    private Flight fifth = new Flight(5, 583600, "DME", "GOJ", 75);
    private Flight sixth = new Flight(6, 543900, "DME", "GOJ", 80);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
    }

    @Test
    void findAllExistFlight() {
        Flight[] actual = manager.findAll("DME", "GOJ");
        Flight[] expected = new Flight[]{sixth, fifth, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findAllNonExistFlight() {
        Flight[] actual = manager.findAll("SIP", "SVX");
        Flight[] expected = new Flight[0];
        assertArrayEquals(expected, actual);
    }
}