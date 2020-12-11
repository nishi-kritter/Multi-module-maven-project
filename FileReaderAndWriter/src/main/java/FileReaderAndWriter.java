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

        // attach a file to FileWriter
        try{
            FileWriter fw=new FileWriter("file.txt");
            // read character wise from string and write into FileWriter
            for (int i = 0; i < message.length(); i++)
                fw.write(message.charAt(i));
            System.out.println("Writing successful");
            //close the file
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }

    public void read() throws IOException
    {
        // variable declaration
        int ch;

        // check if File exists or not
        FileReader fr=null;
        try
        {
            fr = new FileReader("file.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }

        // read from FileReader till the end of file
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);

        // close the file
        fr.close();
    }

}



