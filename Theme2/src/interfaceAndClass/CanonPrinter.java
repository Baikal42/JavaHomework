package interfaceAndClass;

public class CanonPrinter extends Printer {

    @Override
    public void printPdfFile() {
        System.out.println("Печатаю файл PDF");
    }

    @Override
    public void printWordFile() {
        System.out.println("Печатаю файл Word");
    }

    public static void main(String[] args) {
        CanonPrinter officePrinter = new CanonPrinter();
        officePrinter.printPdfFile();
        officePrinter.printWordFile();

    }
}
