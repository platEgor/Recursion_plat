package com.company;

public class SR1 {
    public static void main(String[] args) {
        System.out.println(f1(40));
        System.out.println(f2(40));
        int s = 0;
        for(int i = 40; i <= 50; i++) s += f3(i);
        System.out.println(s);
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
        int a = 5, b = 6, c;
        for(int i = 4; i <= x; i++){
            if(b%2 == 0) c = a + i;
            else c = a + 2*i;
            a = b;
            b = c;
        }
        return b;
    }
}