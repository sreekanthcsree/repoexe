package com.interviewQuestions;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if(n<2) {
            return false;
        }
        for(int i=2;i<=n/2;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int n=7;
        if(isPrime(n)) {
            System.out.println("the number is prime");
        }else {
            System.out.println("the number is not prime");
        }

    }
}
