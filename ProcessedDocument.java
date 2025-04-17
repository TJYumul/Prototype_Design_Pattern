public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.getOriginalPdfPrototype();
        System.out.println();
        pdf.open();
        System.out.println(pdf.toString());

        System.out.println();
        Document text = registry.getOriginalTextPrototype();
        text.open();
        System.out.println(text.toString());

        System.out.println();
        Document spreadsheet = registry.getOriginalSpreadsheetPrototype();
        spreadsheet.open();
        System.out.println(spreadsheet.toString());
        System.out.println();

        Document pdf2 = registry.createPdf("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}
