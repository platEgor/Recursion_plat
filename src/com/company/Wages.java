package com.company;

public class Wages {
    static long n = 0;
    public static void main(String[] args) {
        //System.out.println(abcd(20));
        f(0, 20);
        System.out.println(n);
    }

    public static int abcd(int x){
        int k1 = 1, k2 = 3, k3 = 5, k4 = 10, i = 0;
        for(int a = 0; a <= x/k1; a++){
            for(int b = 0; b <= (x-a*k1)/k2; b++){
                for(int c = 0; c <= (x-a*k1-b*k2)/k3; c++){
                    for(int d = 0; d <= (x-a*k1-b*k2-c*k3)/k4; d++) {
                        if (x == a * k1 + b * k2 + c * k3 + d * k4) i++;
                    }
                }
            }
        }
        return i;
    }

    public static void f(double x, double y){
        if (x == y){
            n++;

        }
        else if (x < y){
            f(f1(x), y);
            f(f2(x), y);
            f(f3(x), y);
            f(f4(x), y);
        }
    }
    public static double f1(double x){return x+1;}
    public static double f2(double x){return x+3;}
    public static double f3(double x){return x+5;}
    public static double f4(double x){return x+10;}
}
