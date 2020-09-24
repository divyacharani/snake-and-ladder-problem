package com.bridgelabz.snakeAndLadder;



public class SnakeAndLadder {
	//Constants
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2; 

	public static void main(String[] args) {
		
			
		//Variables
		int positionA = 0;
		int positionB = 0;
		
		SnakeAndLadder obj = new SnakeAndLadder();
		
		//Welcome message
		System.out.println("Welcome to Snake and Ladder!!");
		
		
		while(positionA<100 && positionB<100)
		{
			positionA = obj.dieRolling(positionA);
			if(positionA==100)
			{
				System.out.println("A Won");
				break;
			}
			positionB = obj.dieRolling(positionB);
			if(positionB==100)
			{
				System.out.println("B Won");
				break; 
			}
		}
	}
	public int dieRolling(int position)
	{
		int numberOnDie = (int)(Math.floor(Math.random()*10) % 6 + 1);
		
		int optionCheck = (int)(Math.floor(Math.random()*10) % 3);
		
		//Checking of options No play, Ladder or Snake
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
		if(optionCheck==LADDER)
		{
			position = dieRolling(position);
		}
		return position;
		
	}
	
	

}