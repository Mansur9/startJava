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

        // Расчет стоимости товара со скидкой
        System.out.println("*Расчет стоимости товара со скидкой*");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        double skidka = 0.11f;
        double discount = (priceGoodsX + priceGoodsY) * skidka; //размер скидки
        double finishSale = priceGoodsX + priceGoodsY - discount;
        System.out.println("сумма скидки = " + discount);
        System.out.println("итогова сумма товаров со скидкой = " + finishSale);

        // Вывод на консоль слова JAVA
        System.out.println("*Вывод на консоль слова JAVA*");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        //Отображение min и max значений числовых типов данных 
        System.out.println("*Отображение min и max значений числовых типов данных*");
        long saveLong = Long.MAX_VALUE;
        System.out.println("Long.MIN_VALUE = " + saveLong);
        saveLong++;
        System.out.println("Long.MIN_VALUE = " + saveLong);
        saveLong--;
        System.out.println("Long.MIN_VALUE = " + saveLong);
        byte saveByte = Byte.MAX_VALUE;
        System.out.println("Byte.MAX_VALUE = " + saveByte);
        saveByte ++;
        System.out.println("Byte.MAX_VALUE = " + saveByte);
        saveByte --;
        System.out.println("Byte.MAX_VALUE = " + saveByte);
        int saveInteger = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE = " + saveInteger);
        saveInteger ++;
        System.out.println("Integer.MAX_VALUE = " + saveInteger);
        saveInteger --;
        System.out.println("Integer.MAX_VALUE = " + saveInteger);
        short saveShort = Short.MAX_VALUE;
        System.out.println("Short.MAX_VALUE = " + saveShort);
        saveShort ++;
        System.out.println("Short.MAX_VALUE = " + saveShort);
        saveShort --;
        System.out.println("Short.MAX_VALUE = " + saveShort);

        // Перестановка значений переменных
        System.out.println("*Перестановка значений переменных*");
        float number1 = 4f;
        float number2 = 5f;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        float buffer = number2;
        number2 = number1;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number2 = buffer; 
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number1 = number1 + number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number2 = number1 - number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        number1 = number1 - number2;
        System.out.println("number1 = " + number1 + "\n" + "number2 = " + number2);
        int numberBit_a = 7;
        int numberBit_b = 5;
        System.out.println("numberBit_a = " + numberBit_a + "\n" + "numberBit_b = " + numberBit_b);
        numberBit_a = numberBit_a ^ numberBit_b;
        System.out.println("numberBit_a = " + numberBit_a + "\n" + "numberBit_b = " + numberBit_b);
        numberBit_b = numberBit_a ^ numberBit_b;
        System.out.println("numberBit_a = " + numberBit_a + "\n" + "numberBit_b = " + numberBit_b);
        numberBit_a = numberBit_a ^ numberBit_b;
        System.out.println("numberBit_a = " + numberBit_a + "\n" + "numberBit_b = " + numberBit_b);

        // Вывод ASCII-символов и их кодов
        System.out.println("*Вывод ASCII-символов и их кодов*");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.print((int)(codeChar1) + " ");
        System.out.println(codeChar1);
        System.out.print((int)(codeChar2) + " ");
        System.out.println(codeChar2);
        System.out.print((int)(codeChar3) + " ");
        System.out.println(codeChar3);
        System.out.print((int)(codeChar4) + " ");
        System.out.println(codeChar4);
        System.out.print((int)(codeChar5) + " ");
        System.out.println(codeChar5);

        //Произведение и сумма цифр числа
        System.out.println("*Произведение и сумма цифр числа*");
        int srcNum = 345;
        int itemOne = srcNum/100;
        System.out.println(itemOne);
        int itemTwo = (srcNum/10)%10; // 
        System.out.println(itemTwo);
        int itemThree = (srcNum / 1) % 10;
        System.out.println(itemThree);
        int itemProiz = itemOne * itemTwo * itemThree;
        System.out.println("Произведение = " + itemProiz);
        int itemSum = itemOne + itemTwo + itemThree;
        System.out.println("Сумма = " + itemSum);

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("*Вывод на консоль ASCII-арт Дюка*");
        char slash = 47;
        char backslash = 92;
        char underlining = 95;
        char openBracket = 40;
        char closeBracket = 41;
        String space = " ";
        System.out.println(space.repeat( 4 ) + slash + backslash + space.repeat( 4 ));
        System.out.println(space.repeat( 3 ) + slash + space.repeat( 2 ) + backslash + space.repeat( 3 ));
        System.out.println(space.repeat( 2 ) + slash + underlining + openBracket + space + closeBracket + backslash + 
        space.repeat( 2 ));
        System.out.println(space.repeat( 1 ) + slash + space.repeat( 6 ) + backslash + space.repeat( 1 ));
        System.out.println(space.repeat( 0 ) + slash + underlining + underlining + underlining + underlining + 
        slash + backslash + underlining + underlining + backslash + space.repeat( 0 ));
  
        // Отображение количества сотен, десятков и единиц числа
        System.out.println("*Отображение количества сотен, десятков и единиц числа*");
        int item = 123;
        int hundreds = (item / 100) % 10; //сотни - получаем одну ед сотен
        int dozens = (item / 10) % 10; //десятки - используется две десятки
        int units = item % 10; //единицы - всего три единицы
        System.out.println(hundreds); 
        System.out.println(dozens);
        System.out.println(units);

        //Преобразование секунд
        System.out.println("*Преобразование секунд*");
        int srcSeconds = 86399;
        int hour = srcSeconds / 3600;
        int min = srcSeconds / 60 % 60;
        int sec = srcSeconds / 1 % 60;
        System.out.println(hour + " : " + min + " : " + sec);
    }
}   