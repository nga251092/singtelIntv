package com.singtel.test.animal;

import com.singtel.test.enums.ButterflyStage;
import com.singtel.test.interfaces.FlyingAnimal;
import com.singtel.test.interfaces.WalkingAnimal;

import static com.singtel.test.constant.Constants.DEFAULT_FLYING;
import static com.singtel.test.constant.Constants.DEFAULT_WALKING;

public class Butterfly extends Animal implements FlyingAnimal, WalkingAnimal {
    private ButterflyStage butterflyStage;

    public Butterfly(ButterflyStage butterflyStage) {
        this.butterflyStage = butterflyStage;
    }

    public Butterfly() {
        this.butterflyStage = ButterflyStage.CATERPILLAR;
    }

    public void makeSound() {
    }

    public void metamorphosis() {
        butterflyStage = ButterflyStage.BUTTERFLY;
    }

    public boolean fly() {
        if (ButterflyStage.BUTTERFLY.equals(butterflyStage)) {
            System.out.println(DEFAULT_FLYING);
            return true;
        }
        return false;
    }

    public boolean walk() {
        if (ButterflyStage.CATERPILLAR.equals(butterflyStage)) {
            System.out.println(DEFAULT_WALKING);
            return true;
        }
        return false;
    }
}
