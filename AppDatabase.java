package com.example.jason.w11_periodic_table_exercise;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Element.class}, version = 2, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ElementDao ElementDao(); // Using DAO to issue queries to the SQLite database


}