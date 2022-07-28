import javax.annotation.processing.SupportedOptions;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        // - перепишите псевдокод, приведенный ниже, с помощью Java
        // - используйте переменные, условные операторы, логическое НЕ
        // - придумайте сообщения и отобразите в консоли 
        System.out.println("Перевод псевдокода на язык Java (это название задачи)");
        int age = 28;
        int height = 178;
        boolean maleGender = true;
        
        if (age > 20) {
            System.out.println("You are supper old");
        } else {
            System.out.println("You're young");
        }

        if (!maleGender) {
            System.out.println("You is girl");
        } 
        
        if (height < 180) {
            System.out.println("You have height < 180");
        } else {
            System.out.println("You have height > 180");
        }

        char letterFirst = "Mango".charAt(0);
        if(letterFirst == 'M') {
            System.out.println("open is letter - М");
        } else if (letterFirst == 'I') {
            System.out.println("open is letter - I");
        } else {
            System.out.println("you don't luck man!");
        }
        System.out.println(letterFirst + "\n");
        

        //Поиск max и min числа
        // - создайте две переменные, присвоив им любые числа
        // - найдите максимальное и минимальное число
        // - выведите числа на консоль, указав какое из них max и min
        System.out.println("Поиск max и min числа");
        int number1 = 23;
        int number2 = 30;
        
        if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else {
            System.out.println(number1 + " < " + number2 + "\n");
        }

        // Работа с числом
        // - создайте переменную с любым числом
        // - определите, являться ли оно:
                // - нулем
                // - четным (нечетным)
                // - отрицательным (положительным)
        // - если число равно 0, то остальные проверки не должны осуществляться
        // - отобразите полученные результаты
        System.out.println("Работа с числом");
        int srcNum = -222;
        
        if(srcNum != 0) {
            if(srcNum > 0) {
                System.out.printf("Число %d положительное\n", srcNum);
            } else {
                System.out.printf("Число %d отрицательное\n", srcNum);
            }
            if(srcNum % 2 == 0) {
                System.out.printf("Число %d четное\n", srcNum);
            } else {
                System.out.printf("Число %d нечетное\n", srcNum);
            }
        } else {
            System.out.printf("Число %d это ноль\n", srcNum);
    }

        // Поиск одинаковых цифр в числах
        // создайте две переменные, присвоив им два трехзначных целых числа
        // найдите в них одинаковые цифры, стоящие в одном и том же разряде
        // отобразите на консоль:
        //  - исходные числа
        //  - одинаковые в них цифры
        //  - номера разрядов
        System.out.println("Поиск одинаковых цифр в числах");
        int srcNumber = 123;
        int srcNumber2 = 321;
        int digitsHundreds = srcNumber % 10; //сотни - получаем одну ед сотен
        System.out.println(digitsHundreds + " первое число;"); 
        int digitsDozens = (srcNumber / 10) % 10; //десятки - получаем десятки
        System.out.println(digitsDozens + " второе число");
        int digitsOnes = srcNumber % 10; //единицы - получаем единицы
        System.out.println(digitsOnes + " третье число" + "\n");
        int digitsHundredsSecond = (srcNumber2 / 100) % 10; //сотни 
        System.out.println(digitsHundredsSecond + " первое число;"); 
        int digitsDozensSecond = (srcNumber2 / 10) % 10; //десятки 
        System.out.println(digitsDozensSecond + " второе число");
        int digitsOnesSecond = srcNumber2 % 10; //единицы
        System.out.println(digitsOnesSecond + " третье число");
        System.out.println();

        if (digitsHundreds != digitsHundredsSecond) {
            System.out.println("первые числа не совпали");
        } else {
                System.out.println("первые числа совпали " + digitsHundreds);
        }
        if (digitsDozens != digitsDozensSecond) {
            System.out.println("вторые число не совпали");
        } else {
            System.out.println("вторые числа совпали " + digitsDozens);
        }
        if (digitsOnes != digitsOnesSecond) {
            System.out.println("третьи числа не совпали");
        } else {
            System.out.println("третьи числа совпали" + digitsOnes);
        }
        
        // Определение буквы, числа или символа по их коду
        // создайте переменную типа char
        // присвойте ей значение ‘\u0057’
        // определите — это код буквы, числа или другого символа
        // использовать для этого методы классов Java запрещено!
        // выведите в консоль сам символ и информацию о нем:
        // маленькая (большая) буква
        // это число
        // не буква и не число
        System.out.println("Определение буквы, числа или символа по их коду");
        char someChar = '\u0057';
        System.out.print(someChar);
        if (someChar >= 'a' && someChar <= 'z') {
            System.out.println(" маленькая буква");
        } else if (someChar >= 'A' && someChar <= 'Z'){
            System.out.println("большая буква");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }

        System.out.println("\n" + "Определение суммы вклада и начисленных банком %");
        double contribution = 300000;
        double deposit = 100000;
        double contributionInterest;
        double depositSum;
        if (deposit > contribution) {
            contributionInterest = contribution * 0.05;
            depositSum = contributionInterest + contribution;
            System.out.println("сумма вклада = " + contribution);
            System.out.println("начисленный % = " + contributionInterest);
            System.out.println("итоговая сумма с % =" + depositSum);
        } else if (contribution >= deposit && deposit <= 300000) {
            contributionInterest = contribution * 0.07;
            depositSum = contributionInterest + contribution;
            System.out.println("сумма вклада = " + contribution);
            System.out.println("начисленный % = " + contributionInterest);
            System.out.println("итоговая сумма с % = " + depositSum);
        } else {
            contributionInterest = contribution * 0.1;
            depositSum = contributionInterest = contribution * 0.07;
            System.out.println("сумма вклада = " + contribution);
            System.out.println("начисленный % " + contributionInterest);
            System.out.println("итоговая сумма с % = " + depositSum);
        }

        // Определение оценки по предметам
        // студент получил итоговые % по предметам:
        // история 59%
        // программирование 91%
        // определите оценки по каждому предмету:
        // <= 60% — 2
        // > 60% - 3
        // > 73% - 4
        // > 91% - 5
        // выведите в консоль:
        // оценку и напротив предмет
        // средний балл оценок по предметам
        // средний % по предметам
        System.out.println("\n" + "Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        if (history <= 60) {
            int estimationHistr = 2;
            System.out.println( estimationHistr + " - history");
            int total = estimationHistr/1;
            System.out.println(total + " - средний балл оценок по history");
            
        } else if (history > 60) {
            int estimationHistr = 3;
            System.out.println("3 - history");
            int total = estimationHistr/1;
            System.out.println(total + " - средний балл оценок по history");
            
        } else if (history > 73) {
            int estimationHistr = 4;
            System.out.println("4 - history");
            int total = estimationHistr/1;
            System.out.println(total + " - средний балл оценок по history");
        } else if (history > 91) {
            int estimationHistr = 5;
            System.out.println("5 - history");
            int total = estimationHistr/1;
            System.out.println(total + " - средний балл оценок по history");
        }
        if (programming <= 60) {
            int estimationProg = 2;
            System.out.println("2 - programming"); 
            int total = estimationProg/1;
            System.out.println(total + " - средний балл оценок по programming");
        } else if (programming > 60) {
            int estimationProg = 3;
            System.out.println("3 - programming");
            int total = estimationProg/1;
            System.out.println(total + " - средний балл оценок по programming");
        } else if (programming > 73) {
            int estimationProg = 4;
            System.out.println("4 - programming");
            int total = estimationProg/1;
            System.out.println(total + " - средний балл оценок по programming");
        } else if (programming > 91) {
            int estimationProg = 5;
            System.out.println("5 - programming");
            int total = estimationProg/1;
            System.out.println(total + " - средний балл оценок по programming");
        }
        System.out.println("средний % по предметам = " + ((history +programming)/2));

        // Расчет прибыли
        // продавец снимает помещение за 5 000 руб. в месяц
        // в среднем в месяц он продает товара на 13 000 руб.
        // при этом его себестоимость равна 9 000 руб.
        // подсчитайте годовую прибыль
        // отобразите ее в консоли в следующем формате, например:
        // прибыль за год: -1000 руб.
        // прибыль за год: +3000 руб.
        // если прибыль положительная, то рядом с числом необходимо отображать +
        
        System.out.println("\n" + "Расчет прибыли");
        int rent = 5000;
        int sales = 13000;
        int costPrice = 9000;
        int totalSales = (sales - costPrice - rent) * 12;
        if (totalSales < 1000) {
            System.out.println("прибыль за год: " + totalSales);
        } else if (totalSales > 3000) {
            System.out.println("прибыль за год: + " + totalSales);
        }

    }
    
}    
