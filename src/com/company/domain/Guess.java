package com.company.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 10. 12. 2015.
 */
public class Guess {

    private List<Color> input_list = new ArrayList<Color>();

    /**
     * @return Returns input from user as an ArrayList
     */
	public List<Color> getInput_list() {

        return input_list;
    }



    public Guess(List<Color> input_list) {
        this.input_list = input_list;
    }

    public void setInput_list(List<Color> input_list) {
        this.input_list = input_list;
    }
    /**
     * @return Parse color to string and return it
     */
    public String s_printAttempt() {


    int i = 0;
    String toBePrinted = "";
    while(i!=input_list.size())
    {
    	toBePrinted += input_list.get(i).toString() + ", ";
    	i++;
    }
    return toBePrinted;
    }
}
