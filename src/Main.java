public class Main {
    public static void main(String[] args) {
       Product product =new Product(1,"laptop,","asus",3000,2);
    ProductManager productmanager =new ProductManager();
    productmanager.add(product);
    }
}