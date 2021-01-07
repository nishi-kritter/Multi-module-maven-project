import java.util.Scanner;

enum Cupcake {
    Chocolate(100,"Royal Chocolate",10),
    Strawberry(200,"Fruity Strawberry",15),
    Vanilla(150,"White Vanilla",5);
    private float price;
    private String name;
    private int quantity;

    Cupcake(int price, String name, int quantity) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}

class Shop{
    public void operations()
    {
        Scanner scan = new Scanner(System.in);
        int enum_ch=0;
        do {
            System.out.println("-----------------------------------");
            System.out.println("1. Listing");
            System.out.println("2. Get Value of M");
            System.out.println("3. ValueOf()");
            System.out.println("4. Ordinal()");
            System.out.println("5. Switch Case");
            System.out.println("6. Set Cupcakes");
            System.out.println("7. Exit");
            System.out.println("-----------------------------------");
            System.out.println("Enter Choice:");
            enum_ch = scan.nextInt();
            switch (enum_ch)
            {
                case 1:
                    System.out.println("Flavours \t\t\t Name \t\t\t\t\t\t Rate \t\t Quantity");
                    for (Cupcake c : Cupcake.values())
                        System.out.println(c+" \t\t\t "+c.getName()+" \t\t\t "+c.getPrice()+" \t\t"+c.getQuantity());
                    break;
                case 2:
                    Cupcake c =  Cupcake.Chocolate;
                    System.out.println("Chocolate Cupcake's Name - "+c.getName()+" Price - "+c.getPrice()+" Quantity - "+c.getQuantity());
                    break;
                case 3:
                    System.out.println("Cupcake Size S's value:"+Cupcake.valueOf("Strawberry"));
                    break;
                case 4:
                    System.out.println("Cupcake Size S's value:"+Cupcake.valueOf("Butterscotch").ordinal());
                    break;
                case 5:
                    Cupcake cupcake = Cupcake.Chocolate;
                    switch(cupcake){
                        case Chocolate:
                            System.out.println("Name - "+Cupcake.Chocolate.getName()+" Price - "+Cupcake.Chocolate.getPrice());
                            break;
                        case Strawberry:
                            System.out.println("Name - "+Cupcake.Strawberry.getName()+" Price - "+Cupcake.Strawberry.getPrice());
                            break;
                        case Vanilla:
                            System.out.println("Name - "+Cupcake.Vanilla.getName()+" Price - "+Cupcake.Vanilla.getPrice());
                            break;

                    }
                    break;
                case 6:
                    int ch = 0,quantity;
                    String name;
                    float price;
                    do {
                        System.out.println("-------------------------------------------");
                        System.out.println("1.Set Chocolate");
                        System.out.println("2.Set Strawberry");
                        System.out.println("3.Set Butterscotch");
                        System.out.println("4.EXIT");
                        System.out.println("-------------------------------------------");
                        System.out.println("Enter choice :");
                        ch = scan.nextInt();
                        int internal_ch = 0;
                        switch (ch)
                        {
                            case 1:

                                Cupcake chocolate = Cupcake.Chocolate;
                                do{
                                    System.out.println("-------------------------------------------");
                                    System.out.println("1.Set Name");
                                    System.out.println("2.Set Price");
                                    System.out.println("3.Set Quantity");
                                    System.out.println("4.EXIT");
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Enter choice :");
                                    internal_ch = scan.nextInt();
                                    switch (internal_ch)
                                    {
                                        case 1:
                                            System.out.println("Enter Name :");
                                            name = scan.nextLine();
                                            chocolate.setName(name);
                                            break;
                                        case 2:
                                            System.out.println("Enter Price :");
                                            price = scan.nextFloat();
                                            chocolate.setPrice(price);
                                            break;
                                        case 3:
                                            System.out.println("Enter Quantity :");
                                            quantity = scan.nextInt();
                                            chocolate.setQuantity(quantity);
                                            break;
                                    }
                                }while (internal_ch != 4);

                                break;
                            case 2:

                                Cupcake strawberry = Cupcake.Strawberry;
                                do{
                                    System.out.println("-------------------------------------------");
                                    System.out.println("1.Set Name");
                                    System.out.println("2.Set Price");
                                    System.out.println("3.Set Quantity");
                                    System.out.println("4.EXIT");
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Enter choice :");
                                    internal_ch = scan.nextInt();
                                    switch (internal_ch)
                                    {
                                        case 1:
                                            System.out.println("Enter Name :");
                                            name = scan.nextLine();
                                            strawberry.setName(name);
                                            break;
                                        case 2:
                                            System.out.println("Enter Price :");
                                            price = scan.nextFloat();
                                            strawberry.setPrice(price);
                                            break;
                                        case 3:
                                            System.out.println("Enter Quantity :");
                                            quantity = scan.nextInt();
                                            strawberry.setQuantity(quantity);
                                            break;
                                    }
                                }while (internal_ch != 4);

                                break;
                            case 3:
                                Cupcake vanilla = Cupcake.Vanilla;
                                do{
                                    System.out.println("-------------------------------------------");
                                    System.out.println("1.Set Name");
                                    System.out.println("2.Set Price");
                                    System.out.println("3.Set Quantity");
                                    System.out.println("4.EXIT");
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Enter choice :");
                                    internal_ch = scan.nextInt();
                                    switch (internal_ch)
                                    {
                                        case 1:
                                            System.out.println("Enter Name :");
                                            name = scan.nextLine();
                                            vanilla.setName(name);
                                            break;
                                        case 2:
                                            System.out.println("Enter Price :");
                                            price = scan.nextFloat();
                                            vanilla.setPrice(price);
                                            break;
                                        case 3:
                                            System.out.println("Enter Quantity :");
                                            quantity = scan.nextInt();
                                            vanilla.setQuantity(quantity);
                                            break;
                                    }
                                }while (internal_ch != 4);

                                break;
                        }
                    }while (ch != 4);

                    break;
            }
        }while (enum_ch!=7);


    }
}

