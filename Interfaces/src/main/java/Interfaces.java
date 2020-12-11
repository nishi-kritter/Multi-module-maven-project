
interface Dessert{
    boolean IsSugarFree();
};

class Pastry implements Dessert{

    @Override
    public boolean IsSugarFree() {
        return true;
    }


}
class Icecream implements Dessert{

    @Override
    public boolean IsSugarFree() {
        return false;
    }

}

public class Interfaces{
    public void operations()
    {
        Pastry p = new Pastry();
        if(p.IsSugarFree() == true )
            System.out.println("Pastry is Sugar Free");
        else
            System.out.println("Pastry is not Sugar Free");
        Icecream i = new Icecream();
        if(i.IsSugarFree() == true )
            System.out.println("Icecream is Sugar Free");
        else
            System.out.println("Icecream is not Sugar Free");

    }
}

