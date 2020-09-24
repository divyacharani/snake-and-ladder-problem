package com.bridgelabz.snakeAndLadder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		
		//Variables
		int position = 0;
		
		//Welcome message
		System.out.println("Welcome to Snake and Ladder!!");
		
		//Starting position
		System.out.println("Starting Position: "+position); 
		
		int numberOnDie = (int)(Math.floor(Math.random()*10) % 6 + 1);
		System.out.println(numberOnDie);
	
	}
	
}
