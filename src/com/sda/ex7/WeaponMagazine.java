package com.sda.ex7;

import java.util.ArrayList;
import java.util.List;

public class WeaponMagazine {

    private int size;
    private List<String> magazines;

    public WeaponMagazine(int size) {
        this.size = size;
        this.magazines = new ArrayList<>();
    }

    public void loadBullet (String bullet){
        if(magazines.size() < size){
            this.magazines.add(bullet);
        }else{
            System.out.println("The magazine is Full");
        }
    }

    public boolean isLoaded(){
        return this.magazines.size() > 0;
        }


        public void shot(){


            if(this.isLoaded()){
                System.out.println("take care , the next bullet is loaded");
                System.out.println(magazines.get(this.magazines.size() - 1));
                magazines.remove(this.magazines.size() - 1 );
            }else{
                System.out.println("empty magazine");
            }
    }
}

