package builder;

public class PrinterBuilder implements Builder{

    private int id;
    private String company;

    private String model;

    private String colour;

    private int price;

    private String type;

    public PrinterBuilder id(int id){
        this.id = id;
        return this;
    }
    public PrinterBuilder company(String company){
        this.company = company;
        return this;
    }
    public PrinterBuilder model(String model){
        this.model = model;
        return this;
    }
    public PrinterBuilder colour(String colour){
        this.colour = colour;
        return this;
    }
    public PrinterBuilder price(int price){
        this.price = price;
        return this;
    }
    public PrinterBuilder type(String type){
        this.type = type;
        return this;
    }
    public Printer build(){
        return new Printer(id,company,model,colour,price,type);
    }
}
