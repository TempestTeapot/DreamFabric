package com.tempestteapot.dreamfabric;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.layout.simple_list_item_1;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;

    Fabric linenFabric = new Fabric();
    Fabric organzaFabric = new Fabric();
    String[] fabricArray = new String[2];
    String[] fabricColorArray = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linenFabric.fabricName = "Linen";
        linenFabric.fabricColor = "Blue";
        linenFabric.fabricSize = "2 yards";
        linenFabric.fabricContent = "linen";
        linenFabric.fabricImage = R.mipmap.bluelinen_round;

        organzaFabric.fabricName = "Organza";
        organzaFabric.fabricColor = "Green";
        organzaFabric.fabricSize = "2 yards";
        organzaFabric.fabricContent = "polyester";
        organzaFabric.fabricImage = R.mipmap.green_organza_round;

        fabricArray[0]=linenFabric.fabricName;
        fabricArray[1]=organzaFabric.fabricName;

        fabricColorArray[0]=linenFabric.fabricColor;
        fabricColorArray[1]=organzaFabric.fabricColor;

        ArrayAdapter<Object> fabricAdapter = new ArrayAdapter<Object>(
                getBaseContext(),
                simple_list_item_1,
                fabricArray);

//        ArrayAdapter<Objects> fabricAdapter = new ArrayAdapter<Objects>(getBaseContext(), android.R.layout.simple_list_item_1,fabric_list);
//        ArrayAdapter<String> fabricAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1,fabric.class.hashCode("Linen"));
        listView = (ListView) findViewById(R.id.fabricList);
        listView.setAdapter(fabricAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        System.out.println(fabricArray[i]);
        System.out.println(fabricColorArray[i]);

        Intent moveDetailIntent = new Intent(getBaseContext(), FabricDetailActivity.class);
        moveDetailIntent.putExtra("fabricName", (fabricArray[i]));
        moveDetailIntent.putExtra("fabricColor", (fabricColorArray[i]));
        startActivity(moveDetailIntent);

    }
}
