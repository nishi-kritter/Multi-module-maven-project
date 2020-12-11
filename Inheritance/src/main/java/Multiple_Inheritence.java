//multiple inheritance
interface Dessert{
    boolean IsSugarFree();
}
interface Cake{
    String getShape();
}
class Pastry implements Dessert,Cake{

    @Override
    public boolean IsSugarFree() {
        return true;
    }

    @Override
    public String getShape() {
        return "Square";
    }
}

public class Multiple_Inheritence {

    public void operations()
    {
        Pastry p = new Pastry();
        if(p.IsSugarFree() == true )
            System.out.println("Pastry is Sugar Free");
        else
            System.out.println("Pastry is not Sugar Free");
        System.out.println("Pastry is of "+p.getShape()+" shape");
    }
}
