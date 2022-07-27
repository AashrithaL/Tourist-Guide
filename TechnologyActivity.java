package com.bignerdranch.android.listdemo;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.bignerdranch.android.listdemo.databinding.ActivityTechnologyBinding;

public class TechnologyActivity extends AppCompatActivity {


    ActivityTechnologyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTechnologyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle bundle = getIntent().getExtras();

        String[] tech_picname = {"Data Mining", "Data Science", "Data Visualization", "DBMS", "Network Security", "Computer Programming"};
        int [] picimages = {R.mipmap.technology_datamining,R.mipmap.technology_datascience,R.mipmap.technology_datavisualization,R.mipmap.technology_dbms,R.mipmap.technology_networksecurity, R.mipmap.technology_programming};
        GridAdapter naturegridAdapter = new GridAdapter(TechnologyActivity.this, tech_picname,picimages);
        binding.gridView3.setAdapter(naturegridAdapter);
        binding.gridView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(TechnologyActivity.this,"You Clicked on "+ tech_picname[position],Toast.LENGTH_SHORT).show();
                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Data+Mining+Training+in+Phagwara+%7C+E2matrix/@31.221294,75.6987976,12z/data=!4m9!1m2!2m1!1sData+Mining!3m5!1s0x391af4e6fe61c355:0xdc445be60ebf4e01!8m2!3d31.221313!4d75.768838!15sCgtEYXRhIE1pbmluZ5IBG3NvZnR3YXJlX3RyYWluaW5nX2luc3RpdHV0ZQ");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Data+Science+Training+in+Bangalore,Big+Data+Hadoop,Python+training+Institute+near+me/@12.9131927,77.6102474,17z/data=!3m1!4b1!4m5!3m4!1s0x3bae151a73533297:0xef4da1cf3be828b3!8m2!3d12.9131927!4d77.6147321");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Ariviga+Technologies+Private+Ltd./@12.9131925,77.6036813,15z/data=!4m9!1m2!2m1!1sData+Visualization!3m5!1s0x3bae14babbea81f3:0xb4a9cb16191c9d!8m2!3d12.919724!4d77.6092821!15sChJEYXRhIFZpc3VhbGl6YXRpb26SARBzb2Z0d2FyZV9jb21wYW55");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Crystalspiders-SQL+Server+and+DBA+Training+in+Bangalore/@12.9131457,77.542395,12z/data=!4m9!1m2!2m1!1sDatabase+management+training!3m5!1s0x3bae13157261755d:0x210455e0d83caa76!8m2!3d12.958552!4d77.7010296!15sChxEYXRhYmFzZSBtYW5hZ2VtZW50IHRyYWluaW5nWh4iHGRhdGFiYXNlIG1hbmFnZW1lbnQgdHJhaW5pbmeSARtzb2Z0d2FyZV90cmFpbmluZ19pbnN0aXR1dGWaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTnhYemxpVTBaUkVBRQ");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==4) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Indian+Cyber+Security+Solutions+(Best+Ethical+Hacking+Training,+Machine+Learning+course,+Python+%26+CCNA+training+in+Bangalore)/@12.9130898,77.5423945,12z/data=!4m9!1m2!2m1!1sNetwork+Security+training+!3m5!1s0x3bae1307705adb37:0x38cb6f50fe60f158!8m2!3d12.9681275!4d77.6428248!15sChlOZXR3b3JrIFNlY3VyaXR5IHRyYWluaW5nWhsiGW5ldHdvcmsgc2VjdXJpdHkgdHJhaW5pbmeSARljb21wdXRlcl9zZWN1cml0eV9zZXJ2aWNlmgEjQ2haRFNVaE5NRzluUzBWSlEwRm5TVU41TWpSSWQxRlJFQUU");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==5) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/NICT+Computer+Education+in+Jayanagar/@12.9130525,77.5423942,12z/data=!4m9!1m2!2m1!1sComputer+Programming+training!3m5!1s0x3bae159f71d90405:0x5591c56a7ebb50c2!8m2!3d12.9261691!4d77.5845477!15sCh1Db21wdXRlciBQcm9ncmFtbWluZyB0cmFpbmluZ1ofIh1jb21wdXRlciBwcm9ncmFtbWluZyB0cmFpbmluZ5IBGGNvbXB1dGVyX3RyYWluaW5nX3NjaG9vbJoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VSTk1IQTJSbVYzRUFF");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
            }
        });
    }
}