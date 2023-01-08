public class Jaeger {

    private String model;
    private String mark;
    private float height;   
    private float weight; 
    private int speed;  
    private int strength;
    private int armor;
    
    public Jaeger() {
    }

    // public Jaeger(String model, String mark) {
    //     this(model, mark, 70.0f, 7.640f, 8, 4, 6);
    // }

     // public Jaeger(String model, String mark) {
    //     this.model = model;
    //     this.mark = mark;
    //     this.height = 70.0f;
    //     this.weight = 7.640f;
    //     this.speed = 8;
    //     this.strength = 4;
    //     this.armor = 6;
    // }

    public Jaeger(String model, String mark, float height, float weight, int speed, int strength, int armor) {
        this.model = model;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int amor) {
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }

    public void move() {
        System.out.println("moving");
    }

    public void drift() {
        System.out.println("drift");
    }

    public void jump() {
        System.out.println("jump");
    }

    public void attack() {
        System.out.println("attac");
    }

}