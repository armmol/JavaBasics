public class CopyArray {
    public static int[] copyArray(int[] originalArray) {
        int[] copyArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copyArray[i] = originalArray[i];
        }
        return copyArray;
    }
}
