package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Integer> hoanVi = new ArrayList<>();
    static List<Integer> num = new ArrayList<>();

    public static void main(String[] args) {
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        List<Integer> list = new ArrayList<>();
        list.addAll(num);
        getHoanVi(0,1);
    }



    private static void getHoanVi(int x, int y) {
        List<Integer> list = new ArrayList<>(num);
        int tmp = list.get(y);
        list.remove(y);
        list.add(y, list.get(x));
        list.remove(x);
        list.add(x, tmp);
        hoanVi.add(convert(list));
        if(x == num.size() - 2 && y == num.size() - 1){
            return;
        }
        if(y == num.size() - 1){
            y = 1;
            x = x +1;
            getHoanVi(x, y);
            return;
        }
        y += 1;
        getHoanVi(x, y);
    }

    private static Integer convert(List<Integer> list){
        String a = "";
        for (int i = 0; i < list.size(); i++) {
            a += list.get(i);
        }
        System.out.println(a);
        return Integer.parseInt(a);
    }
}
