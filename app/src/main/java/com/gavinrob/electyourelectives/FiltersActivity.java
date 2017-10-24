package com.gavinrob.electyourelectives;

import android.content.Intent;
import android.os.Bundle;
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
        ToggleButton mobile = (ToggleButton) findViewById(R.id.mobileButton);
        mobile.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.mobile = !model.mobile;}});

        ToggleButton web = (ToggleButton) findViewById(R.id.webButton);
        web.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.web = !model.web;}});

        ToggleButton security = (ToggleButton) findViewById(R.id.securityButton);
        security.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.security = !model.security;}});

        ToggleButton animation = (ToggleButton)findViewById(R.id.animationButton);
        animation.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.animation = !model.animation;}});

        ToggleButton ai = (ToggleButton)findViewById(R.id.artificialIntelligenceButton);
        ai.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.ai = !model.ai;}});

        ToggleButton lowlevel = (ToggleButton)findViewById(R.id.lowlevelButton);
        lowlevel.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.lowlevel = !model.lowlevel;}});

        ToggleButton ux = (ToggleButton)findViewById(R.id.UXButton);
        ux.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.ux = !model.ux;}});

        ToggleButton bio = (ToggleButton)findViewById(R.id.bioButton);
        bio.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.bio = !model.bio;}});

        ToggleButton other = (ToggleButton)findViewById(R.id.otherButton);
        other.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.other = !model.other;}});

        ToggleButton java = (ToggleButton)findViewById(R.id.javaButton);
        java.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.java = !model.java;}});

        ToggleButton cpp = (ToggleButton)findViewById(R.id.cppButton);
        cpp.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.cpp = !model.cpp;}});

        ToggleButton c = (ToggleButton)findViewById(R.id.cButton);
        c.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.c = !model.c;}});

        ToggleButton js = (ToggleButton)findViewById(R.id.jsButton);
        js.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.js = !model.js;}});

        ToggleButton python = (ToggleButton)findViewById(R.id.pythonButton);
        python.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.python = !model.python;}});

        ToggleButton android = (ToggleButton)findViewById(R.id.androidButton);
        android.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.android = !model.android;}});

        ToggleButton cSharp = (ToggleButton)findViewById(R.id.csharpButton);
        cSharp.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.cSharp = !model.cSharp;}});

        ToggleButton any = (ToggleButton)findViewById(R.id.allLanguages);
        any.setOnClickListener(new View.OnClickListener() {public void onClick(View v) {model.any = !model.any;}});
}
    public void proceedToCourses(View view) {
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
