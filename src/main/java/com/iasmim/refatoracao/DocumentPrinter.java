package com.iasmim.refatoracao;

import java.util.List;

public class DocumentPrinter {
    public static void main(String[] args) {
        List<Document> documents = List.of(
                new PdfDocument(),
                new HtmlDocument(),
                new UnknowDocument()
        );

        for (Document doc : documents) {
            doc.print();
        }
    }
}
