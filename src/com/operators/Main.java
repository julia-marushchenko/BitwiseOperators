package com.operators;

// Class
public class Main {

    // Method to run java program
    public static void main(String[] args) {

        // Variables
        int a = 6;
        int b = 7;

        // Bitwise AND
        // 0110 & 0111 = 0110 = 6
        System.out.println(" a & b = " + (a & b));

        // Bitwise OR
        // 0110 & 0111 = 0111= 7
        System.out.println(" a | b = " + (a | b));

        // Bitwise XOR
        // 0110 & 0111 = 0001= 1
        System.out.println(" a ^ b = " + (a ^ b));

        // Bitwise NOT
        // ~0000 0000 0000 0110 = 1111 1111 1111 1001 = -7
        System.out.println(" ~a = " + (~a));

    }
}