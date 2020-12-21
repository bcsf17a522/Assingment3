package com.example.anav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultCard extends AppCompatActivity {
    TextView resultView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_card);
        resultView=findViewById(R.id.resultView);
        drawerLayout=findViewById(R.id.drawer_layout);

        String s=getIntent().getStringExtra("Result");
        resultView.setText(s);



    }

    public void Menu(View view){
        MainActivity.openDrawer(drawerLayout);
    }



    public void ClickCal(View view)
    {
        MainActivity.redirectActivity(this,calculator.class);

    }
    public void ClickQuiz(View view){

        MainActivity.redirectActivity(this,quiz.class);
    }
    @Override
    protected void onPause() {
        super.onPause();

        MainActivity.closeDrawer(drawerLayout);
    }



}