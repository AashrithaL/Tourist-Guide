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
import android.widget.TextView;
import android.widget.Toast;

public class hill_list extends AppCompatActivity {

    ListView hl;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hill_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        hl = (ListView) findViewById(R.id.HillStationList);

        ArrayAdapter<String> terrainadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,getResources().getStringArray(R.array.hillstations));
        hl.setAdapter(terrainadapter);

        hl.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Savandurga+Hill/@12.8996494,77.2656556,13z/data=!3m1!4b1!4m5!3m4!1s0x3bae3664f8d60951:0x7d23470068713f8f!8m2!3d12.9205893!4d77.2944334");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Ramdevara+Hill/@12.6294646,77.1973887,11z/data=!4m9!1m2!2m1!1sramanagara+hills!3m5!1s0x3bae4ebc353eb8f9:0x6b8c71f64ef9cb6d!8m2!3d12.753117!4d77.3026459!15sChByYW1hbmFnYXJhIGhpbGxzWhIiEHJhbWFuYWdhcmEgaGlsbHOSAQRwZWFrmgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVU5WTFhKdFJXbEJSUkFC");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Antargange+Cave+Trek+Point/@12.6288432,76.7769792,9z/data=!4m9!1m2!2m1!1shill+station+near+Antara+Gange,+Vibhuthipura,+Karnataka!3m5!1s0x3badfa68bdebf7f3:0x28192e5a7887d228!8m2!3d13.1415467!4d78.1048543!15sCjdoaWxsIHN0YXRpb24gbmVhciBBbnRhcmEgR2FuZ2UsIFZpYmh1dGhpcHVyYSwgS2FybmF0YWthWjciNWhpbGwgc3RhdGlvbiBuZWFyIGFudGFyYSBnYW5nZSB2aWJodXRoaXB1cmEga2FybmF0YWthkgEMaGlsbF9zdGF0aW9umgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVVJSY2kxMVNXcFJSUkFC");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Makali+Durga+Hills/@13.4335494,77.5001151,17z/data=!3m1!4b1!4m5!3m4!1s0x3bb1c386deed712f:0xa517a38d344c6a07!8m2!3d13.4335494!4d77.5023038");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }



            }
        });

    }
}