
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter an integer (or press Enter to exit):");

        while (true) {   

            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                break;
            }

            try {

                int number = Integer.parseInt(input);
                numbers.add(number);

            } catch (NumberFormatException e) {

                System.out.println("Invalid input. Exiting the loop.");
                break;

            }
        }

        System.out.println("Collected numbers: " + numbers);
        
        int max = 0;
        for(int j : numbers) {
            if(max < j) {
                max = j;
            }
        }

        System.out.println("Maximum number: " + max);
        sc.close();
    }
}
