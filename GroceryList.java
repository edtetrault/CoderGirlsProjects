import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String itemOne;
        out.println("Please list three items on your grocery list. ");
        out.print("Item 1?");
        itemOne = keyboard.next();
        keyboard.skip("\n");
        out.println(" ");
        String itemTwo;
        out.print("Item 2?");
        itemTwo = keyboard.next();
        keyboard.skip("\n");
        out.println(" ");
        String itemThree;
        out.print("Item 3?");
        itemThree = keyboard.next();
        keyboard.skip("\n");
        out.println(" ");
        out.println(" ");

        int itemOneQuantity;
        out.println("Now, please enter the quantity of each item");
        out.print("How many " + itemOne + "?");
        itemOneQuantity = keyboard.nextInt();
        keyboard.skip("\n");
        out.println(" ");
        int itemTwoQuantity;
        out.print("How many " + itemTwo + "?");
        itemTwoQuantity = keyboard.nextInt();
        keyboard.skip("\n");
        out.println(" ");
        int itemThreeQuantity;
        out.print("How many " + itemThree + "?");
        itemThreeQuantity = keyboard.nextInt();
        keyboard.skip("\n");
        out.println(" ");
        out.println(" ");
        float itemOneCost;
        out.println("Now please enter the quantity of each item.");
        out.print("How much does one " + itemOne + " cost?");
        itemOneCost = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println(" ");
        float itemTwoCost;
        out.print("How much does one " + itemTwo + " cost?");
        itemTwoCost = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println(" ");
        float itemThreeCost;
        out.print("How much does one " + itemThree + " cost?");
        itemThreeCost = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println(" ");
        out.println(" ");
        out.println("Calculating your grocery bill.");
        float totalCost;
        totalCost = (itemOneCost * itemOneQuantity) + (itemTwoCost * itemTwoQuantity) + (itemThreeCost * itemThreeQuantity);
        out.println("Your total cost is " + totalCost);
    }
}





