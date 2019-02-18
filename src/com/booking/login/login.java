package com.booking.login;

import java.util.Scanner;

public class login {
    public boolean login(administratorlogin account){
        String loginusername;
        String loginpassword;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Admin Name : ");
        loginusername=scanner.nextLine();
        System.out.print("Password : ");
        loginpassword=scanner.nextLine();
        if(account.getUsername().equals(loginusername) && account.getPassword().equals(loginpassword)){
            return true;
        }
        else{
            return false;
        }
    }
}
