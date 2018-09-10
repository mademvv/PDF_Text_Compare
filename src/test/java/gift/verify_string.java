package gift;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.lang.StringUtils;

public class verify_string {
	public static String sourcestring="";
	public static String destinationstring="";
	//public static void main(String args[]) throws Throwable, IOException{
		public static void verify(String source,String destination) throws Throwable, IOException{
		
		
		//try(BufferedReader br = new BufferedReader(new FileReader("D:\\janardhan\\workspace\\gift\\data\\source.txt"))) {
			try(BufferedReader br = new BufferedReader(new FileReader(source))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        // process the line.
		    	sourcestring+="\n"+line;
		    }
		    // line is not visible here.
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(destination))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        // process the line.
		    	destinationstring+="\n"+line;
		    }
		    // line is not visible here.
		}
		
		System.out.println("destinationstring77777777777"+destinationstring);
		System.out.println("sourcestring77777777777"+sourcestring);
		if(destinationstring.contains(sourcestring)==true){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		
		if(destinationstring.equals(sourcestring)){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}
		
		String xyz=StringUtils.difference(destinationstring, sourcestring);
		System.out.println(xyz);
	}
}
