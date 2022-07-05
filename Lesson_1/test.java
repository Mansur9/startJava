public class test {
    public static void main(String[] args) {
        int numberAny = -222;

        if (numberAny == 0) { 
            System.out.println("равен нулю");
        } else if (numberAny > 0 && (numberAny % 2) == 0 ) {
            System.out.println("положительное четно число");
        } else if (numberAny < 0 && (numberAny % 2) == 0) {
            System.out.println("отрицателньое четное число");
        } else if (numberAny > 0 && (numberAny % 2) != 0 ) {
            System.out.println("положительное нечетно число");
        } else if (numberAny < 0 && (numberAny % 2) != 0) {
            System.out.println("отрицателньое нечетное число");
        } 
    }
}
