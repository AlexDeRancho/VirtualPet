import java.util.Scanner;

public class VirtualPet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int happiness = 5;
        int hunger = 5;
        int energy = 5;
        int choice = 0;
        
        System.out.println("Welcome to Virtual Pet Simulator!");
        System.out.println("Your pet's name is Mr. Pickles.");
        
       
        while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5) {
            
            // TODO 2:
            System.out.println("\n--- Mr. Pickles' Stats ---");
            System.out.println("Happiness: " + happiness + "/15");
            System.out.println("Hunger: " + hunger + "/10");
            System.out.println("Energy: " + energy + ">0");
            System.out.println("-------------------------");
            
            System.out.println("What would you like to do?");
            System.out.println("1. Feed");play
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Bath");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            
            choice = input.nextInt();
            
            // TODO 3:
            if (choice == 1) {
                System.out.println("\n* Your pet ate the food! *");
                happiness += 1;
                hunger -= 3;
               
            } else if (choice == 2) {
                System.out.println("\n* You throw a ball and Mr. Pickles chases it with pure joy! *");
                happiness += 3;
                hunger += 2;
                energy -= 2;
            } else if (choice == 3) {
                System.out.println("\n* Mr. Pickles is tired. *");
                happiness -= 1;
                hunger += 1;
                energy += 3;
            } else if (choice == 4) {
                System.out.println("\n* Splash! Mr. Pickles is clean and  energetic. *");
                happiness += 2;
                hunger += 1;
                energy -= 1;
            } else if (choice == 5) {
                System.out.println("\n* Quitting the game*");
            } else {
                System.out.println("\n* Invalid choice! Mr. Pickles tilts his head. *");
            }
            
          
            if (happiness < 0) happiness = 0;
            if (hunger < 0) hunger = 0;
            if (energy < 0) energy = 0;
        }
        
        // TODO 4
        System.out.println("\n=== GAME OVER ===");
        if (choice == 5) {
            System.out.println("You decided to quit.Bye Bye!");
        } else if (happiness >= 15) {
            System.out.println("VICTORY! Mr. Pickles is ecstatic and completely happy!");
        } else if (hunger >= 10) {
            System.out.println("Oh no! Mr. Pickles got way too hungry. Game over!");
        } else if (energy <= 0) {
            System.out.println("Mr. Pickles ran completely out of energy and fell asleep on the floor.");
        }
        
        input.close();
    }
}
