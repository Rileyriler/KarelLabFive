
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    private int beepers;
    
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void moveToBeepers() {
        while(!nextToABeeper()) {
            move();
        }
    }
    
    public void countBeepers() {
        beepers = 0;
        while(nextToABeeper()) {
            pickBeeper();
            beepers ++;
        }
    }
    
    public void identifyClue() {
        if(beepers == 4) {
            while(!facingWest()){
                turnLeft();
            }
        }
        if(beepers == 3) {
            while(!facingSouth()){
                turnLeft();
            }
        }
        if(beepers == 2) {
            while(!facingEast()){
                turnLeft();
            }
        }
        if(beepers == 1) {
            while(!facingNorth()){
                turnLeft();
            }
        }
    }
    
    public void findTreasure() {
        while(beepers < 5){
            countBeepers();
            identifyClue();
            moveToBeepers();
        }
    }
    
}

