package org.Zoo.app;

import java.util.ArrayList;

public class Animal {

    protected String AnimalName;
    protected Integer age;
    protected animalGender sex;

    public String getAnimalName() {
        return this.AnimalName;
    }

    public Animal(String animalName, Integer age, animalGender sex) {
        this.AnimalName = animalName;
        this.age = age;
        this.sex = sex;
    }

    public void setAnimalName(String animalName) {
        this.AnimalName = animalName;
    }

    public void PrintDetails(){
        System.out.println(String.format("Unknown type of animal: "));
        System.out.print(String.format("Name:%s; ",this.AnimalName));
        System.out.print(String.format("Age:%d; ",this.age));
        System.out.print(String.format("Gender:%s; ",this.sex));
    }
}
