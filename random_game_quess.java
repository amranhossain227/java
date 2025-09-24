import java.util.Scanner;

public class random_game_quess {
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("Guess the number between 0 to 9");
        int i = Integer.parseInt(k.nextLine());
        int number = (int)(Math.random() * 10);
        if (number == i){
            System.out.println("You are right! "+number);
        } else {
            System.out.println("Try again! The number was " + number);
        }
    }
    
}
