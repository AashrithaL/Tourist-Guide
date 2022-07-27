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

public class volcano_list extends AppCompatActivity {

    ListView vol;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volcano_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        vol = (ListView) findViewById(R.id.vList);

        ArrayAdapter<String> terrainadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,getResources().getStringArray(R.array.Volcanoes
        ));
        vol.setAdapter(terrainadapter);

        vol.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Mount+Vesuvius/@40.8223822,14.420151,15z/data=!3m1!4b1!4m5!3m4!1s0x133ba508f1413feb:0x9cbfa7aa9376793d!8m2!3d40.822383!4d14.4289058");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Krakatoa/@-6.1021173,105.4142325,15z/data=!3m1!4b1!4m5!3m4!1s0x2e415e18b8f2e3ff:0x9e495f8e33b912dc!8m2!3d-6.1021175!4d105.4229873");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("www.google.com/maps/place/Mt+St+Helens/@46.1913997,-122.2043056,15z/data=!3m1!4b1!4m5!3m4!1s0x54969956568a2691:0x69ddb4f4b6cf94c7!8m2!3d46.1914006!4d-122.1955508");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Mt+Pinatubo/@15.1428764,120.3408017,15z/data=!3m1!4b1!4m5!3m4!1s0x33968f671dda71cd:0x608b6fdf07e78094!8m2!3d15.1428768!4d120.3495565");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

            }
        });

    }
}