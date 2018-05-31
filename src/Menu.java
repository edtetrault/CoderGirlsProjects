
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);
    public static String name;
    private static int nextPostNumber = 0;
    int postNumber;
    public String realName;
    public String email;
    public String picture;
    public String posty;
    private static int nextCounter = 0;
    int counter;
    public static String finished = "";
    public static Users[] users = new Users[3];
    public static Post [] post = new Post[5];
    public static boolean keepGoing = true;


    public static MenuItems[] createMenu() {
        System.out.println("What would you like to do? Press 9 to exit.");

        MenuItems[] option = new MenuItems[5];

        option[0] = new MenuItems("Create a new user");
        option[1] = new MenuItems("Become an existing user");
        option[2] = new MenuItems("Create a post as the current user");
        option[3] = new MenuItems("Print all posts");
        option[4] = new MenuItems("Print all users");

        return option;
    }

    public static void printMenu(MenuItems[] option) {
        for (int counter = 0; counter < option.length; counter++) {
            System.out.println(counter + ". " + option[counter].getDescription1());
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Blog.");
        String item;
        String currentUser="";

        ArrayList<Users> userArray = new ArrayList<>();
        ArrayList<Post> postArray = new ArrayList<>();
        userArray.add(0, new Users("", "", "", ""));
        postArray.add(0, new Post(""));

        System.out.println("You are currently user " + currentUser);

        printMenu(createMenu());
        item = keyboard.next();
        if (item.equals("0")) {
            do {
                System.out.println("Please enter a username: ");
                String name = keyboard.next();
                System.out.println("Please enter your email: ");
                String email = keyboard.next();
                System.out.println("Please enter your real name: ");
                String realName = keyboard.next();
                System.out.println("Please link your profile picture: ");
                String picture = keyboard.next();
                keyboard.skip("\n");

                Users user = new Users (name, email, realName, picture);
                userArray.add (user);

                System.out.println("Great! You are now registered. Please return to the main menu!");
                System.out.println("Would you like to create another user? y/n");
                finished = keyboard.next();

            }
            while (finished.equals("y"));

            if (finished.equals("n")) ;
            {
                Menu.printMenu(Menu.createMenu());
                item = keyboard.next();
            }
        }
        if (item.equals("1")) {
            do {

                for (int i = 1; i < userArray.size(); i++) {
                    System.out.println(i + " " + userArray.get(i).getUsers());
                }
                System.out.println();
                System.out.println("Who are you? Please select your user.");
                int intUser = keyboard.nextInt();
                System.out.println("You are now user " + userArray.get(intUser).userName());
                System.out.println();

                System.out.println("Would you like to return to the main menu? y/n");
                finished = keyboard.next();
                keyboard.skip("\n");
            }

            while (finished.equals("n"));

            if (finished.equals("y")) ;
            {
                Menu.printMenu(Menu.createMenu());
                item = keyboard.next();
            }
        }



            if (item.equals("2")) {
                do {
                    System.out.println("What's on your mind? Type your full post below.");
                    String posty = keyboard.next();
                    keyboard.skip("\n");

                    Post post = new Post(posty);
                    postArray.add (post);

                System.out.println("Would you like to return to the main menu? y/n");
                finished = keyboard.next();
            }

            while (finished.equals("n")) ;

            if (finished.equals("y")) ;
            {
                Menu.printMenu(Menu.createMenu());
                item = keyboard.next();
            }

            }
            if (item.equals("3")) {
                do {
                System.out.println("Here are all of the posts in our system!");
                for (int i = 1; i < postArray.size(); i++) {
                    System.out.println(postArray.get(i).printPosts());
                }
                System.out.println();
                    System.out.println("Would you like to return to the main menu? y/n");
                    finished = keyboard.next();
                }

                while (finished.equals("n")) ;

                if (finished.equals("y")) ;
                {
                    Menu.printMenu(Menu.createMenu());
                    item = keyboard.next();
                }

            }

            if (item.equals("4")) {
            do {
                System.out.println("Here's everyone!");

                for (int counter = 1; counter < userArray.size(); counter++)
                {
                    System.out.println(userArray.get(counter).getUsers());
                }


                System.out.println("Would you like to return to the main menu? y/n");
                finished = keyboard.next();
            }

            while (finished.equals("n")) ;

                if (finished.equals("y")) ;
                {
                    Menu.printMenu(Menu.createMenu());
                    item = keyboard.next();
                }

            }
            }
        }


