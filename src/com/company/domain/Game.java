package com.company.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Janoušek on 10. 12. 2015.
 */


public class Game {
    private int NUM_OF_ATTEMPS;
    private Treasure myTreasure;
    private int NUM_OF_PIECES;
    private AttemptHistory attHist = new AttemptHistory();


    public AttemptHistory getAttHist() {
		return attHist;
	}

	public int getAttempt() {
        return attempt;
    }

    public int getNUM_OF_PIECES() {
        return NUM_OF_PIECES;
    }

    public Treasure getMyTreasure() {
        return myTreasure;
    }

    private int attempt = 0;

    public Game(Treasure myTreasure, int NUM_OF_ATTEMPS) {
        this.myTreasure = myTreasure;
        this.NUM_OF_ATTEMPS = NUM_OF_ATTEMPS;
        this.NUM_OF_PIECES = myTreasure.getColorList().size();
    }

    public Game(Treasure myTreasure) {
        this.myTreasure = myTreasure;
        this.NUM_OF_ATTEMPS = 5;
        this.NUM_OF_PIECES = myTreasure.getColorList().size();
    }

    public int getNUM_OF_ATTEMPS() {
        return NUM_OF_ATTEMPS;
    }

    /**
     *
     * @param guess
     * @return Returns Result object
     */
    public Result addGuess(Guess guess) {
        int  matchColors = 0;
        int matchPositions = 0;
        this.attempt++;
        List<Color> inputArr = guess.getInput_list();

        for (int i = 0; i < inputArr.size(); i++) {

            if (myTreasure.getColorList().get(i) == inputArr.get(i)) {
                matchPositions++;
            }
        }
        List<Integer> alreadyMatch = new ArrayList<Integer>();


        for (Color color : myTreasure.getColorList()) {
            for (int i = 0; i < inputArr.size(); i++) {
                if (color == inputArr.get(i) && !alreadyMatch.contains(i)) {
                    alreadyMatch.add(i);
                    matchColors++;
                    break;
                }
            }
        }
        matchColors -= matchPositions;
        return new Result(matchColors,matchPositions);

    }
}

