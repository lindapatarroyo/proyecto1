package com.loducode.project1.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.loducode.project1.data.entities.Item;

import java.util.List;

@Dao
public interface ItemDao {
    @Query("SELECT * FROM Item")
    List<Item> getAll();

    @Query("SELECT * FROM Item WHERE itemId = :itemId")
    Item findById(int itemId);

    @Insert
    void insert (Item item);
    @Update
    void update(Item item);
    @Delete
    void delete(Item item);
}
