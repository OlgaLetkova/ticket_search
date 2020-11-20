package ru.netology.repository;

import ru.netology.domain.Flight;

public class FlightRepository {
    private Flight[] items = new Flight[0];

    public void add(Flight item) {
        int length = items.length + 1;
        Flight[] tmp = new Flight[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        Flight[] tmp = new Flight[length];
        int index = 0;
        for (Flight item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public Flight[] getAll() {
        return items;
    }
}
