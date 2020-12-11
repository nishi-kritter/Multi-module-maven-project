import java.io.IOException;
import java.util.Scanner;
import java.sql.*;



public class Menu {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("*******************************************************");
            System.out.println("1. Singleton Class");
            System.out.println("2. Inheritance");
            System.out.println("3. Enum");
            System.out.println("4. Set");
            System.out.println("5. Linked List");
            System.out.println("6. Abstract Class");
            System.out.println("7. Static Method and Variables");
            System.out.println("8. Exception Handling");
            System.out.println("9. Buffered Reader and Writer");
            System.out.println("10. File Reader and Writer");
            System.out.println("11. JDBC");
            System.out.println("12. Map");
            System.out.println("13. Interface");
            System.out.println("14. CSV Reader and Writer");
            System.out.println("15. EXIT");
            System.out.println("*******************************************************");
            System.out.println("Enter Choice :");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    Singletonshop singletonshop = new  Singletonshop();
                    singletonshop.operations();
                    break;
                case 2:

                    int inheritance_choice = 0;
                    do{
                        System.out.println("-----------------------");
                        System.out.println("1. Single Inheritance ");
                        System.out.println("2. Multiple Inheritance ");
                        System.out.println("3. EXIT ");
                        System.out.println("-----------------------");
                        System.out.println("Enter choice : ");
                        inheritance_choice = scan.nextInt();
                        switch (inheritance_choice)
                        {
                            case 1:
                                Inheritance_Cupcake c = new Inheritance_Cupcake("Chocolate", 100, 'S');
                                c.base_price();
                                c.final_price(5);
                                break;
                            case 2:
                                Multiple_Inheritence multiple_inheritence = new Multiple_Inheritence();
                                multiple_inheritence.operations();
                                break;
                        }
                    }while (inheritance_choice != 3);
                    break;
                case 3:
                    Shop shop = new Shop();
                    shop.operations();
                    break;
                case 4:
                    Sets sets = new Sets();
                    sets.set_operations();
                    break;
                case 5:
                    LinkedLists desserts_ll = new LinkedLists();
                    desserts_ll.operations();
                    break;
                case 6:
                    Circle circle = new Circle();
                    circle.area();
                    Square square = new Square();
                    square.area();
                    break;
                case 7:
                    Static st = new Static();
                    st.set(10,"Cake");
                    st.display();
                    break;
                case 8:
                    ExceptionHandling e = new ExceptionHandling();
                    e.exception_handling();
                    break;
                case 9:
                    BufferedReaderAndWriter brw = new BufferedReaderAndWriter();
                    brw.display();
                    break;
                case 10:
                    FileReaderAndWriter frw = new FileReaderAndWriter();
                    frw.write();
                    frw.read();
                    break;
                case 11:
                    Database d = new Database();
                    d.menu();
                    break;
                case 12:
                    Maps m = new Maps();
                    m.operations();
                    break;
                case 13:
                    Interfaces interfaces = new  Interfaces();
                    interfaces.operations();
                    break;
                case 14:
                    CSVReaderWriter csv = new  CSVReaderWriter();
                    csv.operations();
                    break;
            }
        }while(choice != 15);
    }
}
