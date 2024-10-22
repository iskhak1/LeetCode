package ru.gb.YandexCup2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoOfThree {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = in.read();
        int b = in.read();
        int c = in.read();
        int n = in.read();
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
