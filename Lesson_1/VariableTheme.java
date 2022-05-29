public class VariableTheme {
    public static void main(String[] args) {
        // Создание переменных и вывод их значений на консоль 
        System.out.println("*Создание переменных и вывод их значений на консоль*");
        byte graphics = 10;
        short hdMemory = 120;
        long ramMemory = 4l;
        float wifiFrequency = 2.4f;
        double videoCardsAmdSeria = 5500d;
        char videoCardsAmdSign = 's';
        int videoCardsAmdModel = 10;
        boolean goodNotebook = true;
        System.out.println("Byte = " + graphics + "\n" + "Short = "+ hdMemory + "\n" + "Long = " + ramMemory + "\n" + "Float = " + wifiFrequency + "\n" + "Double = " + videoCardsAmdSeria + "\n" + "char = " + videoCardsAmdSign + "\n" + "int = " + videoCardsAmdModel );
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
        System.out.println(codeChar1);
        System.out.println(codeChar2);
        System.out.println(codeChar3);
        System.out.println(codeChar4);
        System.out.println(codeChar5);

        //Произведение и сумма цифр числа
        System.out.println("*Произведение и сумма цифр числа*");
        int nuberPro1 = 3;
        int nuberPro2 = 4;
        int nuberPro3 = 5;
        int proiz = nuberPro1 * nuberPro2 * nuberPro3;
        int nuberForSum1 = 3;
        int nuberForSum2 = 4;
        int nuberForSum3 = 5;
        int sum = nuberForSum1 + nuberForSum2 + nuberForSum3;
        System.out.println("Произведение = " + proiz);
        System.out.println("Сумма = " + sum);

        //Вывод на консоль ASCII-арт Дюка
        System.out.println("*Вывод на консоль ASCII-арт Дюка*");
        char slashPr = 47;
        char slashObr = 92;
        char underlining = 95;
        char bracket = 40;
        char bracketBack = 41;
        String probel = " ";
        System.out.println(probel.repeat( 4 ) + slashPr + slashObr + probel.repeat( 4 ));
        System.out.println(probel.repeat( 3 ) + slashPr + probel.repeat( 2 ) + slashObr + probel.repeat( 3 ));
        System.out.println(probel.repeat( 2 ) + slashPr + underlining + bracket + probel + bracketBack + slashObr + probel.repeat( 2 ));
        System.out.println(probel.repeat( 1 ) + slashPr + probel.repeat( 6 ) + slashObr + probel.repeat( 1 ));
        System.out.println(probel.repeat( 0 ) + slashPr + underlining + underlining + underlining + underlining + slashPr + slashObr + underlining + underlining + slashObr + probel.repeat( 0 ));
  
        // Отображение количества сотен, десятков и единиц числа
        System.out.println("*Отображение количества сотен, десятков и единиц числа*");
        double item = 123;
        int hundreds = (int)(item / 100) % 10; //сотни - получаем одну ед сотен
        double dozens = (int)(item / 10) % 10; //десятки - используется две десятки
        double units = item % 10; //единицы - всего три единицы
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