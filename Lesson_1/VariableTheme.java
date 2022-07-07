
public class VariableTheme {
    public static void main(String[] args) {
        // Создание переменных и вывод их значений на консоль 
        System.out.println("*Создание переменных и вывод их значений на консоль*");
        byte graphicSizeGB = 10;
        short hdSizeGB = 120;
        long ramSizeGb = 4l;
        float wifiFrequency = 2.4f;
        double videoCardAmdSeria = 5500d;
        char videoCardAmdSign = 's';
        int videoCardAmdModel = 10;
        boolean goodNotebook = true;
        System.out.println("Byte = " + graphicSizeGB + "\n" + "Short = "+ 
        hdSizeGB + "\n" + "Long = " + ramSizeGb + "\n" + "Float = " + wifiFrequency + "\n" + 
        "Double = " + videoCardAmdSeria + "\n" + "char = " + videoCardAmdSign + 
        "\n" + "int = " + videoCardAmdModel );
        System.out.println(goodNotebook);
        System.out.println();
        
        // Расчет стоимости товара со скидкой
        System.out.println("*Расчет стоимости товара со скидкой*");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        double discount = 0.11f;
        double discountAmount = (priceGoodsX + priceGoodsY) * discount; //размер скидки
        double discountPrice = priceGoodsX + priceGoodsY - discount;
        System.out.println("сумма скидки = " + discountAmount);
        System.out.println("итогова сумма товаров со скидкой = " + discountPrice);
        System.out.println();

        // Вывод на консоль слова JAVA
        System.out.println("*Вывод на консоль слова JAVA*");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        //Отображение min и max значений числовых типов данных 
        System.out.println("*Отображение min и max значений числовых типов данных*");
        long MaxLong = Long.MAX_VALUE;
        System.out.println("Long.MAX_VALUE = " + MaxLong);
        ++MaxLong;
        System.out.println("Long.MIN_VALUE = " + MaxLong);
        --MaxLong;
        System.out.println("Long.MAX_VALUE = " + MaxLong);
        byte MaxByte = Byte.MAX_VALUE;
        System.out.println("Byte.MAX_VALUE = " + MaxByte);
        ++MaxByte;
        System.out.println("Byte.MIN_VALUE = " + MaxByte);
        --MaxByte;
        System.out.println("Byte.MAX_VALUE = " + MaxByte);
        int MaxInteger = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE = " + MaxInteger);
        ++MaxInteger;
        System.out.println("Integer.MIN_VALUE = " + MaxInteger);
        --MaxInteger;
        System.out.println("Integer.MAX_VALUE = " + MaxInteger);
        short MaxShort = Short.MAX_VALUE;
        System.out.println("Short.MAX_VALUE = " + MaxShort);
        ++MaxShort;
        System.out.println("Short.MIN_VALUE = " + MaxShort);
        --MaxShort;
        System.out.println("Short.MAX_VALUE = " + MaxShort);
        System.out.println();

        // Перестановка значений переменных
        System.out.println("*Перестановка значений переменных*");
        float number1 = 4f;
        float number2 = 5f;
        System.out.println("Меняем с помощью третьей переменной");
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        float buffer = number2;
        number2 = number1;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number2 = buffer;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        System.out.println("с помощью арифметических операций");
        number1 = number1 + number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number2 = number1 - number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number1 = number1 - number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        System.out.println("C помощью побитовой операции");
        number1 = (int)number1;
        number2 = (int)number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number1 = (int)number1 ^ (int)number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number2 = (int)number1 ^ (int)number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number1 = (int)number1 ^ (int)number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        System.out.println();

        // Вывод ASCII-символов и их кодов
        System.out.println("*Вывод ASCII-символов и их кодов*");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.println((int) codeChar1 + " " + codeChar1);
        System.out.println((int) codeChar2 + " " + codeChar2);
        System.out.println((int) codeChar3 + " " + codeChar3);        
        System.out.println((int) codeChar4 + " " + codeChar4);
        System.out.println((int) codeChar5 + " " + codeChar5);
        System.out.println();

        //Произведение и сумма цифр числа
        System.out.println("*Произведение и сумма цифр числа*");
        int srcNum = 345;
        int digit1 = srcNum / 100;
        System.out.println(digit1);
        int digit2 = (srcNum / 10) % 10; // 
        System.out.println(digit2);
        int digit3 = (srcNum / 1) % 10;
        System.out.println(digit3);
        int prodDigits = digit1 * digit2 * digit3;
        System.out.println("произведение цифр числа " + srcNum + " = " + prodDigits);
        int sumDigits = digit1 + digit2 + digit3;
        System.out.println("сумма цифр числа " + srcNum + " = " + sumDigits);
        System.out.println();

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("*Вывод на консоль ASCII-арт Дюка*");
        char slash = 47;
        char backslash = 92;
        char underlining = 95;
        char openBracket = 40;
        char closeBracket = 41;
        String space = " ";
        System.out.println(space.repeat(4) + slash + backslash + space.repeat(4));
        System.out.println(space.repeat(3) + slash + space.repeat(2) + backslash + space.repeat(3));
        System.out.println(space.repeat(2) + slash + underlining + openBracket + space + closeBracket + backslash + space.repeat(2));
        System.out.println(space.repeat(1) + slash + space.repeat(6) + backslash + space.repeat(1));
        System.out.println(space.repeat(0) + slash + underlining + underlining + underlining + underlining + slash + backslash + underlining + 
                underlining + backslash + space.repeat(0));
        System.out.println();

        // Отображение количества сотен, десятков и единиц числа
        System.out.println("*Отображение количества сотен, десятков и единиц числа*");
        int srcNumber = 123;
        int hundreds = (srcNumber / 100) % 10; //сотни - получаем одну ед сотен
        int dozens = (srcNumber / 10) % 10; //десятки - используется две десятки
        int ones = srcNumber % 10; //единицы - всего три единицы
        System.out.println("Число " + srcNumber + " содержит:");
        System.out.println(hundreds + " сотен;"); 
        System.out.println(dozens + " десяток;");
        System.out.println(ones + " едениц.");
        System.out.println();

        //Преобразование секунд
        System.out.println("*Преобразование секунд*");
        int srcSeconds = 86399;
        int hour = srcSeconds / 3600;
        int min = srcSeconds / 60 % 60;
        int sec = srcSeconds % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}   