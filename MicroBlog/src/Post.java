import java.util.ArrayList;
import java.util.Scanner;
    public class Post {
        public String posty;
        public String name;
        public int postnumber;

        static int counter = 1;


        public Post (String posty, String name) {
            this.posty = posty;
            this.name = name;
            this.postnumber = counter;
            counter++;


        }



        public String getDescription()
        {
            return  posty;
        }
        public String printPosts() {
            return postnumber + " User: " + name + " Post: " + posty;
        }
        public String getName()
        {
            return name;
        }

    }

