public class Main{
    public static void main(String[] args){
        Player player = new Player();
        boolean userInput;
        do{
            player.takeTurns();
            System.out.println("Play again? (Y/N)");
            userInput = CheckInput.getYesNo();
            System.out.println();
            
        }
            while(userInput == true);
            System.out.println("Game Over");
            System.out.println("Final Score = " + player.getPoints() + " points");
     }
}