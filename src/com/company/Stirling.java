package com.company;

public class Stirling {

    public static void main(String[] args) {
        int k = 10;
        for(int i = 1; i <= k; i++){
            System.out.println(Math.abs(1 - Stirling(i)/fact(i)));
        }
    }

    public static double Stirling(long n){
        return Math.sqrt(2*Math.PI*n)*Math.pow(n/ Math.exp(1), n);
    }

    public static long fact(long n){
        long k = 1;
        for(int i = 2; i <= n; i++){
            k*=i;
        }
        return k;
    }
}
