public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        
        String gender = wolf.setGender("man");
        String genderGet = wolf.getGender();
        System.out.println("genderGet = " + genderGet);
        
        String name = wolf.setName("Akela");
        String nameGet = wolf.getName();
        System.out.println("nameGet = " + nameGet);

        double weight = wolf.setWeight(55);
        double weightget = wolf.getWeight();
        System.out.println("weightget = " + weightget);
        
        int age = wolf.setAge(7);
        int ageGet = wolf.getAge();
        System.out.println("ageGet = " + ageGet);
        
        String colour = wolf.setColour("black");
        String colourGet = wolf.getColour();
        System.out.println("colourGet = " + colourGet);

        String go = wolf.setGo("He goes to park");
        String goGet = wolf.getGo();
        System.out.println("goGet = " + goGet);
    }
}