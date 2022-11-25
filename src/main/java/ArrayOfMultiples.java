public class ArrayOfMultiples {
    public static void createMultiples(){
        int[][] multiples = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiples[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", multiples[i][j]);
            }
            System.out.println();
        }
    }
}
