package creational;

public interface Builder {
    Builder model(String model);
    Builder company(String company);
    Builder engine(String engine);
    Builder colour(String colour);
}

class Car1{
    private final String model;
    private final String company;
    private final String engine;
    private final String colour;

    Car1(String model, String company, String engine, String colour) {
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.colour = colour;
    }
}

class CarBuilder implements Builder{
    private String model;
    private String company;
    private String engine;
    private String colour;
    @Override
    public CarBuilder model(String model){
        this.model = model;
        return this;
    }
    @Override
    public CarBuilder company(String company){
        this.company = company;
        return this;
    }
    @Override
    public CarBuilder engine(String engine){
        this.engine = engine;
        return this;
    }
    @Override
    public CarBuilder colour(String colour){
        this.colour = colour;
        return this;
    }
    public Car1 build(){
        return new Car1(model,company,engine,colour);
    }
}

class ShowBuilder{
    public void main(){
//        CarBuilder builder = new CarBuilder();
//        Car1 car = builder.model("ZEN").company("Maruti").colour("red").build();

//        Director director = new Director();
//        CarBuilder builder = new CarBuilder();
//        director.buildMaruti(builder);
//        Car1 car = builder.build();

        Director director = new Director();
        Builder carBuilder = new CarBuilder();
        director.buildMaruti(carBuilder);
        

    }


}

class Director{
    public void buildMaruti(Builder builder){
        builder.model("").company("");
    }
    public void buildTata(Builder builder){
        builder.model("").company("").colour("");
    }
}

class CarSchema{
    private final String model;
    private final String company;
    private final String engine;
    private final String colour;

    public CarSchema(String model, String company, String engine, String colour) {
        this.model = model;
        this.company = company;
        this.engine = engine;
        this.colour = colour;
    }
}
class CarSchemaBuilder implements Builder{
    private String model;
    private String company;
    private String engine;
    private String colour;

    @Override
    public Builder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public Builder company(String company) {
        this.company = company;
        return this;
    }

    @Override
    public Builder engine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder colour(String colour) {
        this.colour = colour;
        return this;
    }

    public CarSchema build(){
        return new CarSchema(model,company,engine,colour);
    }
}


