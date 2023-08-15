package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi, toplam=0, adet=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayıyı giriniz:");
        sayi = input.nextInt();

        for (int i=1; i<=sayi;  i++){
            if (i%3==0 && i%4==0){
                toplam+=i;
                adet+=1;
            }
        }
        System.out.println("3 ve 4 e tam bölünen sayıların ortalaması: " + toplam/adet);


    }
}
