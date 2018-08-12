package com.singtel.test.animal;

import com.singtel.test.enums.Size;

import static com.singtel.test.constant.Constants.DEFAULT_MAKE_JOKES;

public class ClownFish extends Fish {
    static final Size DEFAULT_SIZE = Size.SMALL;
    static final String DEFAULT_COLOR = "Colorful";

    public ClownFish() {
        this.size = DEFAULT_SIZE;
        this.color = DEFAULT_COLOR;
    }

    public void makeJokes() {
        System.out.println(DEFAULT_MAKE_JOKES);
    }
}
