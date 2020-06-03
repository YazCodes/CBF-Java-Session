package org.example;

public class fizzBuzz {

    public static void main(String[] args) {

        theFizzBuzz();  //This calls the method

    }

        // fizz buzz
        public static void theFizzBuzz () {   // public static void  - not returning can be seen by anyone, doesn't take any parameters inside

        for (int i = 1; i <=20 ; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("fizz");
            }else if (i % 5 ==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);


            }

        }
    }





    }

