package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int position;
        boolean turn = true;
        char symbol = 'X';
        String exampleBoard = " 1 | 2 | 3 \n-----------\n 4 | 5 | 6 \n-----------\n 7 | 8 | 9 ";
        StringBuffer gameBoard1 = new StringBuffer("   |   |   \n-----------\n");
        StringBuffer gameBoard2 = new StringBuffer("   |   |   \n-----------\n");
        StringBuffer gameBoard3 = new StringBuffer("   |   |   ");

        System.out.println("\nThis is a game of X's and O'x.\nWhoever would like to be 'X' can go first.\nPlease pick a position on the board by typing a number from 1 to 9 to choose a spot as shown below.");
        System.out.println("\n" + exampleBoard + "\n");



        while (!DetermineWin.winX(gameBoard1, gameBoard2, gameBoard3) && !DetermineWin.winO(gameBoard1, gameBoard2, gameBoard3)
                && (gameBoard1.substring(1, 2).equals(" ") ||
                gameBoard1.substring(5, 6).equals(" ") ||
                gameBoard1.substring(9, 10).equals(" ") ||
                gameBoard2.substring(1, 2).equals(" ") ||
                gameBoard2.substring(5, 6).equals(" ") ||
                gameBoard2.substring(9, 10).equals(" ") ||
                gameBoard3.substring(1, 2).equals(" ") ||
                gameBoard3.substring(5, 6).equals(" ") ||
                gameBoard3.substring(9, 10).equals(" ")))
        {
            System.out.println("\n" + symbol + "'s turn\n");
            position = sc.nextInt();

            if (position == 1)
            {
                if (gameBoard1.substring(1, 2).equals(" "))
                {
                    gameBoard1.insert(2, symbol);
                    gameBoard1.delete(1, 2);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else if (position == 2)
            {
                if (gameBoard1.substring(5, 6).equals(" "))
                {
                    gameBoard1.insert(6, symbol);
                    gameBoard1.delete(5, 6);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else if (position == 3)
            {
                if (gameBoard1.substring(9, 10).equals(" "))
                {
                    gameBoard1.insert(10, symbol);
                    gameBoard1.delete(9, 10);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else if (position == 4)
            {
                if (gameBoard2.substring(1, 2).equals(" "))
                {
                    gameBoard2.insert(2, symbol);
                    gameBoard2.delete(1, 2);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else if (position == 5)
            {
                if (gameBoard2.substring(5, 6).equals(" "))
                {
                    gameBoard2.insert(6, symbol);
                    gameBoard2.delete(5, 6);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else if (position == 6)
            {
                if (gameBoard2.substring(9, 10).equals(" "))
                {
                    gameBoard2.insert(10, symbol);
                    gameBoard2.delete(9, 10);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else if (position == 7)
            {
                if (gameBoard3.substring(1, 2).equals(" "))
                {
                    gameBoard3.insert(2, symbol);
                    gameBoard3.delete(1, 2);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else if (position == 8)
            {
                if (gameBoard3.substring(5, 6).equals(" "))
                {
                    gameBoard3.insert(6, symbol);
                    gameBoard3.delete(5, 6);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else if (position == 9)
            {
                if (gameBoard3.substring(9, 10).equals(" "))
                {
                    gameBoard3.insert(10, symbol);
                    gameBoard3.delete(9, 10);
                }
                else
                {
                    System.out.println("\nA player has already put a symbol there. Please choose another spot.");
                    turn = !turn;
                }
            }
            else
            {
                System.out.println("\nThat is not a number from 1 to 9. Type a number between that range to place a symbol.");
                turn = !turn;
            }

            System.out.print("\n" + gameBoard1);
            System.out.print(gameBoard2);
            System.out.println(gameBoard3);

            turn = !turn;

            if (turn)
            {
                symbol = 'X';
            }
            else
            {
                symbol = 'O';
            }
        }

        if (DetermineWin.winX(gameBoard1, gameBoard2, gameBoard3))
        {
            System.out.println("\n\nX wins! GG");
        }
        else if (DetermineWin.winO(gameBoard1, gameBoard2, gameBoard3))
        {
            System.out.println("\n\nO wins! GG");
        }
        else
        {
            System.out.println("\n\ntie...");
        }
    }
}
