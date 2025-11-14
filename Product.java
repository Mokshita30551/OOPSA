class Product {
    int productId;
    String name;
    double price;
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 45000.50);
        Product p2 = new Product(102, "Smartphone", 25000.00);
        p1.displayProduct();
        p2.displayProduct();
    }
}
