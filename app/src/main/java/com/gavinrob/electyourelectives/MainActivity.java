package com.gavinrob.electyourelectives;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the spinner from the xml.
        Spinner degreeSpinner = (Spinner)findViewById(R.id.degreeSpinner);
        String[] items = new String[]{"Select your Degree","Computer Science", "Information Systems", "Information Technology"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items){
            @Override
            public boolean isEnabled(int position){
                if(position == 0){return false;}
                else{return true;}
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                ((TextView) view).setGravity(Gravity.CENTER);
                if(position == 0){tv.setTextColor(Color.GRAY);}
                else {tv.setTextColor(Color.BLACK);}
                return view;
            }
        };
        adapter.setDropDownViewResource(R.layout.spinner_text);
        degreeSpinner.setAdapter(adapter);
        degreeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                changeColor();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                changeColor();
            }
        });

        //get the spinner from the xml.
        Spinner universitySpinner = (Spinner)findViewById(R.id.universitySpinner);
        String[] items1 = new String[]{"Select your University","Brigham Young University", "Utah Valley University", "University of Utah"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1){
            @Override
            public boolean isEnabled(int position){
                if(position == 0){return false;}
                else{return true;}
            }
            @Override
            public View getDropDownView(int position, View convertView,
                                        ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                ((TextView) view).setGravity(Gravity.CENTER);
                if(position == 0){tv.setTextColor(Color.GRAY);}
                else {tv.setTextColor(Color.BLACK);}
                return view;
            }
        };
        adapter1.setDropDownViewResource(R.layout.spinner_text);
        universitySpinner.setAdapter(adapter1);
        universitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                changeColor();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                changeColor();
            }
        });


        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.hide();

    }

    public void changeColor(){
        System.out.printf("here");
        if(canProceed()){
            fab.show();
        }
    }

    public boolean canProceed(){
        Spinner degreeSpin = (Spinner)findViewById(R.id.degreeSpinner);
        Spinner unSpin = (Spinner)findViewById(R.id.universitySpinner);
        if(degreeSpin.getSelectedItem().toString() != "Select your Degree" && unSpin.getSelectedItem().toString() != "Select your University"){
            return true;
        }
        return false;
    }

    public void proceedToFilters(View view) {
        if(canProceed()){
            Intent intent = new Intent(this, FiltersActivity.class);
            startActivity(intent);
        }
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
