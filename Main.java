public class Main{
    public static void main(String[] args){
        Player player = new Player();
        String userInput;
        do{
            player.takeTurns();
            System.out.println("Play again? (Y/N)");
            userInput = CheckInput.getString();
            System.out.println();
            while(!userInput.equalsIgnoreCase("Y") && !userInput.equalsIgnoreCase("N") ){
                System.out.println("Invalid input");
                System.out.println("Play again? (Y/N)");
                userInput = CheckInput.getString();
                System.out.println();
            }
        }
            while(userInput.equalsIgnoreCase("Y"));
            System.out.println("Game Over");
            System.out.println("Final Score = " + player.getPoints() + " points");
     }
}