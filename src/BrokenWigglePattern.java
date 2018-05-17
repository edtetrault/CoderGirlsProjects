public class BrokenWigglePattern extends Pattern {
    String pattern3="xXxXxXxXxX ";

    public String stitchPattern()
    {
        return pattern3;
    }

    boolean needleJam = (Math.random() < 0.40d);
}
