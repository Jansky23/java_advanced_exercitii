package com.sda.SDASCheduleAPP;

import java.time.LocalDate;

public class AppManager {

    public void start(){

        for (int i = 0; i <= 15; i++) {
            Student student = new Student("std", String.valueOf(i+1),
                    LocalDate.now(),i%2==0 ? true : false);
            System.out.println(student.toString());

        }

    }

    public void initGroup(){
        for (int i = 0; i < 4; i++) {
            Group group = new Group();
            //nu folosim string.valueof  pt ca  i+1  va fi concatenat cu un string  iar rezultat va fi  un string
            group.setName("Java Remote" + (i +1));
        }
    }

    public void initTrainer(){
        Trainer trainer1 = new Trainer("George","Georgel",LocalDate.of(1987,5,22 ) , true);
        Trainer trainer2 = new Trainer("Valentin","Fandos",LocalDate.of(1960,3,21 ), false);
        Trainer trainer3 = new Trainer("ANa","Ghita",LocalDate.of(1970, 2,21 ),true);
    }

}
