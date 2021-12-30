package me.vaape.colouredname.gradients;

public class GradientInterval {
    private int lower;
    private int upper;

    public GradientInterval(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public int getLower() {
        return lower;
    }

    public int getUpper() {
        return upper;
    }
}
