public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        this.pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        this.textPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);
        this.spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public PdfDocument createPdf(String fileName, String author, int pageCount) {
        PdfDocument copy = (PdfDocument) pdfPrototype.clone();
        copy.setFileName(fileName); // only changing the filename
        return copy;
    }

    public TextDocument createText() {
        return (TextDocument) textPrototype.clone();
    }

    public SpreadsheetDocument createSpreadsheet() {
        return (SpreadsheetDocument) spreadsheetPrototype.clone();
    }

    public PdfDocument getOriginalPdfPrototype() {
        return pdfPrototype;
    }

    public TextDocument getOriginalTextPrototype() {
        return textPrototype;
    }

    public SpreadsheetDocument getOriginalSpreadsheetPrototype() {
        return spreadsheetPrototype;
    }
}
