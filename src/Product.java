public class Product {




    public Product (int id, String name , String description, double price, int stock){
        System.out.println("yapıcı block çalıştı");
        this.id=id;
        this.name=name;
        this.price=price;
        this.description=description;
        this.stock=stock;
    }
    //getter and setter (generate)
    public Product(){
    }
    private int id;
    private String name;
    private String description;
    private double price;
    private int stock;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public  String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
