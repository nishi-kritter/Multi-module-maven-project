import java.util.*;

public class LinkedLists {
    public void operations()
    {
        LinkedList<String> deserts_ll
                = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        String item="";
        int position=0;
        int choice = 0;
        List l = new ArrayList();
        l.add(5);
        l.add(2);
        l.add(1);
        System.out.println(l);

        do {
            System.out.println("-----------------------------------");
            System.out.println("1. Add one element at First");
            System.out.println("2. Add one element by position");
            System.out.println("3. Add one element at Last");
            System.out.println("4. Remove one element from Linked List");
            System.out.println("5. Remove all element from Linked List");
            System.out.println("6. Get Element by position");
            System.out.println("7. Get First Element");
            System.out.println("8. Get Last Element");
            System.out.println("9. Peek");
            System.out.println("10. Peek First");
            System.out.println("11. Peek Last");
            System.out.println("12. Poll");
            System.out.println("13. Poll First");
            System.out.println("14. Poll Last");
            System.out.println("15. Display");
            System.out.println("16. EXIT");
            System.out.println("-----------------------------------");
            System.out.println("Enter Choice : ");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    // Add one element at first
                    System.out.println("Enter an item:");
                    scan.nextLine();
                    item = scan.nextLine();
                    deserts_ll.addFirst(item);
                    break;
                case 2:
                    //Add one element by position
                    System.out.println("Enter an item:");
                    scan.nextLine();
                    item = scan.nextLine();
                    System.out.println("Enter an item:");
                    position = scan.nextInt();
                    deserts_ll.add(position,item);
                    break;
                case 3:
                    //Add one element at last
                    System.out.println("Enter an item:");
                    item = scan.nextLine();
                    item = scan.nextLine();
                    deserts_ll.addLast(item);
                    break;
                case 4:
                    // Remove one element linked list
                    System.out.println("Enter an item:");
                    item = scan.nextLine();
                    item = scan.nextLine();
                    deserts_ll.remove(item);
                    break;
                case 5:
                    // Remove all elements from linked list
                    deserts_ll.removeAll(deserts_ll);
                    break;
                case 6:
                    System.out.println("Enter an position:");
                    position = scan.nextInt();
                    System.out.println(deserts_ll.get(position));
                    break;
                case 7:
                    System.out.println(deserts_ll.getFirst());
                    break;
                case 8:
                    System.out.println(deserts_ll.getLast());
                    break;
                case 9:
                    System.out.println(deserts_ll.peek());
                    break;
                case 10:
                    System.out.println(deserts_ll.peekFirst());
                    break;
                case 11:
                    System.out.println(deserts_ll.peekLast());
                    break;
                case 12:
                    System.out.println(deserts_ll.poll());
                    break;
                case 13:
                    System.out.println(deserts_ll.pollFirst());
                    break;
                case 14:
                    System.out.println(deserts_ll.pollLast());
                    break;
                case 15:
                    Iterator i = deserts_ll.iterator();
                    System.out.println("Linked List : -> using Iterator");
                    while (i.hasNext())
                    {
                        System.out.println("\n"+i.next());
                    }
                    System.out.println("Linked List : -> using forEach method");
                    deserts_ll.forEach((v)-> System.out.println(v));
                    break;

            }
        }while (choice != 16);


    }
}
