import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Users {
    private String name;
    private String realName;
    private String email;
    private String picture;




    public Users(String name, String email, String realName, String picture) {
        this.name = name;
        this.email = email;
        this.realName = realName;
        this.picture = picture;




    }
    public String getUsers()
    {
        return "Username: " + name + " " + "Email: " + email + "" + "Real Name: " + realName + "" + "Picture: " + picture;
    }
    public String userName()
    {
        return "Username: " + name;
    }
}

