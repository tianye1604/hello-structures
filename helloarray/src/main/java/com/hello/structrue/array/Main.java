package com.hello.structrue.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[100];
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            arr[i] = r.nextInt() * 100;
        }

        for (int i : arr) {
            System.out.println(i);
        }

        List<Integer> list  = new ArrayList<Integer>();
        list.add(1);
    }
}
