package gift;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.crypto.Data;

import org.apache.poi.xwpf.converter.itext.PDFViaITextOptions;
import org.apache.poi.xwpf.converter.pdf.PdfConverter;
import org.apache.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import com.lowagie.text.pdf.PdfWriter;

import fr.opensagres.xdocreport.itext.extension.IPdfWriterConfiguration;

public class DocxToPdf {
	public static  PdfOptions options  ;
	//public static void main(String[] args) {
		public static void Doc_To_PDF() {
		 long startTime = System.currentTimeMillis();

		    try
		    {
		        // 1) Load docx with POI XWPFDocument
		        XWPFDocument document = new XWPFDocument( new FileInputStream (new File ( System.getProperty("user.dir")+"\\data\\source_files\\source.docx" ))); 
		        // 2) Convert POI XWPFDocument 2 PDF with iText
		        File outFile = new File(  System.getProperty("user.dir")+"\\data\\source_files\\source.pdf" );
		        outFile.getParentFile().mkdirs();

		        OutputStream out = new FileOutputStream( outFile );
		        //PdfOptions options = null;// 
		        PdfOptions options = PdfOptions.create().fontEncoding( "windows-1252" );
		       // PdfOptions options = PdfOptions.getDefault();
		       
		          //  options.setConfiguration( new IPdfWriterConfiguration()
		        /*{
		                    
		          public void configure( PdfWriter writer )
		          {
		            writer.setPDFXConformance( PdfWriter.PDFA1A  );
		          }
		        });*/
		        PdfConverter.getInstance().convert( document, out, options );
		    }
		    catch ( Throwable e )
		    {
		        e.printStackTrace();
		    }

		    System.out.println( "Generate DocxStructures.pdf with " + ( System.currentTimeMillis() - startTime ) + " ms." );
}
}