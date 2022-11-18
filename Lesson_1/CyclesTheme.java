public class CyclesTheme {
    public static void main(String[] aerg) {
        System.out.println("Подсчет суммы четных и нечетных чисел");
        int endRange = 21;
        int startRange = -10;
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        do {
            if(startRange % 2 == 0) { 
                sumOddNumber += startRange;
            } else {
                sumEvenNumber += startRange;
            }
            startRange++;
        } while (startRange <= endRange);
        System.out.println("Сумма четных = " + sumEvenNumber);
        System.out.println("Сумма нечетных = " + sumOddNumber);

        System.out.println("\nВывод чисел в интервале (min и max) в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int max = a;
        int min = b;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (a < min) {
            min = a;
        }
        if (c < min) {
            min = c;
        }
        for (int i = --max; i > min; i--) {
            System.out.print(i);
        }

        System.out.println("\n" + "\nВывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int sumDigits = 0; //sumNumber назови sumDigits
        // int digit = 0;
        while (srcNumber > 0) {
            int digit = srcNumber % 10;
            System.out.print(digit);
            sumDigits += digit;
            srcNumber /= 10;
        }
        System.out.println("\nSum of digits of given number: " + sumDigits);

        System.out.println("\nВывод чисел на консоль в несколько строк");
        int countInRow = 0;
        for (int i = 1; i < 24; i += 2) {
            countInRow = countInRow + 1;
            System.out.printf("%3s", i);
            if (countInRow == 5) {
                System.out.println();
                countInRow = 0;
            }
        }
        if (countInRow != 0) {
            while (countInRow < 5) {
                System.out.printf("%3s", 0);
                countInRow++;
            }
        }

        System.out.println("\n" + "\nПроверка количества единиц на четность");
        srcNumber = 3242592; // вместо srcNumberSecond используй ранее созданную переменную srcNumber
        int digitsRemainder = 1;
        int SaveDigitSrcNumber = 1;
        int counter = 0;
        int countNumberSecond = 1;
        while (digitsRemainder > 0 ) {
            digitsRemainder = srcNumber / countNumberSecond % 10;
            countNumberSecond *= 10;
            if (digitsRemainder == 2) {
                counter++;
            }
        }
        if (digitsRemainder % 2 == 0) {
            System.out.println("число " + srcNumber + " содержит " + counter + " - четное количество двоек");
        } else {
            System.out.println("число " + srcNumber + " содержит " + counter + " - нечетное количество двоек");
            }

        System.out.println("\n" + "\nОтображение фигур в консоли");
        int i = 0;
        int j = 1;
        int k = 0;
        int countInNext = 0;
        char symblAce = 36;
        char symblStar = 42;
        char symbolGrille = 35;
        for (i = 0; i < 50; i++) {
            countInNext ++;
            System.out.print(symblStar);
            if (countInNext == 10) {
                System.out.println();
                countInNext = 0;
            }
        }
        System.out.println();
        while(k < 15) {
            k++;
            if (k < 6) {
                System.out.print(symbolGrille);
            } else if (k == 6) {
                System.out.print("\n" + symbolGrille);
            } else if (k > 6 && k < 10) {
                System.out.print(symbolGrille);
            } else if (k == 10) {
                System.out.print("\n" + symbolGrille);
            } else if (k > 10 && k < 13) {
                System.out.print(symbolGrille);
            } else if (k == 13) {
                System.out.print("\n" + symbolGrille);
            } else if (k > 13 && k < 15) {
                System.out.print(symbolGrille);
            }else if (k == 15) {
            System.out.print("\n" + symbolGrille);
            }
        }
        System.out.println();
        do {
            if (j > 1 && j < 4) {
                System.out.print(symblAce);
            } else if (j == 4) {
                System.out.print("\n" + symblAce);
            } else if (j > 4 && j < 7) {
                System.out.print(symblAce);
            } else if (j == 7) {
                System.out.print("\n" + symblAce);
            } else if (j > 7 && j < 9) {
                System.out.print(symblAce);
            } else {
                System.out.println("\n" + symblAce);
            }
        j++;
        } while (j <= 9);
        
        System.out.println("\nОтображение ASCII-символов");
        char symbol;
        for(int n = 0; n < 48; n++) {
            if (n % 2 == 1) {
            System.out.print(n + " - ");
            symbol = (char)n;
            System.out.println(symbol);
            }
        }
        for(int n = 97; n < 123; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " - ");
                symbol = (char)n;
                System.out.println(symbol);
            }
        }

        System.out.println("\nПроверка, является ли число палиндромом");
        int numberPolidrome = 1234321;
        int srcNumberSave = numberPolidrome;
        int countNumberSave = 0;
        int NumbersRev = 0;
       
        while (srcNumberSave > 0 ) {
            NumbersRev = srcNumberSave % 10;
            countNumberSave = countNumberSave * 10 + NumbersRev;
            srcNumberSave = srcNumberSave / 10;
            }
        if (numberPolidrome == countNumberSave) {
            System.out.println("число " + numberPolidrome + " является палиндромом");
        } else {
            System.out.println("число " + numberPolidrome + " не является палиндромом");
        }

        System.out.println("\nОпределение, является ли число счастливым");
        int numeric = 123321;
        int digit1 = (numeric / 100000) % 10;
        int digit2 = (numeric / 10000) % 10;
        int digit3 = (numeric / 1000) % 10;
        int digit4 = (numeric / 100) % 10;
        int digit5 = (numeric / 10) % 10;
        int digit6 = numeric % 10;
        int sumFirs = digit1 + digit2 + digit3; 
        int sumSecond = digit4 + digit5 + digit6;
        System.out.println("Сумма цифр первой группы " + sumFirs + " = " + digit1 + " + " + digit2 + " + " + digit3); 
        System.out.println("Сумма цифр второй группы " + sumSecond + " = " + digit4 + " + " + digit5 + " + " + digit6);
        if (sumFirs == sumSecond) {
        System.out.println("число " + numeric + " является счастливым");
        } else {
            System.out.println("число " + numeric + " не является счастливым");
        }

        System.out.println("\nВывод таблицы умножения Пифагора");
        for (int q = 1; q < 10; q++) {
            for (int r = 1; r < 10; r++) {
                System.out.printf("%3s",q * r);
            }
            System.out.println("");
    }
    }
}
