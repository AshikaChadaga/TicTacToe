package com.brideglabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	public static Scanner scannerObject = new Scanner(System.in);
	public static char[] board = new char[10];
	public static char player,computer;
	public static boolean playerStarts;
	
	public static void createBoard(){
		for(int index = 1 ; index<10 ; index++) {
			board[index] = ' ';
		}
	}
	
	public static void getPlayerChoice() {

		 System.out.print("select X or O : ");
		 player = Character.toUpperCase(scannerObject.next().charAt(0));
		 
		 if (player == 'X')
			 computer='O';
		 else
			 computer ='X';
		 System.out.println("You have selected : " +player);
		 System.out.println("Computer's choice is : " +computer);
	}
	
	
	public static void showBoard() {
		System.out.println();
        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
        System.out.println("------------------");
        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
        System.out.println("------------------");
        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
	}
	
	public static boolean userMove(int userInput) {
		
		if(board[userInput] != 'X' && board[userInput] != 'O') {
			System.out.println("Cell is free");
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void desiredMove(){
		System.out.println("\nEnter the index where you want to make your move: (1-9)");
		int userInput = scannerObject.nextInt();
		if(userMove(userInput))
			board[userInput] = player;
		else {
			System.out.println("Cell already occupied!. Choose a different cell;");
		}
		showBoard();
		String winnerResult = checkForWinner();
		if(winnerResult == "") {
			System.out.println("Computer's Turn");
		}
		else {
			System.out.println(winnerResult);
		}
		
	}
	
	public static void checkToss() {
		int playerFirst = 1;
		double tossResult = Math.floor(Math.random() * 10) % 2;
		if (tossResult == playerFirst) {
			playerStarts = true;
			System.out.println("\nPlayer Won The Toss! Player Starts");
		} else {
			playerStarts = false;
			System.out.println("\nComputer Won The Toss! Computer Starts");
		}
	}
	
	public static String checkForWinner() {
		System.out.println();
		if ((board[1] == board[2]) && (board[2] == board[3])) {
			if (player == board[1]) {
				return "Player Wins";
			} else if (computer == board[1]) {
				return "Computer Wins";
			}
		} else if ((board[4] == board[5]) && (board[5] == board[6])) {
			if (player == board[4]) {
				return "Player Wins";
			} else if (computer == board[4]) {
				return "Computer Wins";
			}
		} else if ((board[7] == board[8]) && (board[8] == board[9])) {
			if (player == board[7]) {
				return "Player Wins";
			} else if (computer == board[7]) {
				return "Computer Wins";
			}
		} else if ((board[1] == board[4]) && (board[4] == board[7])) {
			if (player == board[4]) {
				return "Player Wins";
			} else if (computer == board[4]) {
				return "Computer Wins";
			}
		} else if ((board[2] == board[5]) && (board[5] == board[8])) {
			if (player == board[2]) {
				return "Player Wins";
			} else if (computer == board[2]) {
				return "Computer Wins";
			}
		} else if ((board[3] == board[6]) && (board[6] == board[9])) {
			if (player == board[3]) {
				return "Player Wins";
			} else if (computer == board[3]) {
				return "Computer Wins";
			}
		} else if ((board[1] == board[5]) && (board[5] == board[9])) {
			if (player == board[1]) {
				return "Player Wins";
			} else if (computer == board[1]) {
				return "Computer Wins";
			}
		} else if ((board[3] == board[5]) && (board[5] == board[7])) {
			if (player == board[3]) {
				return "Player Wins";
			} else if (computer == board[3]) {
				return "Computer Wins";
			}
		} else {
			return "Draw";
		}
		return "";
	}
		
	public static void main(String[] args) {
		
		System.out.println("----- Welcome To The Game Of Tic Tac Toe -----\n");
		createBoard();
		getPlayerChoice();
		checkToss();
		showBoard();
		desiredMove();
		

	}

}
