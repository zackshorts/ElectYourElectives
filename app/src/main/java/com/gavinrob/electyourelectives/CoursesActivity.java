package com.gavinrob.electyourelectives;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Set;

public class CoursesActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;
    private Intent intent;
    String[] subjects;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_courses);

        context = getApplicationContext();

        relativeLayout = (RelativeLayout) findViewById(R.id.relativelayout1);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(context, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Model model = Model.getInstance();
                        model.courseKey = subjects[position];
                        proceedToSpecs();
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
        recylerViewLayoutManager = new LinearLayoutManager(context);

        recyclerView.setLayoutManager(recylerViewLayoutManager);

        String[] subjects = setUpCourses();

        recyclerViewAdapter = new RecyclerViewAdapter(context, subjects);

        recyclerView.setAdapter(recyclerViewAdapter);

        TextView noCourseText = (TextView) findViewById(R.id.noCoursesText);
        if (subjects.length > 0){
            noCourseText.setVisibility(View.INVISIBLE);
        }

                //this adds dividers
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                LinearLayoutManager.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
    }


    public void proceedToSpecs() {
        Intent intent = new Intent(this, SpecsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Model.getInstance().clearMap();
        super.onBackPressed();
    }

    protected String[] setUpCourses() {
        Model model = Model.getInstance();
        if (model.js && model.web && (model.difficulty <= 2) && (model.coding <= 4)) {
            Course cs260 = new Course("CS260", "js", "web", 2,4, "Introduction to web application design and implementation. Both front end and back end development with an emphasis on REST architectures.");
            model.addToModel(cs260);
        }
        if (model.android && model.ux && (model.difficulty <= 3) && (model.coding <= 4)) {
            Course cs356 = new Course("CS356", "android", "ux", 3,4, "Studio-critique style course on user experience design. Contextual inquiry to identify user needs. Iterative solution design using sketching and storyboards. Human perception and visual design principles. Rapid prototyping and evaluation of proposed solutions.");
            model.addToModel(cs356);
        }
        if (model.any && model.lowlevel && (model.difficulty <= 4) && (model.coding <= 5)) {
            Course cs330 = new Course("CS330", "any", "lowlevel", 4,5, "Principles and concepts characterizing high-level computer programming languages, process and data abstraction, encapsulation, inheritance, functional programming, logic programming, scanners, and parsers.");
            model.addToModel(cs330);
        }
        if (model.c && model.lowlevel && (model.difficulty <= 4) && (model.coding <= 4)) {
            Course cs345 = new Course("CS345", "c", "lowlevel", 4,4, "Principles and concepts of operating systems design and the implementation of an operating system.");
            model.addToModel(cs345);
        }
        if (model.java && model.animation && (model.difficulty <= 2) && (model.coding <= 3)) {
            Course cs355 = new Course("CS355", "java", "animation", 2, 3, "Introduces basic concepts of computer graphics, user interfaces and image processing. Includes homogenous coordinate transforms, image transforms, event driven programming and color models. Extends Model-View-Controller architecture.");
            model.addToModel(cs355);
        }
        if (model.cpp && model.other && (model.difficulty <= 1) && (model.coding <= 1)) {
            Course cs405 = new Course("CS405", "cpp", "other",1, 1,"Students think critically about the steps necessary to start and run successful Venture Startups.\"");
            model.addToModel(cs405);
        }
        if (model.java && model.bio && (model.difficulty <= 2) && (model.coding <= 3)) {
            Course cs418 = new Course("CS418", "java", "bio",2, 3, "Examines computational methods for analyzing biological systems. Dynamic programming, Markov models, Neural Networks and Bayesian analysis are used to predict secondary structure, tertiary structure and active sites for drug docking given molecular DNA sequence analysis. Prerequisites: CS 312");
            model.addToModel(cs418);
        }
        if (model.any && model.mobile && (model.difficulty <= 4) && (model.coding <= 3)) {
            Course cs428 = new Course("CS428", "any", "mobile", 4, 3,"Analysis, design, implementation, and testing of significant software systems.");
            model.addToModel(cs428);
        }
        if (model.js && model.web && (model.difficulty <= 4) && (model.coding <= 4)) {
            Course cs452 = new Course("CS452", "js", "web",4, 4, "Database models: relational, deductive, object-oriented. Integrity constraints, query languages, database design");
            model.addToModel(cs452);
        }
        if (model.java && model.animation && (model.difficulty <= 2) && (model.coding <= 4)) {
            Course cs455 = new Course("CS455", "java", "animation",2, 2, "Interactive computer graphics systems programming and architecture.");
            model.addToModel(cs455);
        }
        if (model.android && model.ux && (model.difficulty <= 2) && (model.coding <= 2)) {
            Course cs456 = new Course("CS456", "android", "ux",2, 2, "Introduction to software architectures and techniques for graphical user interfaces. Input devices, windowing systems, event-driven programming, interactive geometry.");
            model.addToModel(cs456);
        }
        if (model.c && model.web && (model.difficulty <= 4) && (model.coding <= 3)) {
            Course cs460 = new Course("CS460", "c", "web",4, 3, "Introduction to data communications and computer networking. Communications fundamentals, computer networks, software, architecture, telecommunications, regulation, standard");
            model.addToModel(cs460);
        }
        if (model.cpp && model.security && (model.difficulty <= 5) && (model.coding <= 5)) {
            Course cs465 = new Course("CS465", "cpp", "security",1, 1, "Introduction to computer security fundamentals: confidentiality, integrity, authentication, and access control. Secret key and public key cryptography, network security protocols, viruses, and fire walls.");
            model.addToModel(cs465);
        }
        if (model.python && model.ai && (model.difficulty <= 4) && (model.coding <= 3)) {
            Course cs470 = new Course("CS470", "python", "ai",4, 3, "Introduction to core areas of artificial intelligence; intelligent agents, problem solving and search, knowledge-based systems and inference, planning, uncertainty, learning, and perception.");
            model.addToModel(cs470);
        }
        if (model.python && model.ai && (model.difficulty <= 2) && (model.coding <= 3)) {
            Course cs478 = new Course("CS478", "python", "ai",2, 3, "Machine learning and data mining models and other mechanisms allowing computers to learn and find knowledge from data.");
            model.addToModel(cs478);
        }
        if (model.cSharp && model.other && (model.difficulty <= 3) && (model.coding <= 3)) {
            Course cs486 = new Course("CS486", "cSharp", "other",3, 3, "Verification & Validation");
            model.addToModel(cs486);
        }
        if (model.any && model.other && (model.difficulty <= 2) && (model.coding <= 3)) {
            Course cs493r = new Course("CS493R", "any", "other",2, 3, "Computing Competitions");
            model.addToModel(cs493r);
        }
        if (model.any && model.other && (model.difficulty <= 2) && (model.coding <= 3)) {
            Course cs494 = new Course("CS494", "any", "other",2, 3, "Culminating experience based on skills learned in advanced technical courses. Students work in teams to plan, design, test, and demonstrate a major project.");
            model.addToModel(cs494);
        }
        if (model.cpp && model.other && (model.difficulty <= 2) && (model.coding <= 3)) {
            Course cs497r = new Course("CS497R", "cpp", "other", 2, 3,"Undergraduate Research");
            model.addToModel(cs497r);
        }
        if (model.any && model.other && (model.difficulty <= 4) && (model.coding <= 3)) {
            Course cs498r = new Course("CS498R", "any", "other", 4, 3,"Students identify an interesting problem in computer science and solve it with the aid of faculty members.");
            model.addToModel(cs498r);
        }

        Set<Integer> keys = model.map.keySet();
        subjects = keys.toArray(new String[keys.size()]);
        return subjects;
    }
}
