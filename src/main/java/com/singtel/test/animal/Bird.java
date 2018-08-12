package com.singtel.test.animal;

import com.singtel.test.interfaces.FlyingAnimal;
import com.singtel.test.interfaces.SingingAnimal;
import com.singtel.test.interfaces.WalkingAnimal;

public class Bird extends Animal implements FlyingAnimal, SingingAnimal, WalkingAnimal {
}