package com.example.udacitysecondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button goalButtonTeamA;
    Button goalButtonTeamB;
    Button foulButtonTeamA;
    Button foulButtonTeamB;
    Button cornerButtonTeamA;
    Button cornerButtonTeamB;
    TextView goalTextViewTeamA;
    TextView goalTextViewTeamB;
    TextView foulTextViewTeamA;
    TextView foulTextViewTeamB;
    TextView cornerTextViewTeamA;
    TextView cornerTextViewTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }
    void initializeViews(){
         goalButtonTeamA=findViewById(R.id.goals_add1);
        goalButtonTeamB=findViewById(R.id.goals_add2);
        foulButtonTeamA=findViewById(R.id.fouls_add1);
         foulButtonTeamB=findViewById(R.id.fouls_add2);
         cornerButtonTeamA=findViewById(R.id.courners_add1);
         cornerButtonTeamB=findViewById(R.id.corners_add2);
         goalTextViewTeamA=findViewById(R.id.goals1);
         goalTextViewTeamB=findViewById(R.id.goals2);
         foulTextViewTeamA=findViewById(R.id.fouls1);
         foulTextViewTeamB=findViewById(R.id.fouls2);
         cornerTextViewTeamA=findViewById(R.id.courners1);
         cornerTextViewTeamB=findViewById(R.id.courners2);
         Team teamA=new Team(goalButtonTeamA,goalTextViewTeamA,
                 foulButtonTeamA,foulTextViewTeamA,
                 cornerButtonTeamA,cornerTextViewTeamA);
        Team teamB=new Team(goalButtonTeamB,goalTextViewTeamB,
                foulButtonTeamB,foulTextViewTeamB,
                cornerButtonTeamB,cornerTextViewTeamB);
    }

    public void reset(View view) {
        goalTextViewTeamA.setText(0+"");
        goalTextViewTeamB.setText(0+"");
        foulTextViewTeamA.setText(0+"");
        foulTextViewTeamB.setText(0+"");
        cornerTextViewTeamA.setText(0+"");
        cornerTextViewTeamB.setText(0+"");
    }
}