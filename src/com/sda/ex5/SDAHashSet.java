package com.sda.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SDAHashSet <E> implements HashSet <E> {

    private List<E> itemsList;

    public SDAHashSet(){
       super();
       this.itemsList = new ArrayList<>();
   }

    @Override
    public void add(E item){
        if(!this.itemsList.contains(item)){
            this.itemsList.add(item);
        }else{
            //metoda indexof ne returneaza pozitia curenta din lista a elementului
          int index = this.itemsList.indexOf(item);
          //metoda set  seteaza elemntul peo anumita pozitie
          this.itemsList.set(index,item);
        }
    }

    @Override
    public void remove(E item){
        this.itemsList.remove(item);

    }

    @Override
    public int size() {
      return this.itemsList.size();
    }

    @Override
    public boolean contains(E item){
        return this.itemsList.contains(item);
    }

    @Override
    public void clear(){
        this.itemsList.clear();
    }
}
