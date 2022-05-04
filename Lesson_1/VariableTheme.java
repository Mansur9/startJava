public class VariableTheme {
    public static void main (String[] args){

        // Создание переменных и вывод их значений на консоль 
        byte graphics_Value = 10;
        short hd_Value = 120;
        long ddr_Value = 4l;
        float wifi_Value = 2.4f;
        double amd_Value = 5500d;
        char g_Value = 's';
        int i = 10;
        boolean good_notebook = true;
        System.out.println("Byte = " + graphics_Value + "\n" + "Short = "+ hd_Value + "\n" + "Long = " + ddr_Value + "\n" + 
            "Float = " + wifi_Value + "\n" + "Double = " + amd_Value + "\n" + "char = " + amd_Value + "\n" + "int = " + i );
        System.out.print(good_notebook + "\n");

        // Расчет стоимости товара со скидкой
        int x = 100;
        int y = 200;
        float skidka = 0.11f;
        float z = (x + y) * skidka; //размер скидки
        float sumItogSoSkid = x + y - z;
        System.out.print("сумма скидки = " + z + "\n");
        System.out.print("итогова сумма товаров со скидкой = " + sumItogSoSkid + "\n");

        // Вывод на консоль слова JAVA
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a ");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        //Отображение min и max значений числовых типов данных 
        long lValue = 9222372036854775807l;
        byte bValue = 127;
        short sValue = 32767;
        int mValue = 2147483647;
        System.out.println(lValue);
        System.out.println(bValue);
        System.out.println(sValue);
        System.out.println(mValue);
        System.out.println(lValue + 1);
        System.out.println(bValue + 1);
        System.out.println(sValue + 1);
        System.out.println(mValue + 1);
        System.out.println(lValue - 1);
        System.out.println(bValue - 1);
        System.out.println(sValue - 1);
        System.out.println(mValue - 1);

        // Перестановка значений переменных
        float fValueFirst = 4f;
        float fValueSecond = 5f;
        System.out.println(fValueFirst + "\n" + fValueSecond + "\n");
        float fValue = fValueSecond;
        System.out.println(fValue + "\n" + fValueFirst + "\n");

        // Вывод ASCII-символов и их кодов
        int varA = 35;
        int varB = 38;
        int varC = 64;
        int varD = 94;
        int varE = 95;
        System.out.print(varA + " #" + "\n");
        System.out.print(varB + " &" + "\n");
        System.out.print(varC + " @" + "\n");
        System.out.print(varD + " ^" + "\n");
        System.out.print(varE + "  " + "\n");

        //Произведение и сумма цифр числа
        int proiz = 3 * 4 * 5;
        int sum = 3 + 4 + 5;
        System.out.println("Произведение = " + proiz);
        System.out.println("Сумма = " + sum);

        //Вывод на консоль ASCII-арт Дюка
        char x1 = 47;
        char x2 = 92;
        char x3 = 95;
        char x4 = 40;
        char x5 = 41;
        String prob1 = "  ";
        String probel2 = "   ";
        String probel = "    ";
        String probel0 = " ";
        String probel3 = "  ";
        String probel4 = "      ";
        System.out.print(probel+x1);
        System.out.println(x2);
        System.out.println(probel2+x1+prob1+x2);
        System.out.print(probel3+x1);
        System.out.print(x3);
        System.out.print(x4);
        System.out.print(probel0);
        System.out.print(x5);
        System.out.println(x2);
        System.out.println(probel0+x1+probel4+x2);
        System.out.print(x1);
        System.out.print(x3);
        System.out.print(x3);
        System.out.print(x3);
        System.out.print(x3);
        System.out.print(x1);
        System.out.print(x2);
        System.out.print(x3);
        System.out.print(x3);
        System.out.println(x2);
  
        // Отображение количества сотен, десятков и единиц числа
        double item = 123;
        int hundreds = (int)(item/100)%10; //сотни - получаем одну ед сотен
        double dozens = (int)(item/10)%10; //десятки - используется две десятки
        double units = item %10; //единицы - всего три единицы
        System.out.println(hundreds); 
        System.out.println(dozens);
        System.out.println(units);

        int secs = 86399;
        int hour = secs / 3600;
        int min = secs / 60 % 60;
        int sec = secs / 1 % 60;
        System.out.println(hour+":"+min+":"+sec);
    }
}   