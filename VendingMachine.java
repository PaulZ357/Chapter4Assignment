import java.util.Scanner;

// Creating a snack class
class Snacks {
    // Declaring and initializing the attributes
    String name;
    String price;

    Snacks(String name, String price) {
        this.name = name;
        this.price = price;
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
        System.out.println("The options are:\n1. " + snackCollect[0].name + " " + snackCollect[0].price + "\n2. " + snackCollect[1].name + " " + snackCollect[1].price + "\n3. " + snackCollect[2].name + " " + snackCollect[2].price + "\n4. " + snackCollect[3].name + " " + snackCollect[3].price);
        System.out.println("5. " + snackCollect[4].name + " " + snackCollect[4].price + "\n6. " + snackCollect[5].name + " " + snackCollect[5].price + "\n7. " + snackCollect[6].name + " " + snackCollect[6].price + "\n8. " + snackCollect[7].name + " " + snackCollect[7].price);
        System.out.println("9. " + snackCollect[8].name + " " + snackCollect[8].price + "\n10. " + snackCollect[9].name + " " + snackCollect[9].price);
        
        // Prompts the user to purchase an item.
        System.out.print("Enter the number of the item you want to order: ");
        int selection = input.nextInt();

        System.out.println("You selected " + snackCollect[selection-1].name + " which costs " + snackCollect[selection-1].price);
        System.out.println("How much money would you like to put into the machine? This machine only takes $1");
        int bills = input.nextInt();

    }
}