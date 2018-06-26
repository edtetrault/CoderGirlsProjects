
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
    public static Post[] post = new Post[5];
    public static boolean keepGoing = true;


    public static MenuItems[] createMenu() {
        System.out.println("What would you like to do?");

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

        ArrayList<Users> userArray = new ArrayList<Users>();
        Users newUser = new Users("Emily", "emily@emily.com", "Emilina", "www.emily.com");
        userArray.add(newUser);
        newUser = new Users("Larry", "larry@emily.com", "Lawrence", "www.larry.com");
        userArray.add(newUser);
        newUser = new Users("Maggie", "Maggie@emily.com", "Margaret", "www.maggie.com");
        userArray.add(newUser);
        newUser = new Users("pug", "pug@emily.com", "Pugland", "www.pug.com");
        userArray.add(newUser);


        ArrayList<Post> postArray = new ArrayList<>();
        Post newPost = new Post("Whoa, today is dumb", "Emily");
        postArray.add(newPost);
        newPost = new Post("I love Indian food.", "Larry");
        postArray.add(newPost);
        newPost = new Post("Pugs not drugs.", "pug");
        postArray.add(newPost);

        userArray.add(0, new Users("", "", "", ""));
        postArray.add(0, new Post("", ""));

        String currentUser = null;
        int intUser = 0;
        System.out.println("Welcome to the Blog.");
        String item;


        System.out.println("You are currently user " + newUser.userName());

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

                Users user = new Users(name, email, realName, picture);
                userArray.add(user);

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
                System.out.println("Who are you? Please choose your user.");
                intUser = keyboard.nextInt();
                currentUser = String.valueOf((userArray.get(intUser).userName()));
                System.out.println("You are now user " + currentUser);
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
                System.out.println("You are currently " + currentUser);
                String lastPost = "";
                if (postArray.isEmpty()){
                    System.out.println("You have no previous posts.");
                }
                for (int counter = (postArray.size()-1); counter >= 0; counter--) {
                    if (postArray.get(counter).getName()== currentUser){
                        lastPost = postArray.get(counter).printPosts();
                        System.out.println("Here is your last post:\n "+ lastPost + "\n");
                        break;
                    }
                    if (counter == 0){
                        System.out.println("You have no previous posts.");
                    }
                }
                    System.out.println("What is on your mind?");
                    String posty = keyboard.next();
                    keyboard.skip("\n");

                    Post post = new Post(posty, currentUser);
                    postArray.add(new Post(posty, currentUser ));

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
                    for (int counter = 0; counter < postArray.size(); counter++) {
                        System.out.println(postArray.get(counter).printPosts());
                    }
                    System.out.println();
                    System.out.println("Would you like to return to the main menu? y/n");
                    finished = keyboard.next();
                }

                while (finished.equals("n"));

                if (finished.equals("y")) ;
                {
                    Menu.printMenu(Menu.createMenu());
                    item = keyboard.next();
                }

            }

            if (item.equals("4")) {
                do {
                    System.out.println("Here's everyone!");

                    for (int counter = 1; counter < userArray.size(); counter++) {
                        System.out.println(userArray.get(counter).getUsers());
                    }


                    System.out.println("Would you like to return to the main menu? y/n");
                    finished = keyboard.next();
                }

                while (finished.equals("n"));

                if (finished.equals("y")) ;
                {
                    Menu.printMenu(Menu.createMenu());
                    item = keyboard.next();
                }

            }
        }
    }





