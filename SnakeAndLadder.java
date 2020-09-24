package com.bridgelabz.snakeAndLadder;

public class SnakeAndLadder {
	//Constants
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2; 

	public static void main(String[] args) {
		
		
		//Variables
		int position = 0;
		
		//Welcome message
		System.out.println("Welcome to Snake and Ladder!!");
		
		//Starting position
		System.out.println("Starting Position: "+position); 
		
		int numberOnDie = (int)(Math.floor(Math.random()*10) % 6 + 1);
		System.out.println(numberOnDie);
		
		int optionCheck = (int)(Math.floor(Math.random()*10) % 3);
		System.out.println("Option "+optionCheck); 
		
		//Checking of options No Play, Ladder or Snake
		if(optionCheck==LADDER) {
			position+= numberOnDie;
			if(position>100)
				position-= numberOnDie;
		}
		else if(optionCheck==SNAKE) {
			position-= numberOnDie;
		}
		else {
			position = position;
		}
		System.out.println(position);
	
	}
	
}
