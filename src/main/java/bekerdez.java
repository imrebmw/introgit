import java.util.Scanner;

public class bekerdez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name bro?");
        String name = scanner.nextLine();
        System.out.println("Helloka " + name);

        System.out.println("What's your year of birth mate?");
        int yearob = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Year of birth " + yearob);

        System.out.println("You are " + (2024 - yearob) + " years old.");
    }
}
