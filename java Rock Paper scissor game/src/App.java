import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        

        String[] aiPick = {"Rock", "Paper", "Scissors"};
        int scoreComputer = 0, scoreUser = 0;
        Random random = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            String result;
      
            while (true) {
                String computer = aiPick[random.nextInt(2)];
                System.out.println("Pick one - Rock Paper Scissors =");
                String user = scanner.nextLine();
                boolean check = false;
                if (!user.isEmpty()) {
                    user = Character.toUpperCase(user.charAt(0)) + user.substring(1);
                }

                for (String validChoice : aiPick) {
                    if (user.equals(validChoice)) {
                        check = true;
                        break; 
                    }
                }

                if (!check) {
                    System.out.println("Input error! Please choose Rock, Paper, or Scissors.");
                    continue; 
                }
            
                if (user.equals(computer)) {
                    result = "It's a tie!";
                } else if (user.equals("Rock") && computer.equals("Scissors")) {
                    result = "You Win!";
                    scoreUser++;
                } else if (user.equals("Paper") && computer.equals("Rock")) {
                    result = "You Win!";
                    scoreUser++;
                } else if (user.equals("Scissors") && computer.equals("Paper")) {
                    result = "You Win!";
                    scoreUser++;
                } else {
                    result = "Compurter Win!";
                    scoreComputer++;
                }
                

                System.out.println("Total score User - "+scoreUser+", Computer - "+scoreComputer);
                System.out.println("You pick = "+user+"\nComputer pick - "+computer+"\n= "+result);

            
            }
        }



    }
}
