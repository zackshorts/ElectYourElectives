package com.gavinrob.electyourelectives;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FiltersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);

        Intent intent = getIntent();
    }

    public void proceedToCourses(View view) {
            Intent intent = new Intent(this, CoursesActivity.class);
            startActivity(intent);
    }
}
