package com.gavinrob.electyourelectives;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.*;

public class CoursesActivity extends AppCompatActivity {

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

    @Override
    public void onBackPressed() {
        Model.getInstance().clearMap();
        super.onBackPressed();
    }

    protected String[] setUpCourses() {
        Model model = Model.getInstance();
        if (model.js && model.web) {
            Course cs260 = new Course("CS260", "js", "web", "Introduction to web application design and implementation. Both front end and back end development with an emphasis on REST architectures.");
            model.addToModel(cs260);
        }
        if (model.android && model.ux) {
            Course cs356 = new Course("CS356", "android", "ux", "Studio-critique style course on user experience design. Contextual inquiry to identify user needs. Iterative solution design using sketching and storyboards. Human perception and visual design principles. Rapid prototyping and evaluation of proposed solutions.");
            model.addToModel(cs356);
        }
        if (model.any && model.lowlevel) {
            Course cs330 = new Course("CS330", "any", "lowlevel", "Principles and concepts characterizing high-level computer programming languages, process and data abstraction, encapsulation, inheritance, functional programming, logic programming, scanners, and parsers.");
            model.addToModel(cs330);
        }
        if (model.c && model.lowlevel) {
            Course cs345 = new Course("CS345", "c", "lowlevel", "Principles and concepts of operating systems design and the implementation of an operating system.");
            model.addToModel(cs345);
        }
        if (model.java && model.animation) {
            Course cs355 = new Course("CS355", "java", "animation", "Introduces basic concepts of computer graphics, user interfaces and image processing. Includes homogenous coordinate transforms, image transforms, event driven programming and color models. Extends Model-View-Controller architecture.");
            model.addToModel(cs355);
        }
        if (model.cpp && model.other) {
            Course cs405 = new Course("CS405", "cpp", "other", "Students think critically about the steps necessary to start and run successful Venture Startups.\"");
            model.addToModel(cs405);
        }
        if (model.java && model.bio) {
            Course cs418 = new Course("CS418", "java", "bio", "Examines computational methods for analyzing biological systems. Dynamic programming, Markov models, Neural Networks and Bayesian analysis are used to predict secondary structure, tertiary structure and active sites for drug docking given molecular DNA sequence analysis. Prerequisites: CS 312");
            model.addToModel(cs418);
        }
        if (model.any && model.mobile) {
            Course cs428 = new Course("CS428", "any", "mobile", "Analysis, design, implementation, and testing of significant software systems.");
            model.addToModel(cs428);
        }
        if (model.js && model.web) {
            Course cs452 = new Course("CS452", "js", "web", "Database models: relational, deductive, object-oriented. Integrity constraints, query languages, database design");
            model.addToModel(cs452);
        }
        if (model.java && model.animation) {
            Course cs455 = new Course("CS455", "java", "animation", "Interactive computer graphics systems programming and architecture.");
            model.addToModel(cs455);
        }
        if (model.android && model.ux) {
            Course cs456 = new Course("CS456", "android", "ux", "Introduction to software architectures and techniques for graphical user interfaces. Input devices, windowing systems, event-driven programming, interactive geometry.");
            model.addToModel(cs456);
        }
        if (model.c && model.web) {
            Course cs460 = new Course("CS460", "c", "web", "Introduction to data communications and computer networking. Communications fundamentals, computer networks, software, architecture, telecommunications, regulation, standard");
            model.addToModel(cs460);
        }
        if (model.cpp && model.security) {
            Course cs465 = new Course("CS465", "cpp", "security", "Introduction to computer security fundamentals: confidentiality, integrity, authentication, and access control. Secret key and public key cryptography, network security protocols, viruses, and fire walls.");
            model.addToModel(cs465);
        }
        if (model.python && model.ai) {
            Course cs470 = new Course("CS470", "python", "ai", "Introduction to core areas of artificial intelligence; intelligent agents, problem solving and search, knowledge-based systems and inference, planning, uncertainty, learning, and perception.");
            model.addToModel(cs470);
        }
        if (model.python && model.ai) {
            Course cs478 = new Course("CS478", "python", "ai", "Machine learning and data mining models and other mechanisms allowing computers to learn and find knowledge from data.");
            model.addToModel(cs478);
        }
        if (model.cSharp && model.other) {
            Course cs486 = new Course("CS486", "cSharp", "other", "Verification & Validation");
            model.addToModel(cs486);
        }
        if (model.any && model.other) {
            Course cs493r = new Course("CS493R", "any", "other", "Computing Competitions");
            model.addToModel(cs493r);
        }
        if (model.any && model.other) {
            Course cs494 = new Course("CS494", "any", "other", "Culminating experience based on skills learned in advanced technical courses. Students work in teams to plan, design, test, and demonstrate a major project.");
            model.addToModel(cs494);
        }
        if (model.cpp && model.other) {
            Course cs497r = new Course("CS497R", "cpp", "other", "Undergraduate Research");
            model.addToModel(cs497r);
        }
        if (model.any && model.other) {
            Course cs498r = new Course("CS498R", "any", "other", "Students identify an interesting problem in computer science and solve it with the aid of faculty members.");
            model.addToModel(cs498r);
        }

        Set<Integer> keys = model.map.keySet();
        String[] subjects = keys.toArray(new String[keys.size()]);
        return subjects;
    }
}
