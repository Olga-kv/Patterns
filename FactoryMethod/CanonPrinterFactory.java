public class CanonPrinterFactory extends APrinterFactory {
    @Override
    public APrinter CreatePrinter() {
        return new CanonPrinter();
    }
}
