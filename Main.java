package lab6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Request Creation Menu ---");
            System.out.println("1. Create Low Priority Request");
            System.out.println("2. Create Mid Priority Request");
            System.out.println("3. Create High Priority Request");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 4) {
                System.out.println("Exiting program...");
                break;
            }

            

            Request request = null;

            switch (choice) {
                case 1:
                    RequestCreator lowCreator = new LowPriorityConcreteCreator();
                    request = lowCreator.createRequest();
                    break;
                case 2:
                    RequestCreator midCreator = new MidPriorityConcreteCreator();
                    request = midCreator.createRequest();
                    break;
                case 3:
                    RequestCreator highCreator = new HighPriorityConcreteCreator();
                    request = highCreator.createRequest();
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    continue;
            }

            request.setPriority();
            request.setExpire();
            request.setStatus();
            request.processRequest();
        }

        sc.close();
    }
}
