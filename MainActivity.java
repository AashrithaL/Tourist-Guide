package com.bignerdranch.android.listdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lvTerrain;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        lvTerrain = (ListView) findViewById(R.id.MenuTerrains);

        ArrayAdapter<String> terrainadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,getResources().getStringArray(R.array.terrains));
        lvTerrain.setAdapter(terrainadapter);

        lvTerrain.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                if(position==0) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("TerrainName", lvTerrain.getItemAtPosition(position).toString());
                    startActivity(intent);
                }
                if(position==1){
                    Intent history_intent = new Intent(MainActivity.this, HistoricalActivity.class);
                    history_intent.putExtra("TerrainName", lvTerrain.getItemAtPosition(position).toString());
                    startActivity(history_intent);
                }
                if(position==2) {
                    Intent tribe_intent = new Intent(MainActivity.this, TribalActivity.class);
                    tribe_intent.putExtra("TerrainName", lvTerrain.getItemAtPosition(position).toString());
                    startActivity(tribe_intent);
                }
                if(position==3) {
                    Intent tech_intent = new Intent(MainActivity.this, TechnologyActivity.class);
                    tech_intent.putExtra("TerrainName", lvTerrain.getItemAtPosition(position).toString());
                    startActivity(tech_intent);
                }

                }
        });

    }
}