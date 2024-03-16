package builder;

public class Printer {

    private int id;

    private String company;
    private String model;

    private String colour;

    private int price;

    private String type;

    public Printer(int id, String company, String model, String colour, int price, String type) {
        this.id = id;
        this.company = company;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.type = type;
    }
}
class Run{
    public static void main(String args[]){
        //Printer printer =  new Printer(1,"P120","Red",2000,"Automatic");

//        PrinterBuilder printerBuilder = new PrinterBuilder();
//        Printer printer = printerBuilder.id(1)
//                                .company("Philips")
//                                .model("P120")
//                                .colour("Red")
//                                .price(2000)
//                                .type("Automatic")
//                                .build();

        Director director = new Director();
        Builder builder = new PrinterBuilder();
        director.buildPhilipsPrinter(builder);
        Printer printer =  builder.build();
    }
}


class Director{
    public void buildPhilipsPrinter(Builder builder){
        builder.id(1)
                .company("Philips")
                .model("P120")
                .colour("Red")
                .price(2000)
                .type("Automatic")
                .build();
    }
    public void buildCanonPrinter(Builder builder){
        builder.id(2)
                .company("Canon")
                .model("C120")
                .colour("Red")
                .price(2000)
                .type("Automatic")
                .build();
    }
}

