package com.company;

public class SR1 {
    public static void main(String[] args) {
        System.out.println(f1(40));
        System.out.println(f2(40));
    }

    public static int f(int n) {
        if (n >= 0) {
            if (n == 0) return 1;
            else if (n == 1) return 3;
            else if (n % 2 == 0) return f(n - 1) - f(n - 2) + 3*n;
            else return f(n - 2) - f(n - 3) + 2*n;
        }
        return 0;
    }

    public static int f1(int x){
        int a = 1, b = 3, c, d;
        for(int i = 1; i <= x/2; i++){
            c = b - a + 3*2*i;
            d = b - a + 2*(2*i + 1);
            a = c; b = d;
        }
        x = x%2;
        if (x == 0) return a;
        else return b;
    }

    public static int f2(int x){
        int a = 1, b = 3, c;
        for(int i = 2; i <= x; i++){
            c = b - a +3*i;
            a = b;
            b = c;
        }
        return b;
    }

    public static int f3(int x){
        int i, a = 1, b = 3, c, d;
        for(int i = 0; i <= x/2; i++){
            if (i <= 3)
            c = b - a + 3*2*i;
            d = b - a + 2*(2*i + 1);
            a = c; b = d;
        }
        x = x%2;
        if (x == 0) return a;
        else return b;
    }
}