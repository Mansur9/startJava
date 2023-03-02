public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        
        wolf.setGender("man");
        System.out.println("gender = " + wolf.getGender());
        
        wolf.setName("Akela");
        System.out.println("name = " + wolf.getName());

        wolf.setWeight(55);
        System.out.println("weight = " + wolf.getWeight());
        
        wolf.setAge(7);
        System.out.println("age = " + wolf.getAge());
        
        wolf.setColour("black");
        System.out.println("colour = " + wolf.getColour());

        wolf.setMovement("movement");
        System.out.println("movement = " + wolf.getMovement());
    }
}