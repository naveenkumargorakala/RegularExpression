package com.bridgelabz;
import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {
    Scanner input = new Scanner(System.in);
    public void firstName(){
        Pattern pattern = Pattern.compile("^[A-Z][A-Za-z]{2}[A-Za-z]*");
        System.out.println("Enter Name:  ");
        String FirstName= input.next();
        Matcher matcher = pattern.matcher(FirstName);
        if(matcher.matches())
            System.out.println("FirstName is: "+FirstName);
        else
            System.out.println("Invalid");
    }
    public void lastName(){
        Pattern pattern = Pattern.compile("^[A-Z][A-Za-z]{2}[A-Za-z]*");
        System.out.println("Enter Name:  ");
        String lastName= input.next();
        Matcher matcher = pattern.matcher(lastName);
        if(matcher.matches())
            System.out.println("lastName is: "+lastName);
        else
            System.out.println("Invalid");
    }

    public void gmail() {
        Pattern pattern = Pattern.compile("^[a-z0-9]+@[a-z]+.[a-z]+$");
        System.out.println("Enter gmail:  ");
        String gmail= input.next();
        Matcher matcher = pattern.matcher(gmail);
        if(matcher.matches())
            System.out.println("gmail is: "+gmail);
        else
            System.out.println("Invalid");
    }

    public void mobile() {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{10}$");
        System.out.println("Enter mobile number:  ");
        String mobile= input.next();
        Matcher matcher = pattern.matcher(mobile);
        if(matcher.matches())
            System.out.println("mobile Number is: "+mobile);
        else
            System.out.println("Invalid");
    }

    public void password() {
        Pattern pattern = Pattern.compile("^(?=.*[a-z]*[A-Z]*[0-9]).{8,}$");
        System.out.println("Enter Password: ");
        String password= input.next();
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()){
            System.out.println("Password is: "+password);
        }
        else
            System.out.println("Invalid");
    }
}
