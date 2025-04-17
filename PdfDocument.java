public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PdfDocument(String fileName, String author, int pageCount) {
        System.out.println("Creating a PDF Document prototype.");
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public Document clone() {
        return new PdfDocument(this.fileName, this.author, this.pageCount);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
    }

    @Override
    public String getType() {
        return "PDF";
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String toString() {
        return "Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount;
    }
}
