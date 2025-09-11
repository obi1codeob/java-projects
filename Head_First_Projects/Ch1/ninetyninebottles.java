package Head_First_Projects.Ch1;

public class ninetyninebottles {
    public static void main(String[] args) {

        int bottlesNum = 99;
        String container = "bottles";

        while (bottlesNum > 0) {
            if (bottlesNum == 1) {
                container = "bottle";
            }
            System.out.println(bottlesNum + " " + container + " of beer on the wall,");
            System.out.println(bottlesNum + " " + container + " of beer,");
            System.out.println("Take one down,");
            System.out.println("Pass it around,");

            bottlesNum = bottlesNum - 1;
            if (bottlesNum > 0) {
                System.out.println(bottlesNum + " " + container + " of beer on the wall.");
                System.out.println();
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}