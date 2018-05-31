import java.util.ArrayList;
import java.util.Scanner;
    public class Post {
        String posty;


        public Post (String posty) {
            this.posty = posty;


        }



        public String getDescription()
        {
            return  posty;
        }
        public String printPosts() {
            return "Post: " + posty;
        }

    }

