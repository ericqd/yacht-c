public class Die{
    private int sides;
    private int dieVal;
    public Die(int s){
        sides = s;
        dieVal = roll();
    }
    public int roll(){
        dieVal = (int)(Math.random() * sides ) + 1;
        return dieVal;
    }
    public int getDieVal(){
        return dieVal;
    }
    public boolean setDiceVal(int value){
        if(value > 0 && value <= sides){
            dieVal = value;
            return true;
        }
        return false;
    }
    public boolean equals(Die dice){
        return(dieVal == dice.getDieVal());    
    }
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