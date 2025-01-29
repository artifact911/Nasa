package practice.atmosphere;

public class AtmRunner {

    public static void main(String[] args) {

       final int startX = 10;
        int totalX = startX;

        SliceAtm[] sliceAtm = new SliceAtm[]{
                new SliceAtm("1", 12),
                new SliceAtm("2", -10),
                new SliceAtm("3", 0),
                new SliceAtm("4", 20)};

        for (int i = 0; i < sliceAtm.length; i++) {
            totalX = totalX + sliceAtm[i].getSpeed();
        }


        System.out.println(totalX);

    }
}
