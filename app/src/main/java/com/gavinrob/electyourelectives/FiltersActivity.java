package com.gavinrob.electyourelectives;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class FiltersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);

        Intent intent = getIntent();


        // set a change listener on the SeekBar
        SeekBar programmingSeekBar = (SeekBar)findViewById(R.id.programmingSeekBar);
        SeekBar difficultySeekBar = (SeekBar)findViewById(R.id.difficultySeekBar);
        programmingSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        difficultySeekBar.setOnSeekBarChangeListener(seekBarChangeListener2);

        int programmingProgress = programmingSeekBar.getProgress();
        int difficultyProgress = difficultySeekBar.getProgress();
        programmingValueLabel = (TextView) findViewById(R.id.programValue);
        programmingValueLabel.setText("How Much Programming? (1-5): " + programmingProgress);
        difficultyValueLabel = (TextView) findViewById(R.id.difficultyValue);
        difficultyValueLabel.setText("How Difficult? (1-5): " + difficultyProgress);
    }

    public void proceedToCourses(View view) {
            Intent intent = new Intent(this, CoursesActivity.class);
            startActivity(intent);
    }

    TextView programmingValueLabel;
    TextView difficultyValueLabel;


    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekbar, int programmingProgress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            programmingValueLabel.setText("How Much Programming? (1-5): " + programmingProgress);
//            difficultyValueLabel.setText("How Difficult? (1-5): " + difficultyProgress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }


    };

    SeekBar.OnSeekBarChangeListener seekBarChangeListener2 = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekbar, int difficultyProgress, boolean fromUser) {
            // updated continuously as the user slides the thumb
//            programmingValueLabel.setText("How Much Programming? (1-5): " + programmingProgress);
            difficultyValueLabel.setText("How Difficult? (1-5): " + difficultyProgress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }


    };
}
