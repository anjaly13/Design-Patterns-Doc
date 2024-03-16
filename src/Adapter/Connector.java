package Adapter;

public interface Connector {

    void charging(USBCable usbCable);
    void transferData(USBCable usbCable);
}
class USBConnector implements Connector{

    @Override
    public void charging(USBCable usbCable) {

    }

    @Override
    public void transferData(USBCable usbCable) {

    }
}
class MicroUsbAdapter implements Connector{
    private MicroUsbConnector microUsbConnector;
    @Override
    public void charging(USBCable usbCable) {
        MicroUsbCable cable = convertUsbCabletoMicroUsbCable(usbCable);
        microUsbConnector.charging(cable);
    }

    @Override
    public void transferData(USBCable usbCable) {
        MicroUsbCable cable = convertUsbCabletoMicroUsbCable(usbCable);
        microUsbConnector.transferData(cable);
    }
    MicroUsbCable convertUsbCabletoMicroUsbCable(USBCable usbCable){
        return null; // return micro Usb cable object
    }
}
class MicroUsbConnector{
    public void charging(MicroUsbCable usbCable) {

    }
    public void transferData(MicroUsbCable usbCable) {

    }
}
class MicroUsbCable{

}
class USBCable{

}