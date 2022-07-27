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

public class beach_list extends AppCompatActivity {

    ListView bl;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        bl = (ListView) findViewById(R.id.BeachList);

        ArrayAdapter<String> terrainadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,getResources().getStringArray(R.array.beach));
        bl.setAdapter(terrainadapter);

        bl.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Om+Beach/@14.5188271,74.3206993,17z/data=!3m1!4b1!4m5!3m4!1s0x3bbe8218126fad05:0x294f4f7ab4235873!8m2!3d14.5192405!4d74.3230039");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Panambur+Beach/@12.9537725,74.7834525,14z/data=!3m1!4b1!4m5!3m4!1s0x3ba351cb1e247f19:0x8cb26c939e3fe4ad!8m2!3d12.9530213!4d74.8011783");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Kudle+Beach+Rd,+Gokarna,+Karnataka+581326/@14.5432369,74.3149471,17z/data=!3m1!4b1!4m5!3m4!1s0x3bbe822fa74d91f3:0xc58c2b70a10db922!8m2!3d14.5432369!4d74.3171358");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Paradise+Beach/@14.518011,74.3352522,17z/data=!3m1!4b1!4m5!3m4!1s0x3bbe826afd3def59:0x2fb6c147bc7efaeb!8m2!3d14.5180583!4d74.3374396");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
            }
        });

    }
}