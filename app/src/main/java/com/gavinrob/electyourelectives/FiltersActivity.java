package com.gavinrob.electyourelectives;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class FiltersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FloatingActionButton fab;
        setContentView(R.layout.activity_filters);

        Intent intent = getIntent();


        // set a change listener on the SeekBar
        SeekBar programmingSeekBar = (SeekBar) findViewById(R.id.programmingSeekBar);
        SeekBar difficultySeekBar = (SeekBar) findViewById(R.id.difficultySeekBar);
        programmingSeekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        difficultySeekBar.setOnSeekBarChangeListener(seekBarChangeListener2);

        int programmingProgress = programmingSeekBar.getProgress();
        int difficultyProgress = difficultySeekBar.getProgress();
        programmingValueLabel = (TextView) findViewById(R.id.programValue);
        programmingValueLabel.setText("How Much Programming? (1-5): " + programmingProgress);
        difficultyValueLabel = (TextView) findViewById(R.id.difficultyValue);
        difficultyValueLabel.setText("How Difficult? (1-5): " + difficultyProgress);

        final Model model = Model.getInstance();

}


    public void proceedToCourses(View view) {
        Model model = Model.getInstance();
        SeekBar difficulty = (SeekBar)findViewById(R.id.difficultySeekBar);
        SeekBar coding = (SeekBar)findViewById(R.id.programmingSeekBar);

        model.coding =  coding.getProgress();
        model.difficulty = difficulty.getProgress();

        ToggleButton mobile = (ToggleButton) findViewById(R.id.mobileButton);
        model.mobile = mobile.isChecked();

        ToggleButton web = (ToggleButton) findViewById(R.id.webButton);
        model.web = web.isChecked();

        ToggleButton security = (ToggleButton) findViewById(R.id.securityButton);
        model.security = security.isChecked();

        ToggleButton animation = (ToggleButton)findViewById(R.id.animationButton);
        model.animation = animation.isChecked();

        ToggleButton ai = (ToggleButton)findViewById(R.id.artificialIntelligenceButton);
        model.ai = ai.isChecked();

        ToggleButton lowlevel = (ToggleButton)findViewById(R.id.lowlevelButton);
        model.lowlevel = lowlevel.isChecked();

        ToggleButton ux = (ToggleButton)findViewById(R.id.UXButton);
        model.ux = ux.isChecked();

        ToggleButton bio = (ToggleButton)findViewById(R.id.bioButton);
        model.bio = bio.isChecked();

        ToggleButton other = (ToggleButton)findViewById(R.id.otherButton);
        model.other = other.isChecked();

        ToggleButton java = (ToggleButton)findViewById(R.id.javaButton);
        model.java = java.isChecked();

        ToggleButton cpp = (ToggleButton)findViewById(R.id.cppButton);
        model.cpp = cpp.isChecked();

        ToggleButton c = (ToggleButton)findViewById(R.id.cButton);
        model.c = c.isChecked();

        ToggleButton js = (ToggleButton)findViewById(R.id.jsButton);
        model.js = js.isChecked();

        ToggleButton python = (ToggleButton)findViewById(R.id.pythonButton);
        model.python = python.isChecked();

        ToggleButton android = (ToggleButton)findViewById(R.id.androidButton);
        model.android = android.isChecked();

        ToggleButton cSharp = (ToggleButton)findViewById(R.id.csharpButton);
        model.cSharp = cSharp.isChecked();

        ToggleButton any = (ToggleButton)findViewById(R.id.allLanguages);
        model.any = any.isChecked();

        Intent intent = new Intent(this, CoursesActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
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
