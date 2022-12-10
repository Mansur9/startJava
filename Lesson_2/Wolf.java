public class Wolf {

    private String gender;
    private String name;   
    private double weight; 
    private int age;  
    private String colour;
    private String go;
    
    public String setGender(String gender) {
        this.gender = gender;
        return gender;
    }

    public String getGender() {
        return gender;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    public double setWeight(double weight) {
        this.weight = weight;
        return weight;
    }

    public double getWeight() {
        return weight;
    }

    public int setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
            }
        return age;
        }

    public int getAge() {
        return age;
    }

    public String setColour(String colour) {
        this.colour = colour;
        return colour;
    }

    public String getColour() {
        return colour;
    }

    public String setGo(String go) {
        this.go = go;
        return go;
    }
     public String getGo() {
        return go;
    }    
}
