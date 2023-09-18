
class ProjectMain{
    public static void main(String[] args) {
        
        Product banana = new Product("Banana", 2);
        banana.ShowDetail();
        banana.AddtoBasket();

        Shoe kerb = new Shoe("Kerbtae", 10, 10);
        kerb.ShowDetail();
        kerb.AddtoBasket();

        Shirt tShirt = new Shirt("T-Shirt", 2, "M");
        tShirt.ShowDetail();
        tShirt.AddtoBasket();

        Trousers taewjean = new Trousers("Taew Jean", 500, "L");
        taewjean.ShowDetail();
        taewjean.AddtoBasket();


        
        

        
        
        
    }
}

