public class Player{
    private Die dice[];
    private int points;
    public Player(){
        dice = new Die[3];
        points = 0;
        for(int i = 0; i < dice.length; i++){
            dice[i] = new Die(6);
        }
    }
    public void sort(){
        int min;
        for(int i = 0; i < dice.length - 1; i++){
            min = i;
            for(int j= i+1; j < dice.length; j++){
                if(dice[j].compareTo(dice[min]) < 0){
                    min = j;
                }
            if(min != i){
                Die temp = dice[i];
                dice[i] = dice[min];
                dice[min] = temp;
            }
            }
        }

    }
    public boolean twoSame(){
        return(dice)

    }


}