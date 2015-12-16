package com.company.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 10. 12. 2015.
 */
public class Guess {
    public List<Color> getInput_list() {
        return input_list;
    }

    private List<Color> input_list = new ArrayList<Color>();

    public Guess(List<Color> input_list) {
        this.input_list = input_list;
    }

    public void setInput_list(List<Color> input_list) {
        this.input_list = input_list;
    }
}
