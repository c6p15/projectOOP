class ProjectMain{
    public static void main(String[] args) {
        Product banana = new Product("Banana", 2);
        banana.ShowDetail();
    }
}

class Product{
    protected String Name;
    protected float Price;
    
    Product(String name, float price){
        this.Name = name;
        this.Price = price;
    }

    protected void ShowDetail(){
        System.out.println("Name : "+this.Name);
        System.out.println("Price : "+this.Price);
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
        System.out.println("Size : "+this.ShoeSize);
    }
}

class Shirt extends Product{
    protected int ShirtSize;

    Shirt(String name,float price, int shirtsize){
        super(name, price);
        this.ShirtSize = shirtsize;
    }

    protected void ShowDetail(){
        System.out.println("Name : "+this.Name);
        System.out.println("Price : "+this.Price);
        System.out.println("Size : "+this.ShirtSize);
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

    SportShirt(String name, float price, int shirtsize){
        super(name, price, shirtsize);
    }
}

class FasionShirt extends Shirt{

    FasionShirt(String name, float price, int shirtsize){
        super(name, price, shirtsize);
    }
}
