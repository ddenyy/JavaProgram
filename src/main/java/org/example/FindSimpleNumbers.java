package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindSimpleNumbers {


    public static void main(String[] args) {
        int top_limit = 100;

        List<Integer> mark = new ArrayList<>();

        for (int i = 0; i < top_limit; ++i)
        {
            mark.add(1);
        }
        List<Integer> ans_arr_simple_number = new ArrayList<Integer>();

        for (int i = 2; i < top_limit; i++)
        {
            if (mark.get(i) == 1)
            {
                for (int j = i*i; j < top_limit; j+=i)
                {
                    mark.set(j, 0);
                }
            }
        }

        for (int j = 2; j < top_limit; j++)
        {
            if (mark.get(j) == 1) ans_arr_simple_number.add(j);
        }

        System.out.println(ans_arr_simple_number);
    }
}
