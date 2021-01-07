public class ExceptionHandling {

    /**
     * Exception handling
     *
     */
    public void exception_handling()
    {

        try{
            int a[]=new int[5];
            a[5]=30/0;
            throw new CustomException();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch (CustomException e){
            System.out.println("Custom Exception Handled..!");
        }

    }



}
