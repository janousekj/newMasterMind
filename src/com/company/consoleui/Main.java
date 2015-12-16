package com.company.consoleui;

import com.company.domain.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Game game;
        game = new Game(new Treasure(createList()));
        Result result = game.addGuess(getGuess(game));
        showResult(result, game);

        }

    private static List<Color> createList (){
        java.util.List<Color> colorList = new ArrayList<Color>();

        colorList.add(Color.ORANGE);
        colorList.add(Color.RED);
        colorList.add(Color.GREEN);
        colorList.add(Color.ORANGE);

        return colorList;

    }

    private static void showResult(Result cr, Game game) {
        if(cr.getCorrectColorAndPlace() != game.getNUM_OF_PIECES()){
            System.out.println("Tefil jsi:" + cr.getCorrectColor() + " barev a " + cr.getCorrectColorAndPlace() + " pozic");
        }
        else{
            System.out.println("Jsi mastermind!");
            System.exit(0);
        }
    }

    private static Guess getGuess(Game game) throws IOException {
        int count = 0;
        List<Color> guessList = new ArrayList<Color>();
        System.out.println("Start");

        char inputChar = ' ';
        while (game.getAttempt() < game.getNUM_OF_ATTEMPS()) {
            count = 0;
            while (count < game.getNUM_OF_PIECES()) {

                System.out.println("Hadej barvy");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String input = br.readLine();
                inputChar = input.charAt(0);
                System.out.println(inputChar);
                if (input.length() > 1) {
                    System.out.println("Lze zadat jen jedno znamenko");

                } else if (game.getMyTreasure().getColorList().contains(Color.parse(inputChar))) {

                    guessList.add(count, Color.parse(inputChar));
                    count++;


                }

            }
            return new Guess(guessList);

        }

        return null;

    }
}
