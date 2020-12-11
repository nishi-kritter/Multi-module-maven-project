import java.sql.*;
import java.util.Scanner;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class Database {

    Scanner scan = new Scanner(System.in);

    public Connection connection()
    {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/EMPLOYEE_DB", "root", "thinkit");
            return con;
        }catch(Exception e)
        {
            System.out.println(e);
            return null;
        }

    }
    public void add()
    {
        int employee_id=0,department_id=0;
        String employee_name="";
        float salary=0;
        System.out.println("Enter Employee Id : ");
        employee_id = scan.nextInt();
        System.out.println("Enter Employee Name : ");
        employee_name = scan.nextLine();
        employee_name = scan.nextLine();
        System.out.println("Enter Employee Salary : ");
        salary = scan.nextFloat();
        System.out.println("Enter Department Id : ");
        department_id = scan.nextInt();
        try {
            Connection con = connection();
            String sql = "insert into EMPLOYEE(employee_id,employee_name,salary,department_id) values(?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, employee_id);
            stmt.setString(2, employee_name);
            stmt.setFloat(3,salary);
            stmt.setInt(4,department_id);

            int i = stmt.executeUpdate();
            System.out.println("Employee Details Added Successfully..!");
            //Logger logger = LoggerFactory.getLogger(Database.class);
            //logger.info("Employee Details Added Successfully..!");

            con.close();
            view();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
    public void modify()
    {
        int employee_id=0,department_id=0;
        String employee_name="";
        float salary=0;
        System.out.println("Enter Employee Id : ");
        employee_id = scan.nextInt();
        System.out.println("Enter Employee Name : ");
        employee_name = scan.nextLine();
        employee_name = scan.nextLine();
        System.out.println("Enter Employee Salary : ");
        salary = scan.nextFloat();
        System.out.println("Enter Department Id : ");
        department_id = scan.nextInt();
        try {
            Connection con = connection();
            String sql = "update EMPLOYEE set employee_name=?, salary=?, department_id=? where employee_id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, employee_name);
            stmt.setFloat(2,salary);
            stmt.setInt(3,department_id);
            stmt.setInt(4, employee_id);

            int i = stmt.executeUpdate();
            System.out.println("Employee Details Modified Successfully..!");
            //Logger logger = LoggerFactory.getLogger(Database.class);
            //logger.info("Employee Details Modified Successfully..!");
            con.close();
            view();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void remove()
    {
        int employee_id=0;
        System.out.println("Enter Employee Id : ");
        employee_id = scan.nextInt();

        try {
            Connection con = connection();
            String sql = "delete from EMPLOYEE where employee_id=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, employee_id);

            int i = stmt.executeUpdate();
            System.out.println("Employee Details Removed Successfully..!");
            //Logger logger = LoggerFactory.getLogger(Database.class);
            //logger.info("Employee Details Removed Successfully..!");
            con.close();
            view();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void view()
    {
        String sql;
        try{
            Connection con = connection();
            sql = "SELECT e.employee_id,e.employee_name,e.salary,d.name from EMPLOYEE e, DEPARTMENT d WHERE d.department_id = e.department_id ";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3)+"  "+rs.getString(4));
            con.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public void menu()
    {
        int choice=0;

        do {
            System.out.println("********************************************");
            System.out.println("1. Add Employee Details");
            System.out.println("2. Modify Employee Details");
            System.out.println("3. Remove Employee Details");
            System.out.println("4. View Employee Details");
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
