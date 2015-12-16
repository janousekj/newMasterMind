package com.company.domain;

/**
 * Created by Jakub Janoušek on 10. 12. 2015.
 */
public class Result {
    public int correctColor;
    public int correctColorAndPlace;

    public Result(int correctColor, int correctColorAndPlace) {
        this.correctColor = correctColor;
        this.correctColorAndPlace = correctColorAndPlace;
    }
    public int getCorrectColor() {
        return correctColor;
    }
    public int getCorrectColorAndPlace() {
        return correctColorAndPlace;
    }

}
