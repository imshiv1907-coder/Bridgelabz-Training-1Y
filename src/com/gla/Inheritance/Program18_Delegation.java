class Printer {
    void print() {
        System.out.println("Printing...");
    }
}
class Office {
    private Printer printer = new Printer();
    void printDocument() {
        printer.print();
    }
    public static void main(String[] args) {
        Office o = new Office();
        o.printDocument();
    }
}