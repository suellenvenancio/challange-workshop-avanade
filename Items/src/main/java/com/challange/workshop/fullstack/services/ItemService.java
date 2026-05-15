package com.challange.workshop.fullstack.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.challange.workshop.fullstack.models.Item;
import com.challange.workshop.fullstack.repositories.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Item salvar(Item item) {
        return itemRepository.save(item);
    }
}