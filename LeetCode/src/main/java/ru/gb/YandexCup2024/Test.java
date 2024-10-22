package ru.gb.YandexCup2024;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        long n = in.nextLong();
        final int MAX_VALUE = 1000_000;
        final long MAX_VALUE_FOR_N = 1000_000_000_000_000_000L;


        if(a>MAX_VALUE || b>MAX_VALUE || c>MAX_VALUE || n>MAX_VALUE_FOR_N){
            System.out.println(-1);
        }
        int counter = 1;
        while (true){
            counter++;
            if(counter%a==0 & counter%b==0 & counter%c==0){
                continue;
            }
            if((counter%a==0 & counter%b==0)
                    || (counter%a==0 & counter%c==0)
                    || (counter%b==0 & counter%c==0)
            ){
                n--;
            }
            if(n==0) {
                System.out.println(counter);
                break;
            }
        }


    }

}
