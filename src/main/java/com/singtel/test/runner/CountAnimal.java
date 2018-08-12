package com.singtel.test.runner;

import com.singtel.test.animal.*;
import com.singtel.test.enums.ButterflyStage;
import com.singtel.test.enums.Gender;
import com.singtel.test.interfaces.FlyingAnimal;
import com.singtel.test.interfaces.SingingAnimal;
import com.singtel.test.interfaces.SwimmingAnimal;
import com.singtel.test.interfaces.WalkingAnimal;

import java.util.Arrays;
import java.util.List;

public class CountAnimal {
    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(new Bird(), new Duck(), new Chicken(),
                new Chicken(Gender.MALE), new Parrot("Woof, woof"), new Fish(), new Shark(),
                new ClownFish(), new Butterfly(), new Butterfly(ButterflyStage.BUTTERFLY));

        long flyingAnimal = animalList.stream().filter(s -> s instanceof FlyingAnimal).filter(s -> ((FlyingAnimal) s).fly()).count();
        long walkingAnimal = animalList.stream().filter(s -> s instanceof WalkingAnimal).filter(s -> ((WalkingAnimal) s).walk()).count();
        long singingAnimal = animalList.stream().filter(s -> s instanceof SingingAnimal).count();
        long swimmingAnimal = animalList.stream().filter(s -> s instanceof SwimmingAnimal).count();

        System.out.println("Number of flying animal = " + flyingAnimal);
        System.out.println("Number of walking animal = " + walkingAnimal);
        System.out.println("Number of singing animal = " + singingAnimal);
        System.out.println("Number of swimming animal = " + swimmingAnimal);


    }
}
