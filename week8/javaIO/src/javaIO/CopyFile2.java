package javaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile2 {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("C:\\Users\\Mike\\Documents\\TTS\\TTS-Febraury6\\week8\\javaIO\\src\\input.txt");
         out = new FileWriter("C:\\Users\\Mike\\Documents\\TTS\\TTS-Febraury6\\week8\\javaIO\\src\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
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
