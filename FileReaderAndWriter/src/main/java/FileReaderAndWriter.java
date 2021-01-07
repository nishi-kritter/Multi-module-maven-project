import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//csvreader and csvreaderbuilder

public class FileReaderAndWriter {

    public void write()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Message : ");
        String message = scan.nextLine();

        FileWriter fw=null;
        try{
            fw = new FileWriter("file.txt");
            for (int i = 0; i < message.length(); i++)
                fw.write(message.charAt(i));
            System.out.println("Writing successful");

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void read() throws IOException
    {
        int ch;
        FileReader fr=null;
        try
        {
            fr = new FileReader("file.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        finally {
            if( fr != null){
                fr.close();
            }
        }
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
    }
}



