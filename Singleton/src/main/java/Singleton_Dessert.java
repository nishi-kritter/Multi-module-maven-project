public class Singleton_Dessert {
    // static variable single_instance of type Singleton
    private static Singleton_Dessert single_instance = null;

    // variable of type String
    public String dessert_flavour;

    // private constructor restricted to this class itself
    private  Singleton_Dessert()
    {
        dessert_flavour = "Chocolate";
    }

    // static method to create instance of Singleton class
    public static Singleton_Dessert getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton_Dessert();

        return single_instance;
    }


}

class Singletonshop{
    public void operations()
    {
        // instantiating Dessert class with variable cupcake
        Singleton_Dessert cupcake = Singleton_Dessert.getInstance();

        // instantiating Dessert class with variable cake
        Singleton_Dessert cake = Singleton_Dessert.getInstance();

        // instantiating Dessert class with variable icecream
        Singleton_Dessert icecream = Singleton_Dessert.getInstance();

        // changing variable of instance cupcake
        cupcake.dessert_flavour = (cupcake.dessert_flavour).toUpperCase();

        System.out.println("Flavour of cupcake is " + cupcake.dessert_flavour);
        System.out.println("Flavour of cake is " + cake.dessert_flavour);
        System.out.println("Flavour of icecream is " + icecream.dessert_flavour);
        System.out.println("\n");

        // changing variable of instance icecream
        icecream.dessert_flavour = (icecream.dessert_flavour).toLowerCase();

        System.out.println("Flavour of cupcake is " + cupcake.dessert_flavour);
        System.out.println("Flavour of cake is " + cake.dessert_flavour);
        System.out.println("Flavour of icecream is " + icecream.dessert_flavour);
    }
}
