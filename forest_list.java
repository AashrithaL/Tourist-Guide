package com.bignerdranch.android.listdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class forest_list extends AppCompatActivity {

    ListView fl;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        fl = (ListView) findViewById(R.id.fList);

        ArrayAdapter<String> terrainadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,getResources().getStringArray(R.array.Forest));
        fl.setAdapter(terrainadapter);

        fl.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Sundarbans/@22.0181325,88.7264923,9z/data=!3m1!4b1!4m5!3m4!1s0x3a004caac2c7b315:0x4716abcfbb16c93c!8m2!3d21.9497274!4d89.1833304");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Gir+National+Park/@21.1329211,70.7843613,13z/data=!3m1!4b1!4m5!3m4!1s0x3be2bfc278812b53:0x3408d6d983464baf!8m2!3d21.1243054!4d70.8241507");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Mawphlang+Sacred+Grove/@25.4452356,91.7467081,17z/data=!3m1!4b1!4m5!3m4!1s0x37508f4d08fb19cd:0x701f0a600ea4c6a!8m2!3d25.4452356!4d91.7488968");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Amazon+Rainforest/@-3.4653052,-62.2246353,15z/data=!3m1!4b1!4m5!3m4!1s0x91e8605342744385:0x3d3c6dc1394a7fc7!8m2!3d-3.4653053!4d-62.2158805");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
            }
        });

    }
}