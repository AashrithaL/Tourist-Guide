package com.bignerdranch.android.listdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.bignerdranch.android.listdemo.databinding.ActivityHistoricalBinding;

public class HistoricalActivity extends AppCompatActivity {


    ActivityHistoricalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHistoricalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Bundle bundle = getIntent().getExtras();

        String[] historical_picname = {"Taj Mahal", "Great Wall of China", "Machu Picchu", "Petra", "Potala Palace", "StoneHenge", "The Great Pyramid of Giza","Colosseum"};
        int [] picimages = {R.mipmap.taj_mahal,R.mipmap.great_wall_china,R.mipmap.machu_picchu,R.mipmap.petra,R.mipmap.potala_palace, R.mipmap.stonehenge, R.mipmap.the_great_pyramid_of_giza, R.mipmap.colosseum};
        GridAdapter naturegridAdapter = new GridAdapter(HistoricalActivity.this, historical_picname,picimages);
        binding.gridView1.setAdapter(naturegridAdapter);
        binding.gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Taj+Mahal/@27.1751448,78.0399535,17z/data=!3m1!4b1!4m5!3m4!1s0x39747121d702ff6d:0xdd2ae4803f767dde!8m2!3d27.1751448!4d78.0421422");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if (position == 1) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Great+Wall+of+China/@40.4319077,116.5681862,17z/data=!3m1!4b1!4m5!3m4!1s0x35f121d7687f2ccf:0xd040259b950522df!8m2!3d40.4319077!4d116.5703749");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }

                if (position == 2) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/Machu+Picchu/@-13.2088354,-72.6319817,11z/data=!3m1!4b1");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if (position == 3) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Petra/@30.3284544,35.4421735,17z/data=!3m1!4b1!4m5!3m4!1s0x15016ef1703b6071:0x199bf908679a2291!8m2!3d30.3284544!4d35.4443622");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if (position == 4) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Potala+Palace/@29.6554942,91.1163905,17z/data=!3m1!4b1!4m5!3m4!1s0x3761317244846eab:0x4ae80d857ec10c19!8m2!3d29.6554942!4d91.1185792");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if (position == 5) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/StoneHenge/@51.1857968,-1.8398118,14z/data=!3m1!4b1");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if (position == 6) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/The+Great+Pyramid+of+Giza/@29.9792345,31.1320132,17z/data=!3m1!4b1!4m5!3m4!1s0x14584587ac8f291b:0x810c2f3fa2a52424!8m2!3d29.9792345!4d31.1342019");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
                if (position == 7) {
                    Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/Colosseum/@41.8902102,12.4900422,17z/data=!3m1!4b1!4m5!3m4!1s0x132f61b6532013ad:0x28f1c82e908503c4!8m2!3d41.8902102!4d12.4922309");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    startActivity(mapIntent);
                }
            }
        });
    }
}