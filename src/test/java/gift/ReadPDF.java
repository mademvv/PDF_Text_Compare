package gift;

import java.io.*;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.util.*;

public class ReadPDF {

// public static void main(String[] args){
	public static void read_pdf(String PDFFILE, String textfile){
 PDDocument pd;
 BufferedWriter wr;
 try {
        // File input = new File("D:\\janardhan\\workspace\\gift\\target\\DocxStructures.pdf");  // The PDF file from where you would like to extract
         //File output = new File("D:\\janardhan\\workspace\\gift\\data\\destination.txt"); // The text file where you are going to store the extracted data
        // File output = new File("D:\\janardhan\\workspace\\gift\\data\\source.txt"); // The text file where you are going to store the extracted data
         
         File input = new File(PDFFILE);  // The PDF file from where you would like to extract
         //File output = new File("D:\\janardhan\\workspace\\gift\\data\\destination.txt"); // The text file where you are going to store the extracted data
         File output = new File(textfile); // The text file where you are going to store the extracted data
         
         
         pd = PDDocument.load(input);
         System.out.println(pd.getNumberOfPages());
         System.out.println(pd.isEncrypted());
        // pd.save("CopyOfInvoice.pdf"); // Creates a copy called "CopyOfInvoice.pdf"
         PDFTextStripper stripper = new PDFTextStripper();
         wr = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output)));
         stripper.writeText(pd, wr);
         if (pd != null) {
             pd.close();
         }
        // I use close() to flush the stream.
        wr.close();
 } catch (Exception e){
         e.printStackTrace();
        } 
     }
}
