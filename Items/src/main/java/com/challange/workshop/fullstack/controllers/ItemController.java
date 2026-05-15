package com.challange.workshop.fullstack.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.challange.workshop.fullstack.models.Item;
import com.challange.workshop.fullstack.services.ItemService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        System.out.println("RECEBIDO:");
        System.out.println("NAME: " + item.getName());
        System.out.println("CATEGORY: " + item.getCategory());
        System.out.println("QUANTITY: " + item.getQuantity());
    	
        return itemService.salvar(item);
    }
}