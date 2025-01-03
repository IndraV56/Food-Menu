import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Please select a food category:");
        System.out.println("1. Indian");
        System.out.println("2. Chinese");
        System.out.println("3. Japanese");
        System.out.println("4. French");
        System.out.println("5. English");
        int category = scanner.nextInt();
        switch (category) {
            case 1:
                System.out.println("1. Biryani");
                System.out.println("2. Curry");
                System.out.println("3. Dosa");
                System.out.println("Select a dish:");
                int indianDish = scanner.nextInt();
                switch (indianDish) {
                    case 1: 
                        System.out.println("You selected Biryani"); 
                        break;
                    case 2:
                        System.out.println("You selected Curry");
                        break;
                    case 3: 
                        System.out.println("You selected Paneer Dosa");
                        break;
                    default: 
                        System.out.println("Invalid selection.");
                        break;
                }
                break;
            case 2:
                System.out.println("1. Noodles");
                System.out.println("2. Dumplings");
                System.out.println("3. Chinese Noodles");
                System.out.println("Select a dish:");
                int chineseDish = scanner.nextInt();
                switch (chineseDish) {
                    case 1: 
                        System.out.println("You selected Noodles"); 
                        break;
                    case 2: 
                        System.out.println("You selected Dumplings"); 
                        break;
                    case 3: 
                        System.out.println("You selected Chinese Noodles"); 
                        break;
                    default: 
                        System.out.println("Invalid selection"); 
                        break;
                }
                break;
                
            case 3:
                System.out.println("1. Sushi");
                System.out.println("2. Ramen");
                System.out.println("3. Tempura");
                System.out.println("Select a dish:");
                int japaneseDish = scanner.nextInt();
                switch (japaneseDish) {
                    case 1: 
                        System.out.println("You selected Sushi");
                        break;
                    case 2:
                        System.out.println("You selected Ramen");
                        break;
                    case 3:
                        System.out.println("You selected Tempura");
                        break;
                    default: 
                        System.out.println("Invalid selection");
                        break;
                }
                break;

            case 4:
                System.out.println("1. Pasta");
                System.out.println("2. Pizza");
                System.out.println("3. Burger");
                System.out.println("Select a dish:");
                int frenchDish = scanner.nextInt();
                switch (frenchDish) {
                    case 1: 
                        System.out.println("You selected Pasta");
                        break;
                    case 2: 
                        System.out.println("You selected Pizza");
                        break;
                    case 3: 
                        System.out.println("You selected Burger");
                        break;
                    default: 
                        System.out.println("Invalid selection");
                        break;
                }
                break;

            case 5:
                System.out.println("1. Steak");
                System.out.println("2. Apple Pie");
                System.out.println("3. Corn Flakes");
                System.out.println("Select a dish:");
                int englishDish = scanner.nextInt();
                switch (englishDish) {
                    case 1: 
                        System.out.println("You selected Steak"); 
                        break;
                    case 2: 
                        System.out.println("You selected Apple Pie");
                        break;
                    case 3:
                        System.out.println("You selected Corn Flakes");
                        break;
                    default:
                        System.out.println("Invalid selection.");
                        break;
                }
                break;

            default:
                System.out.println("Invalid option selected");
                break;
        } System.out.println("Thank You");
        
        scanner.close();
    }
}
