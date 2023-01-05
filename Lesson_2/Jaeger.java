public class Jaeger {
    private String model;
    private String mark;
    private float height;   
    private float weight; 
    private int Speed;  
    private int strength;
    private int amor;
    
    public String setModel(String model) {
        this.model = model;
        return model;
    }

    public String getModel() {
        return model;
    }

    public String setMark(String mark) {
        this.mark = mark;
        return mark;
    }

    // public String getMark() {
    //     return Mark;
    // }

    public float setHeight(float height) {
        this.height = height;
        return height;
    }

    public float getHeight() {
        return height;
    }

    // public float setWeight() {
    //     this.
    //     return weight;
    // }

    public void move() {
        System.out.println("moving");
    }


    public void drift() {
        System.out.println("drift");
    }

}