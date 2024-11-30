/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
*/
import java.io.*;

// Driver Class
class GFG {
    // main function
    public static void main(String[] args)
    {
        try {
            // FileReader Class used
            FileReader fileReader
                    = new FileReader("mensagens.tsv");

            System.out.println("Reading char by char : \n");
            int i;

            // Using read method
            while ((i = fileReader.read()) != -1) {
                System.out.print((char)i);
            }

            System.out.println("Reading using array : \n");
            char[] charArray = new char[10000];

            // Using read method for to get character array
            fileReader.read(charArray);
            System.out.print(charArray);

            // Close method called
            fileReader.close();
            System.out.println("FileReader closed!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}