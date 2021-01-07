import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraysAndArrayList {

    public void array()
    {
        int arr[]={33,3,4,5};
        //printing array using for-each loop
        for(int i:arr)
            System.out.println(i);
    }
    public void arrayList()
    {
        Scanner scan = new Scanner(System.in);
        int startIndex,endIndex,index;
        String element;
        ArrayList<String> list = new ArrayList<String>();
        int choice = 0;
        do {
            System.out.println("--------------------------------");
            System.out.println("1. Add one element");
            System.out.println("2. Remove one element");
            System.out.println("3. Remove all elements");
            System.out.println("4. Sort");
            System.out.println("5. Size of ArrayList");
            System.out.println("6. Display");
            System.out.println("7. EXIT");
            System.out.println("--------------------------------");
            System.out.println("Enter Choice : ");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter an element :");
                    scan.nextLine();
                    element = scan.nextLine();
                    list.add(element);
                    break;
                case 2:
                    System.out.println("Enter an element position:");
                    index = scan.nextInt();
                    list.remove(index);
                    break;
                case 3:
                    list.clear();
                    break;
                case 4:
                    Collections.sort(list);
                    break;
                case 5:
                    System.out.println("Size of an ArrayList : "+list.size());
                    break;
                case 6:
                    for(String str:list)
                        System.out.println(str);
                    break;
            }
        }while(choice != 7);
    }

    public void operations()
    {
        Scanner scan = new Scanner(System.in);
        int choice=0;
        do{
            System.out.println("***********************************");
            System.out.println("1. Arrays");
            System.out.println("2. ArrayList");
            System.out.println("3. EXIT");
            System.out.println("***********************************");
            System.out.println("Enter choice : ");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    array();
                    break;
                case 2:
                    arrayList();
                    break;
            }
        }while (choice != 3);

    }
}
