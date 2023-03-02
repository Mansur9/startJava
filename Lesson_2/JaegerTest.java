public class JaegerTest {
    public static void main(String[] args) {
        
        Jaeger robot1 = new Jaeger();
        robot1.setModel("Striker Eureka");
        robot1.getModel();
        robot1.setMark("Mark-5");
        robot1.getMark();
        robot1.setHeight(76.2f);
        robot1.getHeight();
        robot1.setWeight(1.850f);
        robot1.setSpeed(10);
        robot1.setStrength(10);
        robot1.setArmor(9);

        Jaeger robot2 = new Jaeger("Khal Drog","Mark-2",77,2,11,16,7);
        System.out.println("Robot2 is model - " + robot2.getModel());
        System.out.println("Robot1 has method:");
        robot1.move();
        robot1.attack();
        System.out.println("Robot2 has method :");
        robot2.drift(); 
        robot2.jump();
    }
}