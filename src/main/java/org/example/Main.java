package org.example;

import java.util.*;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static int find_max_standart(List<Integer> arr)
    {
        int maxim = Integer.MIN_VALUE;
        for (Integer i: arr)
        {
            if (maxim < i) { maxim = i; }
        }
        return maxim;
    }
    static int find_min_standart(List<Integer> arr)
    {
        int minim = Integer.MAX_VALUE;
        for (Integer i: arr)
        {
            if (minim > i) { minim = i; }
        }
        return minim;
    }

    static Integer find_max_collect(List<Integer> arr)
    {
        return Collections.max(arr);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("input size of array");
        int size_arr = in.nextInt();
        List<Integer> arr = new ArrayList<>(size_arr);


        for (int i = 0; i < size_arr; i++)
        {
            arr.add((int)(Math.random()*100));
        }

        for(Integer j: arr)
        {
            System.out.println(j);
        }

        System.out.println("max is = " + find_max_collect(arr));
        System.out.println("max is = " + find_max_standart(arr));

        System.out.println("min is = " + find_min_standart(arr));
        System.out.println("avg is = " + find_avg(arr));

    }

    public static double find_avg(List<Integer> arr) {
        int summ = 0;
        for (Integer j: arr)
        {
            summ += j;
        }

        return (double)(summ / arr.size());
    }
}