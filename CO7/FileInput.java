// Using FileInputStream class to read the contents of a file

package CO7;

import java.io.FileInputStream;

public class FileInput {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("test.txt");
            int i = 0;
            while((i = fin.read())!= -1){
                System.out.print((char)i);
            }
            fin.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
