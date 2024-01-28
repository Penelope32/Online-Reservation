package org.example;

public class user {

    String username ;
    String userpassword;

    public user(String username ,String userpassword){
        this.username= username;
        this.userpassword = userpassword ;
    }

    public String getusername(){
        return  username;
    }

    public String getuserpassword(){
        return userpassword ;
    }
}
