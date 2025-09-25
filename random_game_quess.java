import java.util.Scanner;

public class random_game_quess {
    public static void main(String[] args){
        
        String m = "y";
        Scanner k = new Scanner(System.in);

        while(m.equals("y")){  // <-- FIXED

            System.out.println("Guess the number between 0 to 9");
            int i = Integer.parseInt(k.nextLine());
            int number = (int)(Math.random() * 10);

            if (number == i){
                System.out.println("You are right! " + number);
            } else {
                System.out.println("Try again! The number was " + number);
            }

            // Ask again after each round
            System.out.println("Do you want to play again? (y/n)");
            m = k.nextLine();  // reuse same Scanner
        }

        System.out.println("Thank you for playing!");
    }
}
