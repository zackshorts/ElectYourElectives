package com.gavinrob.electyourelectives;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class SpecsActivity extends AppCompatActivity {


    TextView courseTitle;
    Course currCourse;
    TextView courseDescription;
    TextView programmingLanguage;
    RatingBar difficultyRating;
    RatingBar programmingRating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_specs);
        Model model = Model.getInstance();
        currCourse = (Course)model.map.get(model.courseKey);
        courseTitle = (TextView) findViewById(R.id.courseTitle);
        courseDescription = (TextView) findViewById(R.id.courseDescription) ;
        programmingLanguage = (TextView) findViewById(R.id.language);
        programmingRating = (RatingBar) findViewById(R.id.programmingStars);
        difficultyRating = (RatingBar) findViewById(R.id.difficultyStars);


        courseTitle.setText(currCourse.getName());
        courseDescription.setText(currCourse.getDescription());
        programmingLanguage.setText(currCourse.getLanguage().toUpperCase());
        programmingRating.setRating(currCourse.getCoding());
        difficultyRating.setRating(currCourse.getDifficulty());


        Toast.makeText(this, "coding stars value: " + currCourse.getCoding(), Toast.LENGTH_LONG).show();
        Toast.makeText(this, "difficulty stars value: " + currCourse.getDifficulty(), Toast.LENGTH_LONG).show();
    }


}
