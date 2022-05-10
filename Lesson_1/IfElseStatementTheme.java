public class IfElseStatementTheme {
    public static void main(String[] args) {
        //Перевод псевдокода на язык Java
        System.out.println("Перевод псевдокода на язык Java - это название задачи");
        int item = 28;
        int height = 178;
        Boolean man = true;
        
        if (item > 20) {
            System.out.println("Ты супер стар");
        } else {
            System.out.println("Молод");
        }
        
        if (!man) {
            System.out.println("Баба");
        } else {
            System.out.println("Мужик");
        }
        
        if (height < 1.80) {
            System.out.println("Карлик");
        } else {
            System.out.println("Гуливер");
        }
        
        
        char c = "Mansur".charAt(0);
        if(c == 'M') {
            System.out.println("откройте букмы М");
        } else if (c == 'a') {
            System.out.println("откройте букву I");
        } else {
            System.out.println("Не позет в карты, повезет в любви!");
        }
        System.out.println(c);
    }
}