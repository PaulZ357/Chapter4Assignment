import java.util.Scanner;

// Creating a snack class
class Snacks {
    // Declaring and initializing the attributes
    private String name;
    private String price;

    Snacks(String name, String price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    String getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + " " + this.price;
    }
  }

public class VendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //sets up scanner

        Snacks[] snackCollect = new Snacks[10];

        //creating all the snack objects
        snackCollect[0] = new Snacks("Snickers", "$1.50");
        snackCollect[1] = new Snacks("Poptarts", "$1.25");
        snackCollect[2] = new Snacks("Sun Chips", "$2.00");
        snackCollect[3] = new Snacks("Reese's Peanut Butter Cups", "$1.50");
        snackCollect[4] = new Snacks("Trail Mix", "$3.00");
        snackCollect[5] = new Snacks("Granola Bars", "$2.50");
        snackCollect[6] = new Snacks("Cheez-its", "$2.00");
        snackCollect[7] = new Snacks("Pretzels", "$2.50");
        snackCollect[8] = new Snacks("Chex Mix", "$2.50");
        snackCollect[9] = new Snacks("Sour Patch Kids", "$3.50");

        System.out.println("Hello! Please pick the snack you want from the vending machine.");
        System.out.println("The options are:");
        for (int i=1; i<=10; i++) {
            System.out.println(i+". " + snackCollect[i-1].toString());
        }
        
        // Prompts the user to purchase an item.
        System.out.print("Enter the number of the item you want to order: ");
        int selection = input.nextInt();

        System.out.println("You selected " + snackCollect[selection-1].getName() + " which costs " + snackCollect[selection-1].getPrice());
        System.out.println("How much money would you like to put into the machine? This machine only takes $1");
        int bills = input.nextInt();

    }
}