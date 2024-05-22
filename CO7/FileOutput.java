// Using FileOutputStream to write contents of a file

package CO7;

import java.io.FileOutputStream;

public class FileOutput {
   public static void main(String[] args) {
    try {
        FileOutputStream fout = new FileOutputStream("test.txt");
        String s = "This is test";
        byte[] b = s.getBytes();
        fout.write(b);
        fout.close();
    }
    catch(Exception e) {
        System.out.println(e);
    }
   } 
}
