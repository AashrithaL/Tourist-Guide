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

public class island_list extends AppCompatActivity {
    ListView il;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_island_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        il = (ListView) findViewById(R.id.iList);

        ArrayAdapter<String> terrainadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,getResources().getStringArray(R.array.Island));
        il.setAdapter(terrainadapter);

        il.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Maldives/@3.1025266,68.7410983,6z/data=!3m1!4b1!4m5!3m4!1s0x24b599bfaafb7bbd:0x414509e181956289!8m2!3d3.202778!4d73.22068");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Bora+Bora/@-16.5044211,-151.7736688,13z/data=!3m1!4b1!4m5!3m4!1s0x76bdbd188a4a98ab:0x160a089e92d5ce61!8m2!3d-16.5004126!4d-151.7414904");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Palawan,+Philippines/@9.9785022,114.7186699,7z/data=!3m1!4b1!4m5!3m4!1s0x33b5bce750b99e45:0xdfc65f6c0c8d3beb!8m2!3d9.8349493!4d118.7383615");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("google.com/maps/place/Santorini/@36.4071334,25.3505906,12z/data=!3m1!4b1!4m5!3m4!1s0x1499ce86adfd9ff7:0xb2a761f740d68afc!8m2!3d36.3931562!4d25.4615092");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
            }
        });

    }
}