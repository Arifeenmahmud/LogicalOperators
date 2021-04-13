package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isScreenBig = false;
        boolean isColorOfThePhoneBlack = true;
        boolean isRamEnough = true;
        /*----------&&---------*/
            // false   && true => false
            //true and true =>
            //false and false = false

        System.out.println("&&");
        if(isScreenBig && isColorOfThePhoneBlack){
            System.out.println("I want that Phone");

        }else{
            System.out.println("I don't Want that Phone");

        }
        System.out.println("||");

        // true || true => true
        // true || false => true
        // false || false =>false

        if((isScreenBig || isColorOfThePhoneBlack) && isRamEnough){
            System.out.println("I want that Phone");

        }else{
            System.out.println("I don't Want that Phone");

        }


    }
}
