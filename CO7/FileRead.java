// Using FileReader class to read the contents of a file

package CO7;

import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("test.txt");
            int i = 0;
            while((i = fr.read())!= -1){
                System.out.print((char)i);
            }
            fr.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
