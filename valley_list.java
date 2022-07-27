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

public class valley_list extends AppCompatActivity {

    ListView vl;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valley_list);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        vl = (ListView) findViewById(R.id.ValleyListList);

        ArrayAdapter<String> terrainadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,getResources().getStringArray(R.array.valleys));
        vl.setAdapter(terrainadapter);

        vl.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Valley+of+the+Ten+Peaks/@51.3211523,-116.2155429,15z/data=!3m1!4b1!4m5!3m4!1s0x53775bd70ee1c787:0x1ec3ea1cc4f2ef1f!8m2!3d51.3211532!4d-116.2067881");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Yosemite+Valley,+CA+95389,+USA/@37.7380961,-119.615205,14z/data=!3m1!4b1!4m9!1m2!2m1!1sYosemite+Valley+(United+States)!3m5!1s0x8096f1fe38f263af:0x19213f2e54c9e26e!8m2!3d37.7455701!4d-119.5936038!15sCh9Zb3NlbWl0ZSBWYWxsZXkgKFVuaXRlZCBTdGF0ZXMpkgEIbG9jYWxpdHk");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Kalalau+Valley/@22.1799994,-159.6623659,15z/data=!3m1!4b1!4m5!3m4!1s0x7c06f8bd984e77af:0x25d5c78aa6e5f53c!8m2!3d22.18!4d-159.6536111");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Valle+de+la+Luna/@-22.9238228,-68.3239659,13z/data=!3m1!4b1!4m5!3m4!1s0x96a972ff8dc8582d:0x7ad176d2c4b12f43!8m2!3d-22.9257639!4d-68.2879926");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
            }
        });

    }
}

