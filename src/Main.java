import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String uMove = getUserMove();
        String cMove = getComputerMove();
        System.out.println("You played "+uMove+" Computer played "+cMove);
        System.out.println(whoWon(uMove,cMove,'\u2764'));
    }

    private static String getComputerMove(){
        String move="";
        Random rn = new Random();

        /// Return a random move in the form of a string of either
        /// "Rock", "Paper", or "Scissors"

        int index = rn.nextInt(3);
        switch (index){
            case 0:
                move="Rock";
                break;

            case 1:
                move="Paper";
                break;

            case 2:
                move="Scissors";
                break;
            default:
                return  "input error";
        }
        return  move;
    }


    private static String getUserMove(){
        String move="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a character: ");
        System.out.println("r: Rock");
        System.out.println("p: Paper");
        System.out.println("s: Scissors");
        String uc = scanner.next();
        switch (uc){
            case "r":
                move="Rock";
                break;

            case "p":
                move="Paper";
                break;

            case "s":
                move="Scissors";
                break;
            default:
                return  "input error";
        }
        return  move;
    }


    private static String whoWon(String playerMove, String computerMove, char heart){

        /// Determine if the player or the computer won
       /// by comparing [playerMove] to [computerMove]
      ///

        if (playerMove == computerMove) {
            //if the same, it's a tie
            return "Tie";
        } else if (playerMove == "Rock" && computerMove == "Scissors") {
            return "You Win! "+heart;
        } else if (playerMove == "Scissors" && computerMove == "Paper") {
            return "You Win! "+heart;
        } else if (playerMove == "Paper" && computerMove == "Rock") {
            return "You Win! "+heart ;
        } else {
            // if it's not a tie and you didn't win, computer won
            return "Computer Wins!" ;
        }
    }
}