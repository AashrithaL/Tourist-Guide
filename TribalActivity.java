package com.bignerdranch.android.listdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.bignerdranch.android.listdemo.databinding.ActivityTribalBinding;

public class TribalActivity extends AppCompatActivity {


    ActivityTribalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  ActivityTribalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle bundle = getIntent().getExtras();

        String[] history_picname = {"Tribes-Chhattisgarh", "Kabui Tribes-Manipur ", "Tribes-Orissa", "Tribes-Amazon Rainforest ", "Tribes-Andaman", "Tribes-Rajasthan"};
        int [] picimages = {R.mipmap.tribes_chhatissgarh,R.mipmap.tribes_kabui_manipur,R.mipmap.tribes_orissa,R.mipmap.tribes_amazon_rainforest,R.mipmap.tribes_andaman, R.mipmap.tribes_rajasthan};
        GridAdapter naturegridAdapter = new GridAdapter(TribalActivity.this, history_picname,picimages);
        binding.gridView2.setAdapter(naturegridAdapter);
        binding.gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(TribalActivity.this,"You Clicked on "+ history_picname[position],Toast.LENGTH_SHORT).show();
                if(position==0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/chhattisgarh+tribal/@21.1591577,79.5618397,7z/data=!3m1!4b1");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==1){
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/Kabui+Tribes-Manipur/@24.5563968,93.5450203,10z/data=!3m1!4b1");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if(position==2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/Tribes-Orissa/@24.4894636,89.3294102,6z/data=!3m1!4b1");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Amazon+Tribes+Turismo/@-3.0307702,-60.0146694,17z/data=!3m1!4b1!4m5!3m4!1s0x926c19686a72cdb3:0x3585a545b5665e8b!8m2!3d-3.0307702!4d-60.0124807");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==4) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/Tribes-Andaman/@10.1846697,82.4309012,6z/data=!3m1!4b1");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if(position==5) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/Tribes-Rajasthan/@26.1717669,73.6324027,8z/data=!3m1!4b1");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
            }
        });
    }
}