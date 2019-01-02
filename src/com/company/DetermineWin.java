package com.company;

/**
 * Created by al5091 on 12/17/18.
 */
public class DetermineWin {

    String[][] determine;

    public DetermineWin(String[][] d)
    {
        determine = d;
    }

    public static boolean winX(StringBuffer board1, StringBuffer board2, StringBuffer board3)
    {
        boolean Xwins;

        if (board1.substring(1, 2).equals(board1.substring(5,6)) && board1.substring(5, 6).equals(board1.substring(9, 10)) && board1.substring(1, 2).equals("X"))
            Xwins = true;
        else if (board2.substring(1, 2).equals(board2.substring(5,6)) && board2.substring(5, 6).equals(board2.substring(9, 10)) && board2.substring(1, 2).equals("X"))
            Xwins = true;
        else if (board3.substring(1, 2).equals(board3.substring(5,6)) && board3.substring(5, 6).equals(board3.substring(9, 10)) && board3.substring(1, 2).equals("X"))
            Xwins = true;
        else if (board1.substring(1, 2).equals(board2.substring(1, 2)) && board2.substring(1, 2).equals(board3.substring(1, 2)) && board1.substring(1, 2).equals("X"))
            Xwins = true;
        else if (board1.substring(5, 6).equals(board2.substring(5, 6)) && board2.substring(5, 6).equals(board3.substring(5, 6)) && board1.substring(5, 6).equals("X"))
            Xwins = true;
        else if (board1.substring(9, 10).equals(board2.substring(9, 10)) && board2.substring(9, 10).equals(board3.substring(9, 10)) && board1.substring(9, 10).equals("X"))
            Xwins = true;
        else if (board1.substring(1, 2).equals(board2.substring(5, 6)) && board2.substring(5, 6).equals(board3.substring(9, 10)) && board1.substring(1, 2).equals("X"))
            Xwins = true;
        else if (board1.substring(9, 10).equals(board2.substring(5, 6)) && board2.substring(5, 6).equals(board3.substring(1, 2)) && board1.substring(9, 10).equals("X"))
            Xwins = true;
        else
            Xwins = false;

        return Xwins;
    }

    public static boolean winO(StringBuffer board1, StringBuffer board2, StringBuffer board3)
    {
        boolean Owins;

        if (board1.substring(1, 2).equals(board1.substring(5,6)) && board1.substring(5, 6).equals(board1.substring(9, 10)) && board1.substring(1, 2).equals("O"))
            Owins = true;
        else if (board2.substring(1, 2).equals(board2.substring(5,6)) && board2.substring(5, 6).equals(board2.substring(9, 10)) && board2.substring(1, 2).equals("O"))
            Owins = true;
        else if (board3.substring(1, 2).equals(board3.substring(5,6)) && board3.substring(5, 6).equals(board3.substring(9, 10)) && board3.substring(1, 2).equals("O"))
            Owins = true;
        else if (board1.substring(1, 2).equals(board2.substring(1, 2)) && board2.substring(1, 2).equals(board3.substring(1, 2)) && board1.substring(1, 2).equals("O"))
            Owins = true;
        else if (board1.substring(5, 6).equals(board2.substring(5, 6)) && board2.substring(5, 6).equals(board3.substring(5, 6)) && board1.substring(5, 6).equals("O"))
            Owins = true;
        else if (board1.substring(9, 10).equals(board2.substring(9, 10)) && board2.substring(9, 10).equals(board3.substring(9, 10)) && board1.substring(9, 10).equals("O"))
            Owins = true;
        else if (board1.substring(1, 2).equals(board2.substring(5, 6)) && board2.substring(5, 6).equals(board3.substring(9, 10)) && board1.substring(1, 2).equals("O"))
            Owins = true;
        else if (board1.substring(9, 10).equals(board2.substring(5, 6)) && board2.substring(5, 6).equals(board3.substring(1, 2)) && board1.substring(9, 10).equals("O"))
            Owins = true;
        else
            Owins = false;

        return Owins;
    }
}