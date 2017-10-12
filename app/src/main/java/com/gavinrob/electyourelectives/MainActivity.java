package com.gavinrob.electyourelectives;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the spinner from the xml.
        Spinner dropdown = (Spinner)findViewById(R.id.degreeSpinner);
        String[] items = new String[]{"Select your Degree","Computer Science", "Information Systems", "Information Technology"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        adapter.setDropDownViewResource(R.layout.spinner_text);
        dropdown.setAdapter(adapter);

        //get the spinner from the xml.
        Spinner dropdown1 = (Spinner)findViewById(R.id.universitySpinner);
        String[] items1 = new String[]{"Select your University","Brigham Young University", "Utah Valley University", "University of Utah"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        adapter1.setDropDownViewResource(R.layout.spinner_text);
        dropdown1.setAdapter(adapter1);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    }

    public void proceedToFilters(View view) {
        Intent intent = new Intent(this, FiltersActivity.class);


        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
