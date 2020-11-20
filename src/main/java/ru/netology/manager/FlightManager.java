package ru.netology.manager;

import ru.netology.domain.Flight;
import ru.netology.repository.FlightRepository;

import java.util.Arrays;

public class FlightManager {
    private FlightRepository repository;

    public FlightManager() {
        this.repository = new FlightRepository();
    }

    public void add(Flight flight){this.repository.add(flight);}

    public Flight[] findAll(String from, String to) {
        Flight[] items = this.repository.getAll();
        Flight[] result = new Flight[items.length];
        int index = 0;
        for (Flight item : items) {
            if (from == item.getFrom() && to == item.getTo()) {
                result[index] = item;
                index++;
            }
        }
        Flight[] ticket = new Flight[index];
        for (int i = 0; i < index; i++) {
           ticket[i] =result[i];
        }
        Arrays.sort(ticket);
        return ticket;
    }
}
