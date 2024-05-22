// Using FileWriter class to read the contents of a file

package CO7;

import java.io.FileWriter;

public class FileWrite {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("test.txt");
            fw.write("This is a test");
            fw.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
