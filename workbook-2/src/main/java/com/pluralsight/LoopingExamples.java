package com.pluralsight;

public class LoopingExamples {
    public static void main(String[] args) {
        //What if i wanted to print welcome to Java 10 times?
        /*
        int count = 1;
        int sum = 0;
        while (count<= 10) { //conditional statement
            System.out.println("Welcome to Java");
            sum += count; //accumulation for sum
            count++; //increment count to stop the loop
        }
        System.out.println("The sum of numbers from 1 to 10 is " + sum);
         */

       /*
        int i=1;
        int sum=0;
        do{
            sum+=i;
            i++;
        } while (i<=10);
        System.out.println("The sum of the numbers from 1-10 is "+sum);
        */
        /*
        While we would if we want to check if something is true and then do something,
        do...while we would use if we want to do something and then check if something is true.
         */

        /*
        //for loop
        int sum = 0;
        for (int i=0; i<=10; i++) {
            sum += i; //sum = sum + 1
        }
        System.out.println(sum);

         */
        /*
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {//if the number is divisible by 3, skip it and continue
                continue;//skip 3, 6, 9
            }
            sum += i;
        }
        System.out.println("Sum = " + sum);
        */
        /*
        int num = 10;
        while (num>0) {
            System.out.println(num);
            num--;
        }
        */

        for (int i=10; i>0; i--) {
            System.out.println(i);
        }


    }
}
