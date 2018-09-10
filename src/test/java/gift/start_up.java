package gift;

import java.io.IOException;

public class start_up {

	public static void main(String args[]) throws Throwable{
		
		DocxToPdf.Doc_To_PDF();
		
		ReadPDF.read_pdf(System.getProperty("user.dir")+"\\data\\source_files\\source.pdf" , System.getProperty("user.dir")+"\\data\\source_files\\source.txt" );
		ReadPDF.read_pdf(System.getProperty("user.dir")+"\\data\\destination_files\\Destination.pdf" , System.getProperty("user.dir")+"\\data\\destination_files\\destination.txt" );
		trail.verify(System.getProperty("user.dir")+"\\data\\source_files\\source.txt", System.getProperty("user.dir")+"\\data\\destination_files\\destination.txt");
	
	System.out.println("hi1234");
	}
}
