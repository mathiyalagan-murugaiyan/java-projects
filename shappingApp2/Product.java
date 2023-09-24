package shappingApp2;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    double calculateDiscount() {
        return price * 0.2;
    }
}

class Mobile extends Product {
    int imeino;

    Mobile(int id, String name, double price, int imeino) {
        super(id, name, price);
        this.imeino = imeino;
    }

   
    double calculateDiscount() {
        return price * 0.05;
    }
}

class Laptop extends Product {
    int serialno;

    Laptop(int id, String name, double price, int serialno) {
        super(id, name, price);
        this.serialno = serialno;
    }

   
    double calculateDiscount() {
        return price * 0.075;
    }
}

class Tv extends Product {
    int modelno;

    Tv(int id, String name, double price, int modelno) {
        super(id, name, price);
        this.modelno = modelno;
    }

  
    double calculateDiscount() {
        return price * 0.1;
    }
}

class Shop {
    void addToCart(Product p) {
        System.err.println("CART ITEMS");
        System.out.println();
        if (p instanceof Mobile) {
            System.out.println("Product Id   : " + p.id);
            System.out.println("Product Name : " + p.name);
            System.out.println("Price        : " + p.price);
            Mobile m = (Mobile) p;
            System.out.println("IMEI No      : " + m.imeino);
            System.out.println("Discount amount: " + p.calculateDiscount());
            System.out.println("---------------------------------------------");
        } else if (p instanceof Laptop) {
            System.out.println("Product Id    : " + p.id);
            System.out.println("Product Name  : " + p.name);
            System.out.println("Price         : " + p.price);
            Laptop l = (Laptop) p;
            System.out.println("Serial No     : " + l.serialno);
            System.out.println("Discount amount: " + p.calculateDiscount());
            System.out.println("---------------------------------------------");
        } else if (p instanceof Tv) {
            System.out.println("Product Id    : " + p.id);
            System.out.println("Product Name  : " + p.name);
            System.out.println("Price         : " + p.price);
            Tv t = (Tv) p;
            System.out.println("Model No      : " + t.modelno);
            System.out.println("Discount amount: " + p.calculateDiscount());
            System.out.println("---------------------------------------------");
        }
    }
}

 class Main5 {
    public static void main(String[] args) {
        Shop app = new Shop();
        app.addToCart(new Mobile(1, "Samsung", 30000.0, 12345));
        app.addToCart(new Laptop(2, "HP", 35000.0, 54321));
        app.addToCart(new Tv(3, "Sony", 40000.0, 98765));
    }
}

