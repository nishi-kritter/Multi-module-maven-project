public class Test {
    public static void main(String[] args) {
        Singleton_Dessert singleton_dessert = Singleton_Dessert.getInstance();
        System.out.println(singleton_dessert);
        System.out.println(singleton_dessert.dessert_flavour);

        Singleton_Dessert singleton_dessert2 = Singleton_Dessert.getInstance();
        System.out.println(singleton_dessert2);
        System.out.println(singleton_dessert2.dessert_flavour);

        singleton_dessert = null;
        System.out.println(singleton_dessert);
        //System.out.println(singleton_dessert.dessert_flavour);

        System.out.println(singleton_dessert2);
        System.out.println(singleton_dessert2.dessert_flavour);


    }

}
