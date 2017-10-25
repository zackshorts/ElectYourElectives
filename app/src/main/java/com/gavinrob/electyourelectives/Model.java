package com.gavinrob.electyourelectives;
import java.util.*;

/**
 * Created by gavin on 10/22/2017.
 */

public class Model {
    private static Model model = null;
    protected static Map map = new HashMap();
    protected static List<Course> list = new ArrayList<>();

    protected static boolean mobile = false;
    protected static boolean web = false;
    protected static boolean security = false;
    protected static boolean animation = false;
    protected static boolean bio = false;
    protected static boolean ai = false;
    protected static boolean lowlevel = false;
    protected static boolean ux = false;
    protected static boolean other = false;

    protected static boolean java = false;
    protected static boolean cpp = false;
    protected static boolean c = false;
    protected static boolean js = false;
    protected static boolean python = false;
    protected static boolean android = false;
    protected static boolean cSharp = false;
    protected static boolean any = false;

    protected static int difficulty = 2;
    protected static int coding = 2;

    protected static String courseKey;


    protected Model() {
        // Exists only to defeat instantiation.
    }


    public static Model getInstance() {
        if (model == null){
            model = new Model();
        }
        return model;
    }

    public static void addToModel(Course course){
        map.put(course.getName(),course);
    }

    public static void clearMap(){
        map.clear();
    }
}
