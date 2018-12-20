package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] board = new String[3][3];
        int turn;
        String position;

        System.out.println("Let's play a game of X's and O'x. Type 1 if you would like to go first and 2 if you would like to play second.");
        turn = sc.nextInt();

        if (turn == 1)
        {
            System.out.println("Okay! Where would you like to place an X? (hint: use positions; (0, 0) would be top-left, (1, 1) would be the middle, etc.");
        }
        else if (turn == 2)
        {
            System.out.println("Okay! Here is my first move.");
        }
        else
        {
            System.out.println("That is not a 1 or a 2, so I will just go first.");
            System.out.println("Okay! Here is my first move.");
            turn = 2;
        }

        if (turn == 1)
        {
            while (DetermineWin.win(board))
        }
    }
}
