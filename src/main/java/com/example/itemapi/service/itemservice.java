package com.example.itemapi.service;

import com.example.itemapi.model.item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class itemservice {

    private List<item> items = new ArrayList<>();
    private int idCounter = 1;

    public item addItem(item item) {
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    public item getItemById(int id) {
        return items.stream()
                .filter(i -> i.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
