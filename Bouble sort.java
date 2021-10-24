package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sort();
    }
    public static void sort()
    {
        System.out.println("Podaj ilość liczb");
        Scanner p=new Scanner(System.in);
        int ilosc, z;
        ilosc=p.nextInt();
        int []T=new int[ilosc];
        if(ilosc>=10){
            System.out.println("Za duża ilość liczb");
            sort();
        }
        System.out.println("Podaj liczby");
        for(int a=0; a<ilosc; a++)
        {
            T[a]=p.nextInt();
        }
        for(int b=0; b<ilosc; b++) {
            for (int a = 0; a < ilosc-1; a++) {
                if (T[a] > T[a + 1]) {
                    z = T[a];
                    T[a] = T[a + 1];
                    T[a + 1] = z;
                }
            }
        }
        for(int d=0; d<ilosc; d++)
        {
            System.out.println(T[d]);
        }
    }
}
