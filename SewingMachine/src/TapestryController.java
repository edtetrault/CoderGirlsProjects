import static java.lang.System.out;
import java.util.Random;
public class TapestryController {
    String stitchPattern;



    public static void main(String[] args) {
        Pattern stitchPattern[] = new Pattern[5];
        stitchPattern[0] = new CrossStitchWigglePattern();
        stitchPattern[1] = new ZigZagLinesPattern();
        stitchPattern[2] = new BaublePattern();
        stitchPattern[3] = new BlockyBaublePattern();
        stitchPattern[4] = new BrokenWigglePattern();
        boolean keepGoing = true;
        int count = 0;
        boolean keepGoing2 = true;
        int count2 = 0;
        while (keepGoing) {
            count++;
            keepGoing = (count < 3);
            for (int row = 0; row < stitchPattern.length; row++) {

                for (int column = 0; column < 8; column++)
                    System.out.print(stitchPattern[row].stitchPattern());

                System.out.println();


            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        while (keepGoing2) {
            count2++;
            keepGoing2 = (count2 < 8);
            for (int row = 0; row < stitchPattern.length; row++) {

                for (int column = 0; column < 6; column++)
                    System.out.print(stitchPattern[row].stitchPattern());

                System.out.println();
            }
        }
    }
}
