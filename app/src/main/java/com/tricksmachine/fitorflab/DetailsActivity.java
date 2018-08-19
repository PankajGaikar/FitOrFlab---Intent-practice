package com.tricksmachine.fitorflab;

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
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        RelativeLayout backgroundView = (RelativeLayout)findViewById(R.id.backgroundViewLayout);


    }
}
