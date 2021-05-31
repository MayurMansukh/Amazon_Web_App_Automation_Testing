package com.bridgelabz.testcase;

import com.bridgelabz.BASE.Base;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class PdfHandlingTest extends Base {
    static String url ="http://www.pdf995.com/samples/pdf.pdf";

    public static  String readPdfContent(String url) throws IOException, MalformedURLException {

        URL pdfUrl = new URL(url);
        InputStream in = pdfUrl.openStream();
        BufferedInputStream bf = new BufferedInputStream(in);
        PDDocument doc = PDDocument.load(bf);
        int numberOfPages = getPageCount(doc);
        System.out.println("The total number of pages "+numberOfPages);
        String content = new PDFTextStripper().getText(doc);
        doc.close();
        System.out.println(content);

        return content;
    }

    public static int getPageCount(PDDocument doc) {
        //get the total number of pages in the pdf document
        int pageCount = doc.getNumberOfPages();
        return pageCount;

    }

    public static void main(String[] args) throws IOException {
        readPdfContent(url);
    }
}
