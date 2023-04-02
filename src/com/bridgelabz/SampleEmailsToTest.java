package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmailsToTest {
    Scanner input = new Scanner(System.in);

    public void gmail(String[] gmailList) {
        Pattern pattern = Pattern.compile("^[a-z0-9+.-]+@[a-z0-9.]+$");
        int c = 0;
        for (String gmail : gmailList) {
            c++;
            Matcher matcher = pattern.matcher(gmail);
            if (matcher.matches())
                System.out.println(c + "  gmail is: " + gmail);
            else
                System.out.println(c + "Invalid");
        }
    }
    public static void main(String args[]){
        String[] gmailList= new String[]{"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
        SampleEmailsToTest sampleEmailsToTest = new SampleEmailsToTest();
        sampleEmailsToTest.gmail(gmailList);
    }
}
