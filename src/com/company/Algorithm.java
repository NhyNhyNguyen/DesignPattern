package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Algorithm {
    /**
     * cal num staircase to go to the end
     *
     * @param n is num stair case
     * @return total way to go to the end
     */
    public static int staircase(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
    }

    /**
     * print all way to go to the end
     *
     * @param n
     * @return
     */
    public static List<String> staircase2(int n) {
        if (n == 1) return Arrays.asList("1");
        if (n == 2) return Arrays.asList("11", "2");
        if (n == 3) return Arrays.asList("111", "21", "12", "3");
        List<String> list = staircase2(n - 1).stream().map(t -> 1 + t).collect(Collectors.toList());
        List<String> list2 = staircase2(n - 2).stream().map(t -> 2 + t).collect(Collectors.toList());
        List<String> list3 = staircase2(n - 3).stream().map(t -> 3 + t).collect(Collectors.toList());
        list.addAll(list2);
        list.addAll(list3);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(staircase2(5));
        System.out.println(staircase(5));
    }
}
