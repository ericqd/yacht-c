/**
 * Author:Eric Dao
 * Date: 3/9/2020
 */
public class Player{
    /**
     * Instance variables
     */
    private Die dice[];//array of dice
    private int points;//player points
    public Player(){
        dice = new Die[3];
        points = 0;
        for(int i = 0; i < dice.length; i++){
            dice[i] = new Die(6);
        }
    }
    /**
     * Sort array in ascending order
     */
    public void sort(){
        int lowest;
        for(int i = 0; i < dice.length - 1; i++){
            lowest = i;
            for(int j= i+1; j < dice.length; j++){
                if(dice[j].compareTo(dice[lowest]) < 0){
                    lowest = j;
                }
            if(lowest != i){
                Die swap = dice[i];
                dice[i] = dice[lowest];
                dice[lowest] = swap;
            }
            }
        }

    }
    /**
     * Checks if the dice have a pair
     * @return true
     */
    public boolean twoSame(){
        return(dice[0].equals(dice[1]) || dice[0].equals(dice[2]) || dice[1].equals(dice[2]));
    }
    /**
     * Checks if dice are all the same
     * @return true
     */
    public boolean isThreeOfKind(){
        return(dice[0]).equals(dice[1]) && dice[0].equals(dice[2]);
    }
    /**
     * Checks if the dice are in a series sequence
     * @return true
     */
    public boolean isSeries(){
        return((dice[0].getDieVal() == dice[1].getDieVal()-1) && (dice[1].getDieVal() == dice[2].getDieVal()-1));
    }
    /**
     * Return string of dice values
     */
    public String toString(){
        return("D1=" + dice[0].getDieVal() + ",D2=" + dice[1].getDieVal() + ",D3=" + dice[2].getDieVal());
    }
    /**
     * Retrieve amount of points
     * @return points
     */
    public int getPoints(){
        return points;
    }
    /**
     * Creates a single turn for player
     */
    public void takeTurns(){
        for(int i =0; i < dice.length; i++){
            dice[i].roll();
        }
        sort();
        System.out.println("Rolling Dice...");
        System.out.println(this);
        if(isThreeOfKind()){
            System.out.println("You got a 3 of a kind");
            points +=3;
        }
        else if(twoSame()){
            System.out.println("You got a pair");
            points +=1;
        }
        else if(isSeries()){
            System.out.println("You got a series of 3!");
            points +=2;
        }
        else{
            System.out.println("Awww. Too bad");
        }
        System.out.println("Score = " + points + " points");
    }


}