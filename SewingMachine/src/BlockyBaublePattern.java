public class BlockyBaublePattern extends Pattern{

    String pattern4="[]--o--[]--o--[]--o-- ";

    public String stitchPattern() {
        boolean needleJam = (Math.random() < 0.10d);
        if (needleJam) {
        return "[]--o--[]- ";
    }


        return pattern4;
    }
}
