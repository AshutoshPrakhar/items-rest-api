package com.assignment.controller;

import com.assignment.service.ItemService;
import com.assignment.model.ItemModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService;
    public ItemController(ItemService itemService){
        this.itemService = itemService;
    }

    @PostMapping("/addItem")
    public ResponseEntity<ItemModel> addItem(@RequestBody ItemModel item){
        return ResponseEntity.status(201).body(itemService.addItem(item));
    }


    @GetMapping("/{id}")
    public ResponseEntity<ItemModel> getItem(@PathVariable int id) {
        return ResponseEntity.ok(itemService.getItem(id));
    }
}
