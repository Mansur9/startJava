public class test {
 // Определение буквы, числа или символа по их коду
        // создайте переменную типа char
        // присвойте ей значение ‘\u0057’
        // определите — это код буквы, числа или другого символа
        // использовать для этого методы классов Java запрещено!
        // выведите в консоль сам символ и информацию о нем:
        // маленькая (большая) буква
        // это число
        // не буква и не число





    public static void main(String[] args) {
        String symbol = "\u0057";
        char ch1 = symbol.charAt(0);
     
        // char ch3 = symbol.charAt(2);
        // char ch4 = symbol.charAt(3);
        // char ch5 = symbol.charAt(4);
        // char ch6 = symbol.charAt(5);
        
        if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch1 >= '0' && ch1 <= '9') {
            System.out.println(ch1 + " число");
        // } else {
        //     System.out.println(ch1 + " не буква и не число");
        // }
        char ch2 = symbol.charAt(1);
        if ((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch2 >= '0' && ch2 <= '9') {
            System.out.println(ch2 + " число");
        } else {
            System.out.println(" не буква и не число");
        // }
        
        // if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
        //     System.out.println(" маленькая (большая) буква");
        // } else if (ch1 >= '0' && ch1 <= '9') {
        //     System.out.println(ch1 + " число");
        // } else {
        //     System.out.println(ch1 + " не буква и не число");
        // }

        // if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
        //     System.out.println(" маленькая (большая) буква");
        // } else if (ch1 >= '0' && ch1 <= '9') {
        //     System.out.println(ch1 + " число");
        // } else {
        //     System.out.println(ch1 + " не буква и не число");
        // }

        // if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
        //     System.out.println(" маленькая (большая) буква");
        // } else if (ch1 >= '0' && ch1 <= '9') {
        //     System.out.println(ch1 + " число");
        // } else {
        //     System.out.println(ch1 + " не буква и не число");
        // }

        // if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
        //     System.out.println(" маленькая (большая) буква");
        // } else if (ch1 >= '0' && ch1 <= '9') {
        //     System.out.println(ch1 + " число");
        // } else {
        //     System.out.println(ch1 + " не буква и не число");
        // }
    }   
}
