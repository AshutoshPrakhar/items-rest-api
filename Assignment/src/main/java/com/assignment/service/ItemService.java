package com.assignment.service;

import com.assignment.exceptions.ItemNotFoundException;
import com.assignment.model.ItemModel;
import com.assignment.repository.ItemRepo;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepo itemRepo;
    public ItemService(ItemRepo itemRepo){
        this.itemRepo = itemRepo;
    }


    public ItemModel addItem(ItemModel item){
        if(item.getName() == null || item.getName().trim().isEmpty()){
            throw  new IllegalArgumentException("Item name is required!");
        }
        return itemRepo.save(item);
    }
    public ItemModel getItem(int id){
        return itemRepo.findById(id)
                .orElseThrow(() -> new ItemNotFoundException("Item not found with the id: " + id));
    }
}
