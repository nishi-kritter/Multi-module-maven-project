
import java.io.FileReader;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class JsonObjectMapping {

    public void readJSONFile()
    {
        try {

        ObjectMapper mapper = new ObjectMapper();
            Map<?, ?> map = mapper.readValue(Paths.get("employees.json").toFile(), Map.class);

            for (Map.Entry<?, ?> employee : map.entrySet()) {
              System.out.println(employee.getKey() + " - " + employee.getValue());
            }

    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }
    public void writeJSONFile()
    {
        try {

            Map<String, Object> map1 = new HashMap<>();
            map1.put("name", "Nishi");
            map1.put("state", "Gujarat");

            Map<String, Object> map2 = new HashMap<>();
            map2.put("name", "Alisha");
            map2.put("state", "Orissa");

            Map<String, Object> map3 = new HashMap<>();
            map3.put("employee1",map1);
            map3.put("employee2",map2);

            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(Paths.get("employees.json").toFile(), map3);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    public void operations()
    {
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("-----------------------------");
            System.out.println("1. Read from json file");
            System.out.println("2. Write into json file");
            System.out.println("3. EXIT");
            System.out.println("-----------------------------");
            System.out.println("Enter choice : ");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    readJSONFile();
                    break;
                case 2:
                    writeJSONFile();
                    break;
            }
        }while (choice != 3);
    }
}
