public class BrokenWigglePattern extends Pattern {
    String pattern3="xXxXxXxXxX ";

    public String stitchPattern()
    {
        boolean needleJam = (Math.random() < 0.40d);
        if (needleJam) {
            return "xXxXx ";
        }return pattern3;
    }
}
