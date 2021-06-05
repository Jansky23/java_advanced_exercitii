package com.sda.ex7;

public class Main {

    public static void main(String[] args) {

        WeaponMagazine weaponMagazine = new WeaponMagazine(4);
        weaponMagazine.loadBullet("bullet 1");
        weaponMagazine.loadBullet("bullet 2");
        weaponMagazine.loadBullet("bullet 3");
        weaponMagazine.loadBullet("bullet 4");
        weaponMagazine.loadBullet("bullet 5");

        for (int i = 0; i <8; i++) {
            weaponMagazine.shot();
        }

    }
}
