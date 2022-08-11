public class CyclesTheme {
    public static void main(String[] aerg) {
        int srcNum = 21;
        int srcNumMin = -10;
        do {
        srcNumMin = srcNumMin + 1;
        if(srcNumMin % 2 == 0) { 
            System.out.printf("Число %d четное\n", srcNumMin);
        } else {
            System.out.printf("Число %d нечетное\n", srcNumMin);
            }

        } while (srcNum >= srcNumMin);
    }
}
