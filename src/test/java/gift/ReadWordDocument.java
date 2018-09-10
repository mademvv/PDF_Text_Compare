package gift;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class ReadWordDocument {

	public static void readDocFile(String fileName) {

		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());

			HWPFDocument doc = new HWPFDocument(fis);

			WordExtractor we = new WordExtractor(doc);

			String[] paragraphs = we.getParagraphText();
			
			System.out.println("Total no of paragraph "+paragraphs.length);
			String x="";
			for (String para : paragraphs) {
				System.out.println(para.toString());
				x+="\n"+para.toString();
			}
			fis.close();
			FileUtils.writeStringToFile(new File("D:\\janardhan\\workspace\\gift\\data\\source.txt"), x);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void readDocxFile(String fileName) {
		WordExtractor extractor = null;
		try {
			File file = new File(fileName);
			FileInputStream fis = new FileInputStream(file.getAbsolutePath());
	            
			XWPFDocument document = new XWPFDocument(fis);

			List<XWPFParagraph> paragraphs = document.getParagraphs();
			
			System.out.println("Total no of paragraph "+paragraphs.size());
			String x="";
			for (XWPFParagraph para : paragraphs) {
				System.out.println(para.getText());
				x+="\n"+para.getText();
			}
			fis.close();
			FileUtils.writeStringToFile(new File("D:\\janardhan\\workspace\\gift\\data\\source.txt"), x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		readDocxFile("D:\\janardhan\\workspace\\gift\\data\\jana.docx");

		//readDocFile(System.getProperty("user.dir")+"\\data\\jana.doc");
		
		

	}
}