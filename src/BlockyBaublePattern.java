public class BlockyBaublePattern extends Pattern{

    String pattern4="[]--o--[]--o--[]--o-- ";

    public String stitchPattern()
    {
        return pattern4;
    }
    boolean needleJam = (Math.random() < 0.10d);
}
