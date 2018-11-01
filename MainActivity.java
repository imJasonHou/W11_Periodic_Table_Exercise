package com.example.jason.w11_periodic_table_exercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    Gson gson = new Gson();
    ListView listView;
    ArrayList<Element> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Started");

        listView = findViewById(R.id.lv_main);



        Element newElement = gson.fromJson("elements.json", Element.class);

        //elements = new ArrayList<Element>();

        // Element[] elementArray = gson.fromJson("elements.json", Element.class);

        ArrayAdapter<Element> adapter = new ArrayAdapter<>(this,
                R.layout.layout_listitem, elements);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Element clickedElement = (Element) adapterView.getItemAtPosition(i);
                System.out.println(adapterView.getItemAtPosition(i));
               // Toast.makeText(MainActivity.this, clickedUser.getName() + " does " + clickedUser.getDegree(), Toast.LENGTH_LONG);

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("AtomicNo", clickedElement.getAtomicNumber());
                startActivity(intent);
            }
        });


    }

}
