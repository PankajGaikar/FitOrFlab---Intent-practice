package com.tricksmachine.fitorflab;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        TextView titleView = (TextView)findViewById(R.id.titleView);
        ImageView imageView = (ImageView)findViewById(R.id.detailImageView);
        RelativeLayout backgroundView = (RelativeLayout)findViewById(R.id.backgroundViewLayout);

        String titleString = getIntent().getStringExtra(MainActivity.EXTRA);
        titleView.setText(titleString);

        if( titleString.equalsIgnoreCase(MainActivity.EXCERSIZE_WEIGHT)){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.weight, getApplicationContext().getTheme()));
            backgroundView.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_bright));
        }
        else if( titleString.equalsIgnoreCase(MainActivity.EXCERSIZE_CARDIO)){
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.heart, getApplicationContext().getTheme()));
            backgroundView.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
        }
        else{
            imageView.setImageDrawable(getResources().getDrawable(R.drawable.lotus, getApplicationContext().getTheme()));
            backgroundView.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
        }
    }
}
