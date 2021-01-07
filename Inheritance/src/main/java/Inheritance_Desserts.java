// base class
public class Inheritance_Desserts
{
    // the Dessert class has two fields
    String flavor;
    float price;

    // the Dessert class has one constructor
    Inheritance_Desserts(String flavor, float price)
    {
        this.flavor = flavor;
        this.price = price;
    }

    // the Dessert class has three methods
    public void base_price()
    {
        System.out.println("Basic Price without GST Flavor : "+ flavor + " Price :"+price);
    }

    public void final_price(int gst)
    {
        float gst_amt = (price * gst)/100;
        price += gst_amt;
        System.out.println("Final Price with GST Flavor : "+ flavor + " Price :"+price);
    }


}

// derived class
class Inheritance_Cupcake extends Inheritance_Desserts
{

    // the Cupcake subclass adds one more field
    public char size;

    // the Cupcake subclass has one constructor
    public Inheritance_Cupcake(String flavor,float price,
                   char size)
    {
        // invoking base-class(Dessert) constructor
        super(flavor, price);
        this.size = size;
    }


    public void base_price() {
        super.base_price();
    }

    public void final_price(int gst) {
        super.final_price(gst);
    }
}

