package com.gavinrob.electyourelectives;
import java.util.*;

/**
 * Created by gavin on 10/22/2017.
 */

public class Model {
    private static Model model = null;
    private static Map map = new HashMap();

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
}
