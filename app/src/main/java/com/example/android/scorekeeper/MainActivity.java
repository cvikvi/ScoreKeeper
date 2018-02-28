package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 6 point when a team has scored
     * a touchdown.
     */
    public void addTouchDownForTeamA(View v) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 point
     * after a touchdown has been made.
     */
    public void addExtraPointAttemptforTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     * After a touchdown has been made
     */
    public void addTwoPointConversionForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points when a field goal is kicked
     * without having made a touchdown
     */
    public void addFieldGoalForTeamA(View v) {

        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points when a safety is scored against Team B
     * without having made a touchdown
     */
    public void addSafetyForTeamA(View v) {

        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }



    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team B by 6 point.
     */
    public void addTouchDownForTeamB(View v) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 1 points when a field goal
     * is scored after a touchdown is made.
     */
    public void addExtraPointAttemptforTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points when a two point conversion
     * is scored after a touchdown is made.
     */
    public void addTwoPointConversionForTeamB(View v) {

        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

    }

    /**
     * Add field goal attempt without scoring
     * a touchdown first (3 points) to Team B
     *
     */

    public void addFieldGoalForTeamB(View v) {

        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Increase the score for Team B by 2 points when a safety is scored against Team A
     * without having made a touchdown
     */
    public void addSafetyForTeamB(View v) {

        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }




    /**
     * Reset team scores
     */

    public void resetScores(View v){

        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);


    }















}




