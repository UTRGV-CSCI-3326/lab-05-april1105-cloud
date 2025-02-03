import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();
        
        System.out.println("Do you smoke? (True/False): ");
        boolean smoker = scanner.nextBoolean();

        System.out.println("User's Medical Form:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Smoker: " + smoker);

        scanner.close();


    }
}
