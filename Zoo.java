package org.Zoo.app;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(){
        this.animals = new ArrayList<>();
    }

    public void addAnimalToZoo(String name, animalGender sex, Integer age, animalType typeOfAnimal) {
        switch(typeOfAnimal){
            case bird:
                this.animals.add(new Bird(name, age, sex));
                break;
        /*    case reptile:
                this.animals.add(new Reptile(name, sex, age));
                break;
            case fish:
                this.animals.add(new Fish(name, sex, age));
                break;
        */    default:
                this.animals.add(new Animal(name, age, sex));
                break;
        }
    }

    public void PrintAllAnimalsInZoo(){
        for(Animal a: this.animals){
            a.PrintDetails();
            System.out.println();
        }
    }

    public static void main(String[] args){
        Zoo zoo = new Zoo();
        zoo.addAnimalToZoo("birdy",animalGender.male,2,animalType.bird);
        zoo.addAnimalToZoo("birdy1",animalGender.male,3,animalType.bird);
        zoo.addAnimalToZoo("birdy2",animalGender.female,4,animalType.bird);
        zoo.addAnimalToZoo("birdy3",animalGender.male,5,animalType.bird);
        zoo.PrintAllAnimalsInZoo();
    }
}
