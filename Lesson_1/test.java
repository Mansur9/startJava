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
        String symbol = "@U0057";
        char ch1 = symbol.charAt(0);
        char ch2 = symbol.charAt(1);
        char ch3 = symbol.charAt(2);
        char ch4 = symbol.charAt(3);
        char ch5 = symbol.charAt(4);
        char ch6 = symbol.charAt(5);
        
        
        System.out.print(ch1);
        if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch1 >= '0' && ch1 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }

        System.out.print(ch2);
        if ((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch2 >= '0' && ch2 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }

        System.out.print(ch3);
        if ((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch3 >= '0' && ch3 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }
        
        System.out.print(ch4);
        if ((ch4 >= 'a' && ch4 <= 'z') || (ch4 >= 'A' && ch4 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch4 >= '0' && ch4 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }

        System.out.print(ch5);
        if ((ch5 >= 'a' && ch5 <= 'z') || (ch5 >= 'A' && ch5 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch5 >= '0' && ch5 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }

        System.out.print(ch6);
        if ((ch6 >= 'a' && ch6 <= 'z') || (ch6 >= 'A' && ch6 <= 'Z')) {
            System.out.println(" маленькая (большая) буква");
        } else if (ch6 >= '0' && ch6 <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }
    }   
}
