 public abstract class Shape{
    public int l;
    public double a;
    abstract void area();
}
class Circle extends Shape{
    final double PI = 3.14;
    void area(){
        a = PI * (l * l);
        System.out.println("Area of Circle is "+a);
    }
}
class Square extends Shape {
    void area(){
        a = l * l;
        System.out.println("Area of Square is "+a);
    }
}
