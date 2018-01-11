package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeam1 = 0;
    int goalTeam2 = 0;
    int foulTeam1 = 0;
    int foulTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setScoreGoal_team1(View v) {
        goalTeam1 += 1;
        displayGoalTeam1(goalTeam1);
    }

    public void setScoreGoal_team2(View v) {
        goalTeam1 += 1;
        displayGoalTeam2(goalTeam2);
    }

    public void setScoreFoul_team1(View v) {
        foulTeam1 += 1;
        displayFoulTeam1(foulTeam1);
    }

    public void setScoreFoul_team2(View v) {
        foulTeam2 += 1;
        displayFoulTeam2(foulTeam2);
    }

    public void displayGoalTeam1(int score) {
        TextView scoreView = findViewById(R.id.scoreGoal_team1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalTeam2(int score) {
        TextView scoreView = findViewById(R.id.scoreGoal_team2);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeam1(int score) {
        TextView scoreView = findViewById(R.id.scoreFoul_team1);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeam2(int score) {
        TextView scoreView = findViewById(R.id.scoreFoul_team2);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        goalTeam1 = 0;
        goalTeam2 = 0;
        foulTeam1 = 0;
        foulTeam2 = 0;
        displayGoalTeam1(goalTeam1);
        displayGoalTeam2(goalTeam2);
        displayFoulTeam1(foulTeam1);
        displayFoulTeam2(foulTeam2);
    }
}

