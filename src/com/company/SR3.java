package com.company;

public class SR3 {

    public static void main(String[] args) {
        int a = f1(18);
        int s = 0;
        while(a>0){
            s+=a%10;
            a/=10;
        }
        System.out.println(s);

        int j=0;
        for(int i = 1; i<=100; i++) if(f2(i)%3 == 0) j++;
        System.out.println(j);

        System.out.println(f3(5, 0.5));

        System.out.println(f4(1, 20));
    }

    public static int f1(int x){
        int a = 1, b = 1, c, d;
        for(int i = 2; i <= x; i++){
            c = a + 3*b;
            d = a - 2*b;
            a = c; b = d;
        }
        return a;
    }

    public static int f2(int n){
        if(n<=3) return n;
        else{
            if(n%2 == 0) return n + f2(n-1);
            else return n*n + f2(n-2);
        }
    }

    public static double f3(int n, double x){
        double a = Math.sqrt(x*n);
        for(int i = n-1; i >= 1; i--){
            a = Math.sqrt(i*x+a);
        }
        return a;
    }

    public static double f4(double i, double n){
        if (i == n) return 0;
        return 1/((2*i-1) + f4(i+1, n));
    }
}
