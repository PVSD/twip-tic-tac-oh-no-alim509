package com.company;

/**
 * Created by al5091 on 12/17/18.
 */
public class DetermineWin {

    String[][] determine;

    public DetermineWin(String[][] determines)
    {
        determine = determines;
    }

    public boolean win(String[][] determiness)
    {
        boolean maybe;

        if (determine[0][0].equals(determine[0][1]) && determine[0][1].equals(determine[0][2]))
            maybe = true;
        else if (determine[1][0].equals(determine[1][1]) && determine[1][1].equals(determine[1][2]))
            maybe = true;
        else if (determine[2][0].equals(determine[2][1]) && determine[2][1].equals(determine[2][2]))
            maybe = true;
        else if (determine[0][0].equals(determine[1][0]) && determine[1][0].equals(determine[2][0]))
            maybe = true;
        else if (determine[0][1].equals(determine[1][1]) && determine[1][1].equals(determine[2][1]))
            maybe = true;
        else if (determine[0][2].equals(determine[1][2]) && determine[1][2].equals(determine[2][2]))
            maybe = true;
        else if (determine[0][0].equals(determine[1][1]) && determine[1][1].equals(determine[2][2]))
            maybe = true;
        else if (determine[0][2].equals(determine[1][1]) && determine[1][1].equals(determine[2][0]))
            maybe = true;
        else
            maybe = false;

        return maybe;
    }
}
