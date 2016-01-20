package com.company.domain;

/**
 * Created by Jakub Janoušek on 16. 12. 2015.
 */

public enum Color {

    RED("cervena", 'R'),
    BLUE("modra", 'B'),
    YELLOW("zluta", 'Y'),
    GREEN("zelena", 'G'),
    PINK("ruzova", 'P'),
    ORANGE("oranzova", 'O');

    private final String name;
    public final char symbol;

    Color(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    /**
     *
     * @return Returns name of color in String
     */
    public String toString(){
        return this.name;
    }

    /**
     *
     * @param c
     * @return Converts parameter from char to Color
     */
    public static Color parse(char c) {
        for (Color color : Color.values()){
            if (color.symbol == c) {
                return color;
            }
        }
        throw new IllegalArgumentException("Non existing color for this char");
    }

    /**
     *
     * @param c
     * @return You can ask if your char is in enum of colors
     */
    public static boolean match(char c) {
        for (Color color : Color.values()) {
            if (color.symbol == c) {
                return true;
            }
        }
        return false;
    }

}

