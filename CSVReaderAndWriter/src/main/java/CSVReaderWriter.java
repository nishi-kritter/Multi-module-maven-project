import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVReaderWriter {
    public void operations()
    {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("--------------------------------------");
            System.out.println("1. Write in the CSV File ");
            System.out.println("2. Read from the CSV File ");
            System.out.println("3. EXIT ");
            System.out.println("--------------------------------------");
            System.out.println("Enter Choice :");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    write_in_csv();
                    break;
                case 2:
                    read_from_csv();
                    break;
            }
        }while (choice != 3);
    }

    public void write_in_csv()
    {
        File file = new File("file.csv");
        try {

            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            String[] header = { "Name", "Flavour", "Price" };
            writer.writeNext(header);
            String[] data1 = { "Choco Chips Cake", "Chocolate", "550" };
            writer.writeNext(data1);
            String[] data2 = { "Chocolate Fudge", "Chocolate", "300" };
            writer.writeNext(data2);
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void read_from_csv()
    {
        try {
            FileReader filereader = new FileReader("file.csv");
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
