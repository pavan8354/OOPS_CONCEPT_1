package pdfreader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;



public class pdfreader {
	
	
	@Test
	
	public void pdfreaderwords() throws IOException {
		
		FileInputStream filelink = new FileInputStream("D:\\PAVAN G_updatedcoverletter.pdf");
		BufferedInputStream fileparse = new BufferedInputStream(filelink);	
		PDDocument document = null;
		
		document = PDDocument.load(fileparse);	
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		
		
	}

}
