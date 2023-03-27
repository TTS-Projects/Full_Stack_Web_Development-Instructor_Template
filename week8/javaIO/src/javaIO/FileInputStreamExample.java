package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

   public static void main(String args[]) throws IOException{  
      FileInputStream in = null;
      FileOutputStream out = null;
      File f = new File("C:\\Users\\Mike\\Documents\\TTS\\TTS-Febraury6\\week8\\javaIO\\src\\input.txt");
     
      try {
         in = new FileInputStream(f);
         out = new FileOutputStream("C:\\Users\\Mike\\Documents\\TTS\\TTS-Febraury6\\week8\\javaIO\\src\\output.txt");
         
         System.out.println(in.available());
         int c;
         while ((c = in.read()) != -1) {
        	
            out.write(c);
         }
         
      } catch (IOException e) {
		// TODO Auto-generated catch block
    	  
		e.printStackTrace();
		
	}finally {
		 if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
      }
   }
}
