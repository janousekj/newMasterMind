package com.company.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 16. 12. 2015.
 */
public class Treasure {
    private final List<Color> colorList;

    public Treasure(List<Color> colorList) {
        this.colorList = colorList;
    }

    public List<Color> getColorList() {
        return colorList;
    }

    /**
     *
     * @return Create initial list of colors
     */
    public static List<Color> createList (){
        java.util.List<Color> colorList = new ArrayList<Color>();

        colorList.add(Color.ORANGE);
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.ORANGE);

        return colorList;

    }
}
