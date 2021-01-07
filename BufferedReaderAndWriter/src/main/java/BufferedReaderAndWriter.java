import java.io.*;
public class BufferedReaderAndWriter {
    public void reader() {
        BufferedReader br=null;
        try {

            br = new BufferedReader(new FileReader("file.txt"));
            String data=br.readLine();
            System.out.println(data);
            while (data != null) {
                System.out.println(data);
                data = br.readLine();
            }
        }
        catch(IOException e) {
            System.out.println(e);
        } finally {
            if ( br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    public void writer() throws IOException {
        BufferedWriter bufferedWriter=null;
        try {

            bufferedWriter = new BufferedWriter(new FileWriter("file.txt", true));
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if( bufferedWriter != null){
                bufferedWriter.close();
            }
        }
    }
}
