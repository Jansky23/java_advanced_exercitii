package com.sda.ex5;

/**
 * Implement the SDAHashSet<E> class that will implement the HashSet<E> logic. It should support methods:
 * • add
 * • remove
 * • size
 * • contains
 * • clear
 */

public class Main {
    public static void main(String[] args) {

        SDAHashSet<String> sdaHashSet = new SDAHashSet<>();
        sdaHashSet.add("Porcus");
        sdaHashSet.add("Preparatus");
        sdaHashSet.add("Porcus");


        System.out.println(sdaHashSet.size());
        sdaHashSet.remove("Porcus");
        System.out.println(sdaHashSet.size());

        if(sdaHashSet.contains("Porcus")){
            System.out.println("SDAHashSet contains true");
        }

        sdaHashSet.clear();
        System.out.println(sdaHashSet.size());

    }
}
