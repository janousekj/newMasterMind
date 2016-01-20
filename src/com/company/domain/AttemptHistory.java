package com.company.domain;

import java.util.ArrayList;
import java.util.List;

public class AttemptHistory {

	public AttemptHistory() {
		this.guessHistory = new ArrayList<Guess>();
	}
	private List<Guess> guessHistory;
	
	public void printHistoryList()
	{
		/*for(int i = 0; i<game.getAttHist().getHistoryList().size();i++)
		{
			System.out.println("Pokus "+i+":"+game.getAttHist().getHistoryList().get(i).s_printAttempt());
		}
		*/
		for(int i = 0; i<guessHistory.size();i++)
		{
			System.out.println("Pokus "+i+":"+guessHistory.get(i).s_printAttempt());
		}
	}
	//TODO smazat getHistoryList a poskytnout klientùm bezpeènìjší zpùsob procházení historie
	public void addAttempt(Guess guess)
	{
		guessHistory.add(guess);
	}
	
}
