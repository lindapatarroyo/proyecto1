package com.loducode.project1.repository;

import com.loducode.project1.data.entities.Item;

import java.util.List;

public interface ItemRepository {
    List<Item> getAllItems();
    Item findItemById(int itemId);
    void insertItem(Item item);
    void updateItem(Item item);
    void deleteItem(Item item);
}
