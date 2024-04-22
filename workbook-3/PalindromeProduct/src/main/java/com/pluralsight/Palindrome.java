package com.pluralsight;

public class Palindrome {
    public static void main(String[] args) {
        String palindromeString;
        String palindromeReverseString;
        int product;
        for (int i=0; i<=999; i++) {
            for (int j=0; j<=999; j++) {
                product = i*j;
                palindromeString = String.valueOf(product);
        StringBuilder sb = new StringBuilder(palindromeString);
                palindromeReverseString = sb.reverse().toString();
                System.out.println(palindromeString);
                System.out.println(palindromeReverseString);

            }
        }
    }
}
