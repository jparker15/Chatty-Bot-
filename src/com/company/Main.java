package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("I am chatty bot");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String botDoB = formatter.format(date);
        System.out.println("Data I was created:\n" + botDoB);
        System.out.println("What is your name? :");
        String name = input.next();
        System.out.println("Hello " + name);

    }
}
