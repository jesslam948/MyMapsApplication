package com.example.jessl.mymapsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_one);
    }

    public void onMapButtonClick(View v)  {
        Intent intent = new Intent(this, MapsActivityOne.class);
        startActivity(intent);
    }
}
