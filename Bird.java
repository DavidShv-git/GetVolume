package org.Zoo.app;

import java.util.ArrayList;

public class Bird extends Animal {

    public Bird(String animalName, Integer age, animalGender sex) {
        super(animalName,age,sex);
    }

    @Override
    public void PrintDetails(){
        System.out.println(String.format("Bird: "));
        System.out.print(String.format("Name:%s; ",this.AnimalName));
        System.out.print(String.format("Age:%d; ",this.age));
        System.out.print(String.format("Gender:%s; ",this.sex));
    }
}

