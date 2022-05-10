public class IfElseStatementTheme {
    public static void main(String[] args) {
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
        
        
        // String name = "Man".charAt(0);
        // if(name == 'M') {
        //     System.out.println("МММММММ");
        // } if else (name == 'I') {
        //     System.out.println("МММММММ");
        // } else {
        //     System.out.println("МММММММ");
        // }
    }
}