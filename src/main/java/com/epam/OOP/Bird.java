package com.epam.OOP;

public class Bird extends Animal {
    public Bird(
            String color,
            int numberOfPaws,
            boolean hasFur
    ) {
        super(color, numberOfPaws, hasFur);
    }

    public Bird() {
        this("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return String.format(
                "This animal is mostly %s. It has %d paw%s and %s fur. Moreover, it has 2 wings and can fly.",
                this.getColor(),
                this.getNumberOfPaws(),
                this.getNumberOfPaws() > 1 ? "s" : "",
                this.isHasFur() ? "a" : "no"
        );
    }
}
