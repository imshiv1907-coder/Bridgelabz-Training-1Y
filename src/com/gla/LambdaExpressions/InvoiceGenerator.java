import java.util.List;
import java.util.stream.Collectors;

class Invoice {
    String id;

    Invoice(String id) {
        this.id = id;
    }

    public String toString() {
        return "Invoice ID: " + id;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<String> transactionIds = List.of("TXN1", "TXN2", "TXN3");

        List<Invoice> invoices = transactionIds.stream()
            .map(Invoice::new)
            .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}