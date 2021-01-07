public class Static {
        int price;
        static int quantity;
        static String dessert_name;


        static void set(int q, String n)
        {
            quantity = q;
            dessert_name = n;
        }


        static void display(){
            System.out.println("Name : "+ dessert_name + " Quantity : "+quantity);
        }
}
