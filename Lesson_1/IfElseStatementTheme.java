
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
            System.out.println(" большая буква");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println(" число");
        } else {
            System.out.println(" не буква и не число");
        }

        System.out.println("\nОпределение суммы вклада и начисленных банком %");
        double contribution = 300000;
        double deposit = 100000;
        double contributionInterest;
        double depositSum;
        double percent;
        if (deposit > contribution) {
            percent = 0.05;
        } else if (contribution >= deposit && deposit <= 300000) {
            percent = 0.07;
        } else {
            percent = 0.1;
        }
            contributionInterest = contribution * percent;
            depositSum = contributionInterest + contribution;
            System.out.println("сумма вклада = " + contribution);
            System.out.println("начисленный % = " + contributionInterest);
            System.out.println("итоговая сумма с % =" + depositSum);
            System.out.println("5 баллов");

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
        System.out.println("\nОпределение оценки по предметам");
        
        int history = 59;
        int programming = 91;
        int totalProgramming = 0;
        int estimationHistr = 0;
        int estimationProg = 0;
        int quantityScoreHistr = 0;
        int quantityScoreProg = 0;
        int totalHistory = 0;
        if (history <= 60) {
            estimationHistr = 2;
            quantityScoreHistr = 1;
        } else if (history > 60) {
            estimationHistr = 3;
            quantityScoreHistr = 1;
        } else if (history > 73) {
            estimationHistr = 4;
            quantityScoreHistr = 1;
        } else if (history > 91) {
            estimationHistr = 5;
            quantityScoreHistr = 1;
        }
        if (programming <= 60) {
            estimationProg = 2;
            quantityScoreProg = 1;
        } else if (programming > 60) {
            estimationProg = 3;
            quantityScoreProg = 1;
        } else if (programming > 73) {
            estimationProg = 4;
            quantityScoreProg = 1;
        } else if (programming > 91) {
            estimationProg = 5;
            quantityScoreProg = 1;
        }
        System.out.println(estimationHistr + " - history");
        totalHistory = estimationHistr / quantityScoreHistr;
        System.out.println(totalHistory + " - средний балл оценок по history");
        totalProgramming = estimationProg / quantityScoreProg;
        System.out.println(estimationProg + " - programming");
        System.out.println(totalProgramming + " - средний балл оценок по programming");
        System.out.println("средний % по предметам = " + ((history +programming)/2));
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
        
        System.out.println("\nРасчет прибыли");
        int rent = 5000;
        int sales = 13000;
        int costPrice = 9000;
        int totalSales = (sales - costPrice - rent) * 12;
        if (totalSales > 0) {
            System.out.println("прибыль за год: " + totalSales);
        } else {
            System.out.println("прибыль за год: + " + totalSales);
        }
        
    }
    
}    
