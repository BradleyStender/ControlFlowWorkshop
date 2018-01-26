package com.company;

import java.util.ArrayList ;

public class Main {

    public static void main(String[] args) {

        //while loop

        boolean whilecondition = true;
        int count = 0;

        while(whilecondition){
            System.out.println("Our while loop is true. Adding 1 to our count");
            whilecondition = false;
        }

        // Do while

        boolean dowhilecondition = true;
        count = 0;

        do {
            System.out.println("our do while condition is true. adding 1 to our count");
            count = count + 1;
            if (count == 3) {
                System.out.println("our count is at 3");
                dowhilecondition = false;
            }
        } while (dowhilecondition);

        //for loops

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        //foreach

        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add ("Apple");
        fruit.add ("Banana");
        fruit.add ("Orange");
        fruit.add("Strawberry");
        fruit.add("Grape");

        for(String food : fruit) {
            if (food.contains("b")|| food.contains("B")) {
                System.out.println(food);
            }
        }


    }


}
