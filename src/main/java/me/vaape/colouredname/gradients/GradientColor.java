package me.vaape.colouredname.gradients;

public class GradientColor {
    private String startColor;
    private String endColor;
    private int startRange;
    private int stopRange;

    public void setGradient(String startColor, String endColor) {
        this.startColor = getHexColor(startColor);
        this.endColor = getHexColor(endColor);
    }

    public void setMidpoint(int startRange, int stopRange) {
        this.startRange = startRange;
        this.stopRange = stopRange;
    }

    public String getHexColor(String hexColor) {
        return hexColor.substring(hexColor.length() - 6);
    }

    public String generateHex(int number, String start, String end) {
        if (number < startRange) {
            number = startRange;
        } else if (number > stopRange) {
            number = stopRange;
        }

        int midPoint = this.stopRange - this.startRange;
        int startBase = Integer.parseInt(start, 16);
        int endBase = Integer.parseInt(end, 16);
        int average = (endBase - startBase) / midPoint;
        int finalBase = Math.round(average * (number - startRange) + startBase);
        return finalBase < 16 ? "0" + Integer.toString(finalBase, 16) : Integer.toString(finalBase, 16);
    }

    public String getColor(int color) {
        return '#' + generateHex(color, startColor.substring(0, 2), endColor.substring(0, 2)) +
                generateHex(color, startColor.substring(2, 4), endColor.substring(2, 4)) +
                generateHex(color, startColor.substring(4, 6), endColor.substring(4, 6));
    }
}
