package Factory;

public abstract class Factory {
//    public void createPrinter(String request){
//        Printer printer = null;
//        if(request.equalsIgnoreCase("DIGITAL")){
//            printer = new DigitalPrinter();
//        }else{
//            printer = new LaserPrinter();
//        }
//        printer.assemblePrinter();
//    }

    public Printer orderPrinter(){
        Printer printer = createPrinter();
        printer.assemblePrinter();
        return printer;
    }
    abstract Printer createPrinter();
}

class Run{
    public static void main(String[] args) {
        Factory digitalPrinterFactory = new DigitalPrinterFactory();
        Printer digitalPrinter = digitalPrinterFactory.orderPrinter();

        Factory laserPrinterFactory = new LaserPrinterFactory();
        Printer laserPrinter = laserPrinterFactory.orderPrinter();
    }
}
