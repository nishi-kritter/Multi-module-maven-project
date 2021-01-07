import java.io.*;
public class BufferedReaderAndWriter {
    public void display()
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter your Dessert Name");
        try {
            String name=br.readLine();
            System.out.println(name + "is very yummy..!");
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
