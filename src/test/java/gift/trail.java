package gift;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import fr.opensagres.xdocreport.document.debug.SysOutDebugger;

public class trail {
	public static String sourcestring="";
	public static String destinationstring="";
	//public static void main(String args[]) throws Throwable, IOException{
		public static void verify(String source,String destination) throws Throwable, IOException{
		try(BufferedReader br = new BufferedReader(new FileReader(source))) {
		    for(String sourceline; (sourceline = br.readLine()) != null; ) {
		        // process the line.
		    	//sourcestring+="\n"+line;
		    	sourcestring=sourceline.replaceAll("\\s+"," ");
		    	boolean status=false;
		    	try(BufferedReader br1 = new BufferedReader(new FileReader(destination))) {
				    for(String destinationline; (destinationline = br1.readLine()) != null; ) {
				        // process the line.
				    	//destinationstring+="\n"+line;
				    	destinationstring=destinationline.replaceAll("\\s+"," ");
				    	
				    	if(destinationstring.contains(sourcestring)){
				    		//System.out.println("Pass");
				    		System.out.println("Pass---string  is"+sourcestring);
				    		status=true;
				    		break;
				    	}
				    }
				    // line is not visible here.
				    if(status==false){
				    	//System.out.println("Not presented");
				    	//System.out.println("string  is"+sourcestring);
				    	System.out.println("Failed---Source string  is"+sourcestring);
				    	break;
				    }
				}
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    }
		    // line is not visible here.
		}
		
		
	}
}
