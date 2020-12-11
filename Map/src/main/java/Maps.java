import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
//loop
public class Maps {
    public void operations()
    {
        Map m = new HashMap();

        Scanner scan = new Scanner(System.in);
        String key="",value="";
        int position=0;
        int choice = 0;
        do {
            System.out.println("-----------------------------------");
            System.out.println("1. Put one element");
            System.out.println("2. Get one element");
            System.out.println("3. Remove one element");
            System.out.println("4. Contains Key");
            System.out.println("5. Contains Value");
            System.out.println("6. Replace");
            System.out.println("7. Size");
            System.out.println("8. Display");
            System.out.println("9. EXIT");
            System.out.println("-----------------------------------");
            System.out.println("Enter Choice : ");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    // Put one element
                    System.out.println("Enter Key:");
                    scan.nextLine();
                    key = scan.nextLine();
                    System.out.println("Enter Value:");
                    value = scan.nextLine();
                    m.put(key,value);
                    break;
                case 2:
                    //Get one element
                    System.out.println("Enter Key:");
                    scan.nextLine();
                    key = scan.nextLine();
                    System.out.println(m.get(key));
                    break;
                case 3:
                    //Remove one element
                    System.out.println("Enter Key:");
                    scan.nextLine();
                    key = scan.nextLine();
                    m.remove(key);
                    break;
                case 4:
                    //Contains Key
                    System.out.println("Enter Key:");
                    scan.nextLine();
                    key = scan.nextLine();
                    System.out.println(m.containsKey(key));
                    break;
                case 5:
                    //Contains Value
                    System.out.println("Enter Value:");
                    scan.nextLine();
                    value = scan.nextLine();
                    System.out.println(m.containsValue(value));
                    break;
                case 6:
                    //Replace value
                    System.out.println("Enter Key:");
                    key = scan.nextLine();
                    key = scan.nextLine();
                    System.out.println("Enter Value:");
                    value = scan.nextLine();
                    m.replace(key,value);
                    break;
                case 7:
                    //Size of map
                    System.out.println("Size of Map : "+m.size());
                    break;
                case 8:
                    //Display
                    Iterator i = m.entrySet().iterator();
                    System.out.println("Map : --> Using Iterator\n");
                    while(i.hasNext())
                    {
                        Map.Entry mapElement = (Map.Entry) i.next();
                        System.out.println("\n"+mapElement.getKey() +" => "+mapElement.getValue());
                    }
                    System.out.println("Map : --> Using forEach\n");
                    m.forEach((k,v)->System.out.println(k+" -> "+v));
                    break;
            }
        }while (choice != 9);


    }
}
