import static java.lang.System.out;
import java.util.Scanner;
public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

out.println("The sales goal for Veggies is " + goalForVeggies + ".");
        out.println ("How many Veggies did you sell?");
        int veggiesSold = keyboard.nextInt ();
        if (veggiesSold > goalForVeggies)
        {
            out.println("Made goal for Veggies!");
        }
            else {
            out.println("Goal for Veggies not met.");
        }
        out.println(" ");

        out.println("The sales goal for Burgers is " +
                goalForBurgers + ".");

        out.println ("How many Burgers did you sell?");

        int burgersSold = keyboard.nextInt();
        if (burgersSold > goalForBurgers)
        {
            out.println("Made goal for Burgers!");
        }
            else {out.println("Goal for Burgers not met.");
        }
        out.println(" ");

        out.println("The sales goal for Subs is " + goalForSubs + ".");

        out.println ("How many Subs did you sell?");

        int subsSold = keyboard.nextInt();
        if (subsSold > goalForSubs)
        {
            out.println("Made goal for Subs!");
        }
            else {
            out.println("Goal for Subs not met.");
        }

        out.println(" ");

        out.println("The sales goal for Soup is " + goalForSoup + ".");

            out.println("How many orders of Soup did you sell?");
        int soupSold = keyboard.nextInt();
        if (soupSold > goalForSoup)
        {
            out.println("Made goal for Soup!");
        }
            else {
            out.println("Goal for Soup not met.");
        }

        out.println(" ");

        if (veggiesSold>goalForVeggies && burgersSold>goalForBurgers
                && subsSold>goalForSubs && soupSold>goalForSoup)
        {
            out.println("Made Goal for Everything!");
        }
    }}


