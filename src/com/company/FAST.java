package com.company;

import java.util.Arrays;
import java.util.Random;

public class FAST {

    static int[] a = new int[20];

    public static void main(String args[]){
        for (int i = 0; i <= a.length-1; i++) a[i] = new Random().nextInt(1, 30);
        System.out.println(Arrays.toString(a));
        int k = 19;
        searchFAST(k-1);
        System.out.println(k + ": " + a[k-1]);
        sortFAST(0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void sortFAST(int L, int R){
        int t, m;
        while(L<R){
            m = L;
            for (int i = L+1; i <= a.length-1; i++){
                if(a[i] < a[L]){
                    m++;
                    //swap a[m], a[i]
                    t = a[m];
                    a[m] = a[i];
                    a[i] = t;
                }
            }
            //swap a[L], a[m]
            t = a[L];
            a[L] = a[m];
            a[m] = t;

            if (L < m-1) sortFAST(L, m-1);
            L = m+1;
        }

    }

    public static void searchFAST(int k){
        int t, m = 0, L = 0, R = a.length-1;
        while(L<R){
            m = L;
            for (int i = L+1; i <= a.length-1; i++){
                if(a[i] < a[L]){
                    m++;
                    //swap a[m], a[i]
                    t = a[m];
                    a[m] = a[i];
                    a[i] = t;
                }
            }
            //swap a[L], a[m]
            t = a[L];
            a[L] = a[m];
            a[m] = t;

            if (k < m) R = m-1;
            else L = m+1;
        }
    }
}
