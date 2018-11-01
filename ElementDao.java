package com.example.jason.w11_periodic_table_exercise;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao // A mapping of SQL queries to functions. You call the methods from DAO in your MainActivity
public interface ElementDao {
    @Query("SELECT * FROM element")
    List<Element> getAll();

    @Insert
    void insertAll(Element... elements);

    @Query("DELETE FROM element")
    void deleteAll();

    @Delete
    public void deleteElements(Element... elements);
}
