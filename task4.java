import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("___WELCOME TO CURRENCY CONVERTER___");
        System.out.print("Enter your name : ");
        String n=scanner.nextLine();
        System.out.println(n+ " Choose the conversion type:");
        System.out.println("1: USD to INR");
        System.out.println("2: INR to USD");
        System.out.println("3: EUR to INR");
        System.out.println("4: INR to EUR");
        System.out.print("Enter your choice Within 1-4: ");
        int choice = scanner.nextInt();

       
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Step 3: Currency Conversion
        double result = 0;
        String base = "", target = "";

        switch (choice) {
            case 1:
                base = "USD";
                target = "INR";
                result = amount * 83.47;
                break;
            case 2:
                base = "INR";
                target = "USD";
                result = amount * 0.0119804;
                break;
            case 3:
                base = "EUR";
                target = "INR";
                result = amount * 89.10;
                break;
            case 4:
                base = "INR";
                target = "EUR";
                result = amount * 0.0113;
                break;
            default:
                System.out.println("Invalid amount .Could you please enter Valid Amount!");
                scanner.close();
                return;
        }

        System.out.println(n + " Your amount:) ");
        System.out.println("--------------------------------");
        System.out.printf("%.2f %s => %.2f %s\n", amount, base, result, target);
         System.out.println("--------------------------------");

        scanner.close();
    }
}
