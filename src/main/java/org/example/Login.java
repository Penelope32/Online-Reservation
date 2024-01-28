package org.example;

import java.util.ArrayList;
import java.util.List;
public class Login {

    private  ArrayList<user> userdetails ;

    public Login(){
        userdetails = new ArrayList<>();

        userdetails.add(new user("Penelope","pass"));
        userdetails.add(new user("Moipone","pass2"));
    }

    public Boolean checkUser(String username, String password){

        for(user user : userdetails){

            if(user.getusername().equals(username) && user.getuserpassword().equals(password)){
                    return true;
            }
        }
        return false ;

    }
}
