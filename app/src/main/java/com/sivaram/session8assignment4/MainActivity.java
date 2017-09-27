package com.sivaram.session8assignment4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Local Variables for GridView And List of Versions Object

    GridView gvImageAndText;
    List<Versions> androidVersionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Type Cast Grid View Which was created in the Activity.
        gvImageAndText = (GridView) findViewById(R.id.gvImageAndText);

        // Initailize Versions Object as Array List.
        androidVersionsList = new ArrayList<>();

        // Retrieve Images from Drawable folder with the image name. and Assign Name to each image loaded
        // This will create Versions Object with Required rows
        androidVersionsList.add(new Versions("GingerBread", R.drawable.gingerbread));
        androidVersionsList.add(new Versions("Honeycomb", R.drawable.honeycomb));
        androidVersionsList.add(new Versions("IceCream", R.drawable.icecreamsandwich));
        androidVersionsList.add(new Versions("JellyBean", R.drawable.jellybean));
        androidVersionsList.add(new Versions("Kitkat", R.drawable.kitkat));
        androidVersionsList.add(new Versions("Lollipop", R.drawable.lollipop));

        // Initialize Custom Adapter which created with Image and text view in it.
        CustomImageTextAdapter customImageTextAdapter = new CustomImageTextAdapter(MainActivity.this,androidVersionsList);

        // Set Custom Adapter to Grid View
        gvImageAndText.setAdapter(customImageTextAdapter);

        // Click on Each image available in the Grid View. Shall display Version Name as Toast
        // from the Versions Collection object
        // of selected Position.
        gvImageAndText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Selected Image : " + androidVersionsList.get(i).getVersionName(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
