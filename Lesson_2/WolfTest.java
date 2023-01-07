public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        
        wolf.setGender("man");
        String genderGet = wolf.getGender();
        System.out.println("genderGet = " + genderGet);
        
        wolf.setName("Akela");
        String nameGet = wolf.getName();
        System.out.println("nameGet = " + nameGet);

        wolf.setWeight(55);
        double weightget = wolf.getWeight();
        System.out.println("weightget = " + weightget);
        
        wolf.setAge(7);
        int ageGet = wolf.getAge();
        System.out.println("ageGet = " + ageGet);
        
        wolf.setColour("black");
        String colourGet = wolf.getColour();
        System.out.println("colourGet = " + colourGet);

        wolf.setGo("He goes to park");
        String goGet = wolf.getGo();
        System.out.println("goGet = " + goGet);
    }
}