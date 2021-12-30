package me.vaape.colouredname.gradients;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gradient {
    private List<GradientColor> gradientColors = new ArrayList<>();
    private List<GradientInterval> gradientIntervals = new ArrayList<>();
    private int gradientSize;

    public Gradient() {}

    public void setColors(List<String> colors) {
        int increment = this.gradientSize / (colors.size() - 1);
        GradientColor firstGradientColor = new GradientColor();
        firstGradientColor.setGradient(colors.get(0), colors.get(1));
        firstGradientColor.setMidpoint(0, increment);
        gradientColors.add(firstGradientColor);
        gradientIntervals.add(new GradientInterval(0, increment));

        for (int i = 1; i < colors.size() - 1; i++) {
            GradientColor gradientColor = new GradientColor();
            int lower = increment * i;
            int upper = increment * (i + 1);
            gradientColor.setGradient(colors.get(i), colors.get(i + 1));
            gradientColor.setMidpoint(lower, upper);
            gradientColors.add(gradientColor);
            gradientIntervals.add(new GradientInterval(lower, upper));
        }
    }

    public void setGradientSize(int gradientSize) {
        this.gradientSize = gradientSize;
    }

    public List<String> getArray() {
        List<String> gradientArray = new ArrayList<>();
        for (int j = 0; j < gradientIntervals.size(); j++) {
            GradientInterval gradientInterval = gradientIntervals.get(j);
            int start = gradientInterval.getLower() == 0 ? 1 : (int) Math.ceil(gradientInterval.getLower());
            int end = gradientInterval.getUpper() == this.gradientSize ? gradientInterval.getUpper() + 1 :
                    (int) Math.ceil(gradientInterval.getUpper());

            for (int i = start; i < end; i++) {
                gradientArray.add(gradientColors.get(j).getColor(i));
            }
        }

        return gradientArray;
    }
}
