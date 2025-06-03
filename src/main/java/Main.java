import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int userAge = input.nextInt();
        int remainingAge = 100 - userAge;

        System.out.println("You have " + remainingAge + " years until you are 100.");

        input.close();
    }
}
