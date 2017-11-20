package com.tempestteapot.dreamfabric;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FabricDetailActivity extends AppCompatActivity {

    ImageView fabricPicture;
    TextView fabricNameTextView;
    TextView fabricColorTextView;
    TextView fabricSizeTextView;
    TextView fabricContentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabric_detail);

        fabricPicture = (ImageView) findViewById(R.id.fabricPicture);
        fabricNameTextView = (TextView) findViewById(R.id.fabricNameTextView);
        fabricColorTextView = (TextView) findViewById(R.id.fabricColorTextView);
        fabricSizeTextView = (TextView) findViewById(R.id.fabricSizeTextView);
        fabricContentTextView = (TextView) findViewById(R.id.fabricContentTextView);



        //fabric name
        String fabricName = (String) getIntent().getExtras().get("fabricName");
        fabricNameTextView.setText(fabricName);

        /*//fabric image

        if (fabricName.equals("Velvet")){
            fabricPicture.setImageResource(R.mipmap.bluelinen_round);
        }
        if (fabricName.equals("Organza")){
            fabricPicture.setImageResource(R.mipmap.green_organza_round);
        }
*/
        //fabric color
        String fabricColor = (String) getIntent().getExtras().get("fabricColor");
        fabricColorTextView.setText(fabricColor);

    //fabric size
        String fabricSize = (String) getIntent().getExtras().get("fabricSize");
        fabricSizeTextView.setText(fabricSize);

    //fabric content
        String fabricContent = (String) getIntent().getExtras().get("fabricContent");
        fabricContentTextView.setText(fabricContent);
    }
}
