package com.gavinrob.electyourelectives;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
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

        String[] subjects = setUpCourses();

        recyclerViewAdapter = new RecyclerViewAdapter(context, subjects);

        recyclerView.setAdapter(recyclerViewAdapter);

        //this adds dividers
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
    }

    protected String[] setUpCourses() {
        Course cs260 = new Course("CS260", "cpp", "other",  "Introduction to web application design and implementation. Both front end and back end development with an emphasis on REST architectures.");
        Course cs330 = new Course("CS330",  "cpp", "other", "Principles and concepts characterizing high-level computer programming languages, process and data abstraction, encapsulation, inheritance, functional programming, logic programming, scanners, and parsers.");
        Course cs345 = new Course("CS345",  "cpp", "other", "Principles and concepts of operating systems design and the implementation of an operating system.");
        Course cs355 = new Course("CS355", "cpp", "other",  "Introduces basic concepts of computer graphics, user interfaces and image processing. Includes homogenous coordinate transforms, image transforms, event driven programming and color models. Extends Model-View-Controller architecture.");
        Course cs405 = new Course("CS405",  "cpp", "other", "Students think critically about the steps necessary to start and run successful Venture Startups.\"");
        Course cs418 = new Course("CS418", "cpp", "other",  "Examines computational methods for analyzing biological systems. Dynamic programming, Markov models, Neural Networks and Bayesian analysis are used to predict secondary structure, tertiary structure and active sites for drug docking given molecular DNA sequence analysis. Prerequisites: CS 312");
        Course cs428 = new Course("CS428", "cpp", "other",  "Analysis, design, implementation, and testing of significant software systems.");
        Course cs452 = new Course("CS452", "cpp", "other",  "Database models: relational, deductive, object-oriented. Integrity constraints, query languages, database design");
        Course cs455 = new Course("CS455",  "cpp", "other", "Interactive computer graphics systems programming and architecture.");
        Course cs460 = new Course("CS460", "cpp", "other",  "Introduction to data communications and computer networking. Communications fundamentals, computer networks, software, architecture, telecommunications, regulation, standard");
        Course cs465 = new Course("CS465",  "cpp", "other", "Introduction to computer security fundamentals: confidentiality, integrity, authentication, and access control. Secret key and public key cryptography, network security protocols, viruses, and fire walls.");
        Course cs470 = new Course("CS470", "cpp", "other",  "Introduction to core areas of artificial intelligence; intelligent agents, problem solving and search, knowledge-based systems and inference, planning, uncertainty, learning, and perception.");
        Course cs478 = new Course("CS478", "cpp", "other",  "Machine learning and data mining models and other mechanisms allowing computers to learn and find knowledge from data.");
        Course cs486 = new Course("CS486",  "cpp", "other", "Verification & Validation");
        Course cs493r = new Course("CS493R", "cpp", "other",  "Computing Competitions");
        Course cs494 = new Course("CS494",  "cpp", "other", "Culminating experience based on skills learned in advanced technical courses. Students work in teams to plan, design, test, and demonstrate a major project.");
        Course cs497r = new Course("CS497R", "cpp", "other",  "Undergraduate Research");
        Course cs498r = new Course("CS498R", "cpp", "other",  "Students gain hands-on experience solving cybersecurity problems.");
        Model model = Model.getInstance();
        model.addToModel(cs260);
        model.addToModel(cs330);
        model.addToModel(cs345);
        model.addToModel(cs355);
        model.addToModel(cs405);
        model.addToModel(cs418);
        model.addToModel(cs428);
        model.addToModel(cs452);
        model.addToModel(cs455);
        model.addToModel(cs460);
        model.addToModel(cs465);
        model.addToModel(cs470);
        model.addToModel(cs478);
        model.addToModel(cs486);
        model.addToModel(cs493r);
        model.addToModel(cs494);
        model.addToModel(cs497r);
        model.addToModel(cs498r);

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
                        cs465.getName(),
                        cs470.getName(),
                        cs478.getName(),
                        cs486.getName(),
                        cs493r.getName(),
                        cs494.getName(),
                        cs497r.getName(),
                        cs498r.getName()
                };
        return subjects;
    }
}
