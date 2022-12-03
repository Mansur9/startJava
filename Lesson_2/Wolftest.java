public class WolfTest{
    public static void main(String[] args) {
        Wolf wolfFirst = new Wolf();
        wolfFirst.gender = "man";
        wolfFirst.name = "Akela";
        wolfFirst.weight = 55;
        wolfFirst.age = 7;
        wolfFirst.colour = "Black";
        
        System.out.println("This wolf is " + wolfFirst.gender + ", his name is " + wolfFirst.name + ", he has a weight = " + wolfFirst.weight + ", age = " + wolfFirst.age + ", colour = " + wolfFirst.colour);
        wolfFirst.go();
        wolfFirst.sit();
        wolfFirst.run();
        wolfFirst.howl();
        wolfFirst.hunt();
        System.out.println(wolfFirst.speak());
    }
}