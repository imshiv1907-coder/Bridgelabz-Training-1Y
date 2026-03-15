
interface DataExporter {
    void exportCSV();
    void exportPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON");
    }
}

class ReportExporter implements DataExporter {
    public void exportCSV() { System.out.println("Export CSV"); }
    public void exportPDF() { System.out.println("Export PDF"); }
}
