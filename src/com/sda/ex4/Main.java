package com.sda.ex4;

/**
 * Create a Storage class that will have a private Map field,
 * a public constructor, and methods:
 * addToStorage(String key, String value) → adding elements to the storage
 * printValues(String key) → displaying all elements under a given key
 * findValues(String value) → displaying all keys that have a given value
 *
 * The Storage class should allow you to store multiple values under one key.
 */

public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addToStorage("auto","audi");
        storage.addToStorage("Moto","Honda");
        storage.addToStorage("Phone","Samsung");
        storage.addToStorage("Race","Audi");
        storage.addToStorage("Moto","Honda");

        storage.printStorage();

        System.out.println("the value is : ");
        storage.printValue("auto");

        System.out.println("The keys: ");
        storage.findValue("audi");
    }
}
