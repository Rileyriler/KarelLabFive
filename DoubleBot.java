


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        // put your code here
        move();
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        int i = beepers;
        while(i > 0) {
            putBeeper();
            i --;
        }
        int j = beepers + beepers;
        move();
        while(j > 0) {
            putBeeper();
            j --;
        }
        move();
        }
    }

