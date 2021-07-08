package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("I am chatty bot");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println("Data I was created");
        System.out.println("Ask for your name?!");
    }
}
