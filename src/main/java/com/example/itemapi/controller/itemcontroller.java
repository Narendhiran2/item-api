package com.example.itemapi.controller;

import com.example.itemapi.model.item;
import com.example.itemapi.service.itemservice;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class itemcontroller {

    private final itemservice itemService;

    public itemcontroller(itemservice itemService) {
        this.itemService = itemService;
    }

    
    @PostMapping
    public ResponseEntity<item> addItem(@Valid @RequestBody item item) {
        return ResponseEntity.ok(itemService.addItem(item));
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<?> getItem(@PathVariable int id) {
        item item = itemService.getItemById(id);
        if (item == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(item);
         }
}
