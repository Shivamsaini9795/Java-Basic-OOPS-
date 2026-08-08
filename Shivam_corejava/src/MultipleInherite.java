interface Printable {
    void print();
}

// Interface 2
interface Shareable {
    void share();
}

// Parent class
public class Document implements Printable, Shareable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void share() {
        System.out.println("Sharing document...");
    }
}

// Child class
public class PDFDocument extends Document {
    public void encrypt() {
        System.out.println("Encrypting PDF document...");
    }
}

public class Main {
    public static void main(String[] args) {
        PDFDocument pdfDoc = new PDFDocument();
        pdfDoc.print();
        pdfDoc.share();
        pdfDoc.encrypt();
    }
}
