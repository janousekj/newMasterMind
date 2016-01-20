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
        game = new Game(new Treasure(Treasure.createList()));
        while(game.getAttempt() < game.getNUM_OF_ATTEMPS()){
        	
            Result result = game.addGuess(getGuess(game));
            showResult(result, game);
            showAttemptHistory(game);

        }
        
        gameLost();
        }





    private static String getInput() throws IOException{
        System.out.println("Hadej barvy");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        return input;
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
   private static void gameLost(){
       System.out.println("PROHRA!");
       System.exit(0);
   }
    private static void showAttemptHistory(Game game)
    {
    	game.getAttHist().printHistoryList();
    }

    private static Guess getGuess(Game game) throws IOException {

        int count = 0;
        List<Color> guessList = new ArrayList<Color>();
        System.out.println("Start");


        while (game.getAttempt() < game.getNUM_OF_ATTEMPS()) {
            count = 0;
            while (count < game.getNUM_OF_PIECES()) {
                char inputChar = ' ';
                String input = getInput();
                inputChar = input.charAt(0);
                if (input.length() > 1) {;
                    System.out.println("Lze zadat jen jedno znamenko");

                }
                else if (game.getMyTreasure().getColorList().contains(Color.parse(inputChar)) || (!game.getMyTreasure().getColorList().contains(Color.parse(inputChar)))&& Color.match(inputChar))  {

                    guessList.add(count, Color.parse(inputChar));
                    count++;


                }

            }
          Guess guess = new Guess(guessList);
          
          game.getAttHist().addAttempt(guess);
            return guess;

        }

        return null;

    }
}
