package com.nd035.lesson1;

import java.util.ArrayList;
import java.util.List;

public class ListGroupString {

    public static void main(String[] args) {
        ArrayList<String> input1 = new ArrayList<String>();
        ArrayList<String> input2 = new ArrayList<String>();
        input1.add("bcd");
        input1.add("abc");
        input1.add("cde");
        input2.add("abc");
        input2.add("bcd");
        input2.add("bbb");
        input2.add("ace");
        input2.add("snb");
        input2.add("aaaa");
        input2.add("bbbbb");
        input2.add("eeee");
        printList(groupString(input1));
        printList(groupString(input2));
    }

    private static List<String>[] groupString(List<String> input) {
        List[] output = new List[3];
        output[0] = new ArrayList<String>();
        output[1] = new ArrayList<String>();
        output[2] = new ArrayList<String>();
        for (String s : input) {
            String cmp = String.valueOf(s.charAt(0)).toLowerCase();
            if (cmp.equals("a")) {
                output[0].add(s);
            } else if (cmp.equals("b")) {
                output[1].add(s);
            } else {
                output[2].add(s);
            }
        }
        return output;
    }

    private static void printList(List<String>[] list) {
        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            System.out.print("{");
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print("\"" + list[i].get(j) + "\"");
                if (j < list[i].size()-1) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (i < list.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}