package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int ebob=0,ekok=0;
        System.out.print("1.Sayıyı Giriniz:");
        int n1=inp.nextInt();

        System.out.print("2.Sayıyı Giriniz:");
        int n2=inp.nextInt();

        if(n1>n2){
            int i=n2;
            while (i>=1){
                i--;
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                    break;
                }
            }
            System.out.println("Sayıların Ebobu:"+ebob);
        }
        else if(n2>n1) {
            int j=n1;
            while (j>=1){
                j--;
                if(n1%j==0 && n2%j==0){
                    ebob=j;
                    break;
                }
            }
            System.out.println("Sayıların Ebobu:"+ebob);
        }
          int k=1;
          while (k<=(n1*n2)){
              k++;
              if(k%n1==0 && k%n2==0){
                  ekok=k;
                  break;
              }
          }
        System.out.println("Sayıların Ekoku:"+ekok);
    }
}
