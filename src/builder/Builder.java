package builder;

public interface Builder {

    PrinterBuilder id(int id);
    PrinterBuilder model(String model);
    PrinterBuilder colour(String colour);
    PrinterBuilder price(int price);
    PrinterBuilder type(String type);

    Printer build();
}
