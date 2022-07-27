package com.bignerdranch.android.listdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


import android.widget.Toast;
import com.bignerdranch.android.listdemo.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {


    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle bundle = getIntent().getExtras();

        String[] nature_picname = {"Hill stations", "Beach", "Valleys", "Deserts", "Volcanoes", "Forest", "Island", "Coral Reefs"};
        int [] picimages = {R.mipmap.a,R.mipmap.b,R.mipmap.c1,R.mipmap.d,R.mipmap.e, R.mipmap.f, R.mipmap.g, R.mipmap.h};
        GridAdapter naturegridAdapter = new GridAdapter(SecondActivity.this, nature_picname,picimages);
        binding.gridView.setAdapter(naturegridAdapter);
        binding.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //create a Uri from an intent string. use the result to create an intent.
             /*   Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);
*/
                if(position==0) {
                    Intent intent = new Intent(SecondActivity.this,hill_list.class);
                    startActivity(intent);
                }

                if(position==1){
                    Intent b_intent = new Intent(SecondActivity.this, beach_list.class);
                    startActivity(b_intent);
                }

                if(position==2) {
                    Intent v_intent = new Intent(SecondActivity.this, valley_list.class);
                    startActivity(v_intent);
                }

                if(position==3) {
                    Intent d_intent = new Intent(SecondActivity.this, desert_list.class);
                    startActivity(d_intent);
                }

                if(position==4) {
                    Intent vo_intent = new Intent(SecondActivity.this, volcano_list.class);
                    startActivity(vo_intent);
                }

                if(position==5) {
                    Intent f_intent = new Intent(SecondActivity.this, forest_list.class);
                    startActivity(f_intent);
                }

                if(position==6) {
                    Intent i_intent = new Intent(SecondActivity.this, island_list.class);
                    startActivity(i_intent);
                }

                if(position==7) {
                    Intent c_intent = new Intent(SecondActivity.this, coral_list.class);
                    startActivity(c_intent);
                }


            }
        });
    }
}