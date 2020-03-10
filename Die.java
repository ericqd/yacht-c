/**
 * Author:Eric Dao
 * Date: 3/9/2020
 */
public class Die{
    /**
     * Instance Variables
     */
    private int sides;//number of sides
    private int dieVal;// value of die
    public Die(int s){
        sides = s;
        dieVal = roll();
    }
    /**
     * Rolls die and return result
     * @return dieVal
     */
    public int roll(){
        dieVal = (int)(Math.random() * sides ) + 1; 
        return dieVal;
    }
    /**
     * Retrieves value
     * @return dieVal
     */
    public int getDieVal(){
        return dieVal;
    }
    /**
     * Sets die to parameter value
     * @param value
     * @return
     */
    public boolean setDiceVal(int value){
        if(value > 0 && value <= sides){
            dieVal = value;
            return true;
        }
        return false;
    }
    /**
     * return if this die and other die are equal
     * @param dice
     * @return
     */
    public boolean equals(Die dice){
        return(dieVal == dice.getDieVal());    
    }
    /**
     * compares this die and other die
     * @param dice
     * @return
     */
    public int compareTo(Die dice){
        if(dieVal < dice.getDieVal()){
            return -1;
        }
        else if(dieVal > dice.getDieVal()){
            return 1;
        }
        else{
            return 0;
        }
    }
}