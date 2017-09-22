
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int numBeepers;
    
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void reverse() {
        turnLeft();
        turnLeft();
    }
    
    public void choosePile() {
        while(nextToABeeper()){
            pickBeeper();
            numBeepers ++;
        }
        
        if(numBeepers % 2 == 0){
            turnRight();
            move();
            while(nextToABeeper()){
                pickBeeper();
                numBeepers ++;
            }
        }
        else{
            turnLeft();
            move();
            while(nextToABeeper()) {
                pickBeeper();
                numBeepers ++;
            }
        }
        reverse();
        move();
        while(numBeepers > 0){
            putBeeper();
            numBeepers --;
        }
        turnLeft();
        move();
    }
   
}

