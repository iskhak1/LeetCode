package ru.gb.YandexCup2024;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class Test2 {

    public static void main(String[] args) {
        Runnable runnable;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        AtomicLong n = new AtomicLong(in.nextLong());
        final int MAX_VALUE = 1000_000;
        final long MAX_VALUE_FOR_N = 1000_000_000_000_000_000L;


        if(a>MAX_VALUE || b>MAX_VALUE || c>MAX_VALUE || n.get() >MAX_VALUE_FOR_N){
            System.out.println(-1);
        }
        int counter = 1;

        for (int i = 0; i < MAX_VALUE_FOR_N; i++) {

            counter++;

            if(counter%a==0 & counter%b==0 & counter%c==0){
                continue;
            }
            if((counter%a==0 & counter%b==0)
                    || (counter%a==0 & counter%c==0)
                    || (counter%b==0 & counter%c==0)
            ){
                 runnable = () -> {
                    n.getAndDecrement();
                };
                 Thread thread = new Thread(runnable);
                thread.run();

            }
            if(n.get() ==0) {
                System.out.println(counter);
                break;
            }
        }


    }

}
