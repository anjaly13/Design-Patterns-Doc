package creational;

import java.util.ArrayList;
import java.util.List;

public interface Prototype {
    Car clone();
}

//class Car implements Prototype{
//    private String brand;
//    private String model;
//    private String colour;
//    private int topSpeed;
//
//    public Car(){}
//
//    public Car(Car car){
//        this.brand = car.brand;
//        this.model = car.model;
//        this.colour = car.colour;
//        this.topSpeed = car.topSpeed;
//    }
//
//    @Override
//    public Car clone() {
//        return new Car(this);
//    }
//}

class Vehicle{
    private String brand;
    private String model;
    private String colour;

    public Vehicle(Vehicle vehicle){
        this.brand = vehicle.brand;
        this.model = vehicle.model;
        this.colour = vehicle.colour;
    }
}

class Car extends Vehicle implements Prototype{
    private int topSpeed;
        public Car (Car car){
        super(car);
        this.topSpeed = car.topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}

class Major{
    public void example(List<Prototype> vehicles){
        List<Prototype> copyList = new ArrayList<>();
        for(Prototype p : vehicles){
            copyList.add(p);
        }
    }
}

////////////////////////////////////////////////////////////////


abstract class Printer{
    private String model;
    private String company;

    public Printer(){}
    public Printer(Printer printer){
        this.model = printer.model;
        this.company = printer.company;
    }

    abstract void print();

}

class BlackPrinter extends Printer{
    private String colour;
    public BlackPrinter(){
    }
    public BlackPrinter(BlackPrinter blackPrinter){
        super(blackPrinter);
        this.colour = blackPrinter.colour;
    }

    @Override
    void print() {
        System.out.println(" print " + this.colour);
    }
}

class RedPrinter extends Printer{
    private String colour;
    public RedPrinter(){
    }
    public RedPrinter(RedPrinter redPrinter){
        super(redPrinter);
        this.colour = redPrinter.colour;
    }

    @Override
    void print() {
        System.out.println(" print " + this.colour);
    }
}
