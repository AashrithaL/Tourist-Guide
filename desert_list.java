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

public class desert_list extends AppCompatActivity {

    ListView dl;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert_list);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        dl = (ListView) findViewById(R.id.desertList);

        ArrayAdapter<String> terrainadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,getResources().getStringArray(R.array.Deserts));
        dl.setAdapter(terrainadapter);

        dl.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Thar+Desert/@26.8918713,69.0026038,7z/data=!4m9!1m2!2m1!1sThar+Desert+%E2%80%93+India%2FPakistan!3m5!1s0x39470bd5c24347d1:0x54f658627a3fb418!8m2!3d27.4694892!4d70.6216794!15sCh5UaGFyIERlc2VydCDigJMgSW5kaWEvUGFraXN0YW5aHCIadGhhciBkZXNlcnQgaW5kaWEgcGFraXN0YW6SAQZkZXNlcnSaASRDaGREU1VoTk1HOW5TMFZKUTBGblNVUlJjV1ZQVHkxM1JSQUI");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Namib+Desert/@-22.1518729,6.6286671,5z/data=!3m1!4b1!4m5!3m4!1s0x1c74f8343ddbf5a1:0xda0fb83c1339ad83!8m2!3d-24.2888714!4d15.2604813");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Atacama+Desert/@-23.8634183,-69.1416039,15z/data=!3m1!4b1!4m5!3m4!1s0x96af46527fef1c47:0x34dbbb7aa8223dc!8m2!3d-23.8634189!4d-69.1328491");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Sahara+Desert/@21.9751844,13.0833388,5z/data=!3m1!4b1!4m5!3m4!1s0x13883b64fb267151:0xd6406bdc582d7390!8m2!3d23.4162027!4d25.66283");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);

                }
            }
        });

    }
}

