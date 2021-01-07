import java.sql.*;
import java.util.Scanner;

public class Database {

    Scanner scan = new Scanner(System.in);

    public Connection connection()
    {
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/CAKESHOP", "root", "thinkit");
            con.setAutoCommit(false);
            return con;
        }catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    public void add()
    {
        int dessert_quantity=0,dessert_category_id=0,dessert_flavour_id=0;
        String dessert_name="";
        float dessert_price=0;
        System.out.println("Enter Dessert Name : ");
        scan.nextLine();
        dessert_name = scan.nextLine();
        System.out.println("Enter Dessert Price : ");
        dessert_price = scan.nextFloat();
        System.out.println("Enter Dessert Quantity : ");
        dessert_quantity = scan.nextInt();
        System.out.println("Enter Dessert Category Id : ");
        dessert_category_id = scan.nextInt();
        System.out.println("Enter Dessert Flavour Id : ");
        dessert_flavour_id = scan.nextInt();

        Connection con=null;
        try {
            con = connection();
            String sql = "insert into DESSERT(dessert_name,dessert_price,dessert_quantity,dessert_category_id,dessert_flavour_id) values(?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dessert_name);
            stmt.setFloat(2, dessert_price);
            stmt.setInt(3,dessert_quantity);
            stmt.setInt(4,dessert_category_id);
            stmt.setInt(5,dessert_flavour_id);

            int i = stmt.executeUpdate();
            System.out.println("Dessert is Added Successfully..!");
            con.commit();
            view();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }
    public void modify()
    {
        int dessert_id=0,dessert_quantity=0;
        String dessert_name="";
        float dessert_price=0;
        System.out.println("Enter Dessert Id : ");
        dessert_id = scan.nextInt();
        System.out.println("Enter Dessert Name : ");
        scan.nextLine();
        dessert_name = scan.nextLine();
        System.out.println("Enter Dessert Price : ");
        dessert_price = scan.nextFloat();
        System.out.println("Enter Dessert Quantity : ");
        dessert_quantity= scan.nextInt();
        Connection con=null;
        try {
            con = connection();
            String sql = "update DESSERT set dessert_name=?, dessert_price=?, dessert_quantity=? where dessert_id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dessert_name);
            stmt.setFloat(2,dessert_price);
            stmt.setInt(3,dessert_quantity);
            stmt.setInt(4, dessert_id);

            int i = stmt.executeUpdate();
            System.out.println("Dessert is Modified Successfully..!");
            con.commit();
            view();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    public void remove()
    {
        int dessert_id=0;
        System.out.println("Enter Dessert Id : ");
        dessert_id = scan.nextInt();
        Connection con=null;
        try {
            con= connection();
            String sql = "delete from DESSERT where dessert_id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, dessert_id);

            int i = stmt.executeUpdate();
            System.out.println("Dessert is Removed Successfully..!");
            con.commit();
            view();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
    public void view()
    {
        String sql;
        Connection con=null;
        try{
            con = connection();
            sql = "SELECT d.dessert_id,d.dessert_name,d.dessert_price,d.dessert_quantity,c.dessert_category_name," +
                    "f.dessert_flavour_name FROM DESSERT d, DESSERT_CATEGORY c, DESSERT_FLAVOUR f " +
                    "WHERE d.dessert_category_id=c.dessert_category_id AND " +
                    "d.dessert_flavour_id=f.dessert_flavour_id";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3)+"  "+rs.getInt(4)+"  "+rs.getString(5)+"  "+rs.getString(6));
        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public void menu()
    {
        int choice=0;

        do {
            System.out.println("********************************************");
            System.out.println("1. Add Dessert Details");
            System.out.println("2. Modify Dessert Details");
            System.out.println("3. Remove Dessert Details");
            System.out.println("4. View Dessert Details");
            System.out.println("5. EXIT");
            System.out.println("********************************************");
            System.out.println("Enter Choice : ");
            choice = scan.nextInt();
            switch (choice)
            {
                case 1:
                    add();
                    break;
                case 2:
                    modify();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    view();
                    break;
            }
        }while (choice != 5);
    }
}
