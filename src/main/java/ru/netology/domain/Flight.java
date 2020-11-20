package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Flight implements Comparable {
    private int id;
    private int price; // with kopecks
    private String from;
    private String to;
    private int travelTime; // in minutes

    public int compareTo(Object o) {
        Flight ticket = (Flight) o;
        return price - ticket.price;
    }
}
