package com.gavinrob.electyourelectives;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class CoursesActivity extends AppCompatActivity  {

    Context context;
    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    Course cs260 = new Course("CS345");
    Course cs330 = new Course("CS330");
    Course cs345 = new Course("CS345");
    Course cs355 = new Course("CS3355");
    Course cs405 = new Course("CS405");
    Course cs418 = new Course("CS418");
    Course cs428 = new Course("CS428");
    Course cs452 = new Course("CS452");
    Course cs455 = new Course("CS455");
    Course cs460 = new Course("CS460");
    Course cs465 = new Course("CS465");
    Course cs470 = new Course("CS470");
    Course cs478 = new Course("CS478");
    Course cs486 = new Course("CS486");
    Course cs493r = new Course("CS493R");
    Course cs494 = new Course("CS494");
    Course cs497r = new Course("CS497R");
    Course cs498r = new Course("CS498R");

    String[] subjects =
            {
                    cs260.getName(),
                    cs330.getName(),
                    cs345.getName(),
                    cs355.getName(),
                    cs405.getName(),
                    cs418.getName(),
                    cs428.getName(),
                    cs452.getName(),
                    cs455.getName(),
                    cs460.getName(),
                    cs465.getName()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_courses);

        context = getApplicationContext();

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);

        recylerViewLayoutManager = new LinearLayoutManager(context);

        recyclerView.setLayoutManager(recylerViewLayoutManager);

        recyclerViewAdapter = new RecyclerViewAdapter(context, subjects);

        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
