package com.company;

import java.util.Arrays;
import java.util.Random;

public class SortFAST {

    static int[] a = new int[20];

    public static void main(String args[]){
        for (int i = 0; i < a.length-1; i++) a[i] = new Random().nextInt(1, 30);
        System.out.println(Arrays.toString(a));
        sortFAST(0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void sortFAST(int L, int R){
        int t;
        int m = L;
        for (int i = L+1; i <= a.length-1; i++){
            if(a[i] < a[L]){
                m++;
                //swap a[m], a[i]
                t = a[m];
                a[L] = a[m];
                a[i] = t;
            }
        }
        //swap a[L], a[m]
        t = a[L];
        a[L] = a[m];
        a[m] = t;

        if (L < m-1) sortFAST(L, m-1);
        if (m+1 < R) sortFAST(m+1, R);
    }
}
