package gift;

import java.io.IOException;

public class start_up {

	public static void main(String args[]) throws Throwable{
		
		//DocxToPdf.Doc_To_PDF();
		
		//ReadPDF.read_pdf(System.getProperty("user.dir")+"\\data\\source.pdf" , System.getProperty("user.dir")+"\\data\\source.txt" );
		//ReadPDF.read_pdf(System.getProperty("user.dir")+"\\data\\Destination.pdf" , System.getProperty("user.dir")+"\\data\\destination.txt" );
		verify_string.verify(System.getProperty("user.dir")+"\\data\\source.txt", System.getProperty("user.dir")+"\\data\\destination.txt");
	//verify.vf(System.getProperty("user.dir")+"\\data\\source.txt", System.getProperty("user.dir")+"\\data\\destination.txt");
	
	}
}
