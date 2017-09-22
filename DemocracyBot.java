
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void reverse() {
        turnLeft();
        turnLeft();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void faceNorth() {
        while(!facingNorth()){
            turnLeft();
        }
    }
    
    public void faceSouth() {
        while(!facingSouth()){
            turnLeft();
        }
    }
    
    public void faceEast() {
        while(!facingEast()){
            turnLeft();
        }
    }
    
    public void fixBallots() {
        move();
        for(int x = 0; x < 5; x++){
            if(nextToABeeper()){
                faceNorth();
                move();
                if(!nextToABeeper()){
                    putBeeper();
                }
                if(!nextToABeeper()){
                    putBeeper();
                }
                faceSouth();
                moveTwo();
                if(!nextToABeeper()){
                    putBeeper();
                }
                if(!nextToABeeper()){
                    putBeeper();
                }
                reverse();
                move();
            }
            else{
                faceNorth();
                move();
                if(nextToABeeper()){
                    pickBeeper();
                }
                if(nextToABeeper()){
                    pickBeeper();
                }
                faceSouth();
                moveTwo();
                if(nextToABeeper()){
                    pickBeeper();
                }
                if(nextToABeeper()){
                    pickBeeper();
                }
                reverse();
                move();
            }
            faceEast();
            moveTwo();
        }
    }
}
