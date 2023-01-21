package day43_OOPAbstractionIntro_abstractClass_abstractMethod.car;

public final class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autopilot(){
        System.out.println(getBrand() + " " + getModel() + " has auto pilot feature");
    }


    @Override
    public void stop() {
        super.stop();
    }
}
//2:07