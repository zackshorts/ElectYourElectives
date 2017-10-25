package com.gavinrob.electyourelectives;

/**
 * Created by gavin on 10/18/2017.
 */

public class Course {
    private String name;
    private String description;
    private String language;

    private boolean isJava = false;
    private boolean isCpp = false;
    private boolean isC = false;
    private boolean isJs = false;
    private boolean isPython = false;
    private boolean isAndroid = false;
    private boolean isCSharp = false;
    private boolean isAny = false;

    private boolean isMobile = false;
    private boolean isWeb = false;
    private boolean isSecurity = false;
    private boolean isAnimation = false;
    private boolean isBio = false;
    private boolean isAi = false;
    private boolean isLowLevel = false;
    private boolean isUx = false;
    private boolean isOther = false;

    //can be 0 - 5 (intially set to 2)
    private int difficulty = 2;
    private int coding = 2;




    public Course(String name, String language, String type, int difficulty, int coding, String description){
        this.name = name;
        this.difficulty = difficulty;
        this.coding = coding;
        this.description = description;
        this.language = language;

        switch(language){
            case "java":
                isJava = true;
                break;
            case "cpp":
                isCpp = true;
                break;
            case "c":
                isC = true;
                break;
            case "js":
                isJs = true;
                break;
            case "python":
                isPython = true;
                break;
            case "android":
                isAndroid = true;
                break;
            case "cSharp":
                isCSharp = true;
                break;
            case "any":
                isAny = true;
                break;
        }

        switch (type){
            case "mobile":
                isMobile = true;
                break;
            case "web":
                isWeb = true;
                break;
            case "security":
                isSecurity = true;
                break;
            case "animation":
                isAnimation = true;
                break;
            case "bio":
                isBio = true;
                break;
            case "ai":
                isAi = true;
                break;
            case "lowlevel":
                isLowLevel = true;
                break;
            case "ux":
                isUx = true;
                break;
            case "other":
                isOther = true;
                break;

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isJava() {
        return isJava;
    }

    public void setJava(boolean java) {
        isJava = java;
    }

    public boolean isCpp() {
        return isCpp;
    }

    public void setCpp(boolean cpp) {
        isCpp = cpp;
    }

    public boolean isC() {
        return isC;
    }

    public void setC(boolean c) {
        isC = c;
    }

    public boolean isJs() {
        return isJs;
    }

    public void setJs(boolean js) {
        isJs = js;
    }

    public boolean isPython() {
        return isPython;
    }

    public void setPython(boolean python) {
        isPython = python;
    }

    public boolean isAndroid() {
        return isAndroid;
    }

    public void setAndroid(boolean android) {
        isAndroid = android;
    }

    public boolean isCSharp() {
        return isCSharp;
    }

    public void setCSharp(boolean CSharp) {
        isCSharp = CSharp;
    }

    public boolean isAny() {
        return isAny;
    }

    public void setAny(boolean any) {
        isAny = any;
    }

    public boolean isMobile() {
        return isMobile;
    }

    public void setMobile(boolean mobile) {
        isMobile = mobile;
    }

    public boolean isWeb() {
        return isWeb;
    }

    public void setWeb(boolean web) {
        isWeb = web;
    }

    public boolean isSecurity() {
        return isSecurity;
    }

    public void setSecurity(boolean security) {
        isSecurity = security;
    }

    public boolean isAnimation() {
        return isAnimation;
    }

    public void setAnimation(boolean animation) {
        isAnimation = animation;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    public boolean isOther() {
        return isOther;
    }

    public void setOther(boolean other) {
        isOther = other;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getCoding() {
        return coding;
    }

    public void setCoding(int coding) {
        this.coding = coding;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAi() {
        return isAi;
    }

    public void setAi(boolean ai) {
        isAi = ai;
    }

    public boolean isLowLevel() {
        return isLowLevel;
    }

    public void setLowLevel(boolean lowLevel) {
        isLowLevel = lowLevel;
    }

    public boolean isUx() {
        return isUx;
    }

    public void setUx(boolean ux) {
        isUx = ux;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
