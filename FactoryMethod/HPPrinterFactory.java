public class HPPrinterFactory  extends APrinterFactory {

    @Override
    public APrinter CreatePrinter() {
        return new HPPrinter();
    }
}
