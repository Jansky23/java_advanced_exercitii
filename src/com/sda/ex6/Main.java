package com.sda.ex6;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    /// create a method taht accet a tree map ,   and prints the foirst and last entryset in the console

    public static void main(String[] args) {

        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("Moto","Honda");
        treeMap.put("Auto","Audi");
        treeMap.put("Race" ,"BMW");

        printTreeMap(treeMap);

    }

    public static void printTreeMap (TreeMap<String,String>treeMap){
        Map.Entry<String,String>firstEntry =treeMap.firstEntry();
        System.out.println(firstEntry.getKey() + " --- " + firstEntry.getValue());

        Map.Entry<String,String>lastEntry = treeMap.lastEntry();
        System.out.println(lastEntry.getKey() + "---" + lastEntry.getValue());
    }
}




