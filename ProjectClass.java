import java.util.ArrayList;

class Product{
    protected String Name;
    protected float Price;
    protected static ArrayList<String> basket = new ArrayList<String>();

    Product(String name, float price){
        this.Name = name;
        this.Price = price;
    }

    protected void ShowDetail(){
        System.out.println("Name : "+this.Name);
        System.out.println("Price : "+this.Price);
    }

    protected void AddtoBasket(){
        
        basket.add(this.Name);
        System.out.println("--- "+this.Name+"has been added to your basket ---");
        
        System.out.println("--- this is your item in the basket ---");
        for (int i = 0; i < basket.size(); i++) {
            System.out.println(" - "+basket.get(i));
        }
        System.out.println("---------------------------------------");

    }
}

class Shoe extends Product{
    protected int ShoeSize;

    Shoe(String name, float price, int shoesize){
        super(name, price);
        this.ShoeSize = shoesize;
    }

    protected void ShowDetail(){
        System.out.println("Name : "+this.Name);
        System.out.println("Price : "+this.Price);
        System.out.println("Size : "+this.ShoeSize+" US");
    }
}

class Shirt extends Product{
    protected String ShirtSize;

    Shirt(String name,float price, String shirtsize){
        super(name, price);
        this.ShirtSize = shirtsize;
    }

    protected void ShowDetail(){
        System.out.println("Name : "+this.Name);
        System.out.println("Price : "+this.Price);
        System.out.println("Size : "+this.ShirtSize);
    }
}

class Trousers extends Product{
    protected String TrousersSize;

    Trousers(String name,float price, String size){
        super(name, price);
        this.TrousersSize = size;
    }

    protected void ShowDetail(){
        System.out.println("Name : "+this.Name);
        System.out.println("Price : "+this.Price);
        System.out.println("Size : "+this.TrousersSize);
    }
}


class SportShoe extends Shoe{

    SportShoe(String name, float price, int shoesize){
        super(name, price, shoesize);
    }
}

class FasionShoe extends Shoe{

    FasionShoe(String name, float price, int shoesize){
        super(name, price, shoesize);
    }
}

class SportShirt extends Shirt{

    SportShirt(String name, float price, String shirtsize){
        super(name, price, shirtsize);
    }
}

class FasionShirt extends Shirt{

    FasionShirt(String name, float price, String shirtsize){
        super(name, price, shirtsize);
    }
}

class Shorts extends Trousers{

    Shorts(String name, float price, String size){
        super(name, price, size);
    }
}

class Pants extends Trousers{

    Pants(String name, float price, String size){
        super(name, price, size);
    }
}
