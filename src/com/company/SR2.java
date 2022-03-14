package com.company;

public class SR2 {

    static int n = 0;

    public static void main(String[] args) {
        f1(102, 5, false);
        System.out.println(n);
    }

    public static void f1(int x, int y, boolean t){
        if (x == y && t){
            n++;
        }
        else if (x > y){
            if (x == 43) t = true;
            f1(x-8, y, t);
            f1(x/2, y, t);
        }
    }
}