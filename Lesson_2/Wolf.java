public class Wolf {

    private String gender;
    private String name;   
    private double weight; 
    private int age;  
    private String colour;
    private String movement;
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
            }
        }

    public int getAge() {
        return age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setMovement(String move) {
        this.movement = movement;
    }
    
    public String getMovement() {
        return movement;
    }    
}