package com.bridgelabz.snakeAndLadder;

public class SnakeAndLadder {
	//Constants
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2; 

	public static void main(String[] args) {
		
		
		//Variables
		int position = 0;
		int dieCounter = 0;
		
		//Welcome message
		System.out.println("Welcome to Snake and Ladder!!");
		
		//Starting position
		System.out.println("Starting Position: "+position); 
		
		//Checking of options No Play, Ladder or Snake
		while(position<100)
		{
			dieCounter++;
			int numberOnDie = (int)(Math.floor(Math.random()*10) % 6 + 1);
			int optionCheck = (int)(Math.floor(Math.random()*10) % 3);
			
			if(optionCheck==LADDER) {
				position+= numberOnDie;
				if(position>100)
					position-= numberOnDie;
			}
			else if(optionCheck==SNAKE) {
				position-= numberOnDie;
				if(position<=0)
					position=0;
			}
			else {
				position = position;
			}
			
			System.out.println("Position "+position);
		}
		System.out.println("Number of times the dice was played "+dieCounter);
	
	}
	
}
