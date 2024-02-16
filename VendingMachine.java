import java.util.Scanner;

// Creating a snack class
class Snack {
    // Declaring and initializing the attributes
    private String name;
    private double price;

    Snack(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + " $" + this.price;
    }
  }

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //sets up scanner

        Snack[] snackCollect = new Snack[10];

        //creating all the snack objects
        snackCollect[0] = new Snack("Snickers", 1.50); //$1.50
        snackCollect[1] = new Snack("Poptarts", 1.25); //$1.25
        snackCollect[2] = new Snack("Sun Chips", 2.00); //$2.00
        snackCollect[3] = new Snack("Reese's Peanut Butter Cups", 1.50); //$1.50
        snackCollect[4] = new Snack("Trail Mix", 3.00); //$3.00
        snackCollect[5] = new Snack("Granola Bars", 2.50); //$2.50
        snackCollect[6] = new Snack("Cheez-its", 2.00); //$2.00
        snackCollect[7] = new Snack("Pretzels", 2.50); //$2.50
        snackCollect[8] = new Snack("Chex Mix", 2.50); //$2.50
        snackCollect[9] = new Snack("Sour Patch Kids", 3.50); //$3.50

        System.out.println("Hello! Please pick the snack you want from the vending machine.");
        System.out.println("The options are:");
        for (int i=1; i<=10; i++) {
            System.out.println(i+". " + snackCollect[i-1].toString());
        }
        
        // Prompts the user to purchase an item.
        System.out.print("Enter the number of the item you want to order: ");
        int selection = input.nextInt();

        Snack chosen = snackCollect[selection-1];
        double price = chosen.getPrice();
        System.out.println();
        System.out.println("You selected " + chosen.getName() + " which costs $" + price);
        System.out.print("How much money would you like to put? We can only take $1 bills: ");
        int bills = input.nextInt();

        double change = bills-price;
        if (change < 0) {
            System.out.println("Insufficient cash.");
        } else {
            if (change > 0) {
                System.out.println("Your change is $"+change);
            } else {
                System.out.println("You currently have no change");
                
            }
            System.out.println("Thank you and have a nice day :)");
        }
    }
}