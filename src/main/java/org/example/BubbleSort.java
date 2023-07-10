package org.example;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void sorted(List<Integer> arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            for (int j = 0; j < arr.size(); j++)
            {
                if (arr.get(i) < arr.get(j))
                {
                    int tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
    }

    public static void main(String[] args) {

        int size_arr = 10;
        List<Integer> arr = new ArrayList<>(size_arr);


        for (int i = 0; i < size_arr; i++)
        {
            arr.add((int)(Math.random()*100));
        }
        for(Integer j: arr)
        {
            System.out.print(j + " ");
        }
        sorted(arr);
        System.out.println();
        for(Integer j: arr)
        {
            System.out.print(j + " ");
        }
    }
}
