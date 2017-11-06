package com.tempestteapot.dreamfabric;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] fabric = new String[] {"Velvet", "Organza", "Cotton", "Knit", "Sweatshirt", "Tulle", "Linen", "Cotton Blend", "Corduroy"};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.fabricList);

        ArrayAdapter<String> fabricAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1,fabric);

        listView.setAdapter(fabricAdapter);

    }
}
