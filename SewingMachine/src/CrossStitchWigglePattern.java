public class CrossStitchWigglePattern extends Pattern{
    String pattern5 = "xXxXxXxXxX ";


    public String stitchPattern() {
        boolean needleJam = (Math.random() < 0.05d);
        if (needleJam) {
            return "xXxXx ";
        }
       return pattern5;
    }

}
