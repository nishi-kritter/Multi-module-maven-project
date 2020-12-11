import java.util.*;

//loop
public class Sets {

    public void set_operations()
    {

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        String item;
        Set<String> Dessert_Set1 = new HashSet<String>();
        Dessert_Set1.addAll(Arrays.asList(new String[] {"Icecream","Cupcake","Cake"}));
        Set<String> Dessert_Set2 = new HashSet<String>();
        Dessert_Set2.addAll(Arrays.asList(new String[] {"Waffle","Fudge","Cake"}));

        do {
            System.out.println("-----------------------------------");
            System.out.println("1. Add one element in set 1");
            System.out.println("2. Remove one element from set 1");
            System.out.println("3. Remove all element from set 1");
            System.out.println("4. Add one element in set 2");
            System.out.println("5. Remove one element from set 2");
            System.out.println("6. Remove all element from set 2");
            System.out.println("7. Union");
            System.out.println("8. Intersection");
            System.out.println("9. Difference");
            System.out.println("10. Contains Element in set1");
            System.out.println("11. Contains Element in set2");
            System.out.println("12. Size of set1 and set1");
            System.out.println("13. Display set1 and set2");
            System.out.println("14. EXIT");
            System.out.println("-----------------------------------");
            System.out.println("Enter Choice : ");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    // Add one element in set1
                    System.out.println("Enter an item:");
                    item = scan.nextLine();
                    item = scan.nextLine();
                    Dessert_Set1.add(item);
                    break;
                case 2:
                    // Remove one element from set1
                    System.out.println("Enter an item:");
                    item = scan.nextLine();
                    item = scan.nextLine();
                    Dessert_Set1.remove(item);
                    break;
                case 3:
                    // Remove All elements from set1
                    Dessert_Set1.removeAll(Dessert_Set1);
                    break;
                case 4:
                    // Add one element in set2
                    System.out.println("Enter an item:");
                    item = scan.nextLine();
                    item = scan.nextLine();
                    Dessert_Set2.add(item);
                    break;
                case 5:
                    // Remove one element from set2
                    System.out.println("Enter an item:");
                    item = scan.nextLine();
                    item = scan.nextLine();
                    Dessert_Set2.remove(item);
                    break;
                case 6:
                    // Remove All elements from set2
                    Dessert_Set2.removeAll(Dessert_Set1);
                    break;
                case 7:
                    // To find union
                    Set<String> union = new HashSet<String>(Dessert_Set1);
                    union.addAll(Dessert_Set2);
                    System.out.print("Union of the two Set");
                    System.out.println(union);
                    break;
                case 8:
                    // To find intersection
                    Set<String> intersection = new HashSet<String>(Dessert_Set1);
                    intersection.retainAll(Dessert_Set2);
                    System.out.print("Intersection of the two Set");
                    System.out.println(intersection);
                    break;
                case 9:
                    // To find the symmetric difference
                    Set<String> difference = new HashSet<String>(Dessert_Set1);
                    difference.removeAll(Dessert_Set2);
                    System.out.print("Difference of the two Set");
                    System.out.println(difference);
                    break;
                case 10:
                    // Contains in set1
                    System.out.println("Enter an item:");
                    item = scan.nextLine();
                    item = scan.nextLine();
                    System.out.println(Dessert_Set1.contains(item));
                    break;
                case 11:
                    // Contains in set2
                    System.out.println("Enter an item:");
                    item = scan.nextLine();
                    item = scan.nextLine();
                    System.out.println(Dessert_Set2.contains(item));
                    break;
                case 12:
                    System.out.println("Size of set1 :"+Dessert_Set1.size()+" Size of set2 :"+Dessert_Set2.size());
                    break;
                case 13:
                    Iterator i = Dessert_Set1.iterator();
                    System.out.println("Set 1 : --> using Iterator\n");
                    while( i.hasNext() )
                    {
                        System.out.println(i.next());
                    }
                    i = Dessert_Set2.iterator();
                    System.out.println("\nSet 2 : --> using Iterator\n");
                    while ( i.hasNext() )
                    {
                        System.out.println(i.next());
                    }
                    System.out.println("\nSet 1 : --> using forEach\n");
                    Dessert_Set1.forEach((v)->System.out.println(v));
                    System.out.println("Set 2 : --> using forEach");
                    Dessert_Set2.forEach((v)->System.out.println(v));
                    break;
            }
        }while (choice != 14);

    }
}
