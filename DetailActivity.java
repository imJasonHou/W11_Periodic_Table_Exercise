package com.example.jason.w11_periodic_table_exercise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;

public class DetailActivity extends AppCompatActivity {

    TextView AtomicNo;
    TextView ElementName;
    TextView Type;
    TextView Discovery;
    Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.element_main);

        Element newElement = gson.fromJson("elements.json", Element.class);

        Intent intent = getIntent();
        int id = intent.getIntExtra("AtomicNo", -1);
        newElement.getAtomicNumber();


        AtomicNo = findViewById(R.id.AtomicNo);
        ElementName = findViewById(R.id.ElementName);
        Type = findViewById(R.id.type);
        Discovery = findViewById(R.id.Discovery);

        AtomicNo.setText(newElement.getAtomicNumber());
        ElementName.setText(newElement.getName());
        Type.setText(newElement.getType());
        Discovery.setText(newElement.getYearOfDiscovery());
    }
}
