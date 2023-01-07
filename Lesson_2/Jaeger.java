public class Jaeger {

    private String model;
    private String mark;
    private float height;   
    private float weight; 
    private int speed;  
    private int strength;
    private int amor;
    
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

    public void setAmor(int amor) {
        this.amor = amor;
    }
    public int getAmor() {
        return amor;
    }

    public void move() {
        System.out.println("moving");
    }

    public void drift() {
        System.out.println("drift");
    }

}