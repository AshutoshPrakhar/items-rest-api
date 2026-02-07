package com.assignment.repository;

import com.assignment.model.ItemModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ItemRepo {
    private final List<ItemModel> items = new ArrayList<>();
    private int nextId = 1;
    public ItemModel save(ItemModel item){
        item.setId(nextId++);
        items.add(item);
        return item;
    }
    public Optional<ItemModel> findById(int id){
        for(ItemModel item : items){
            if(item.getId() == id){
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
}
