public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();

        product.setId(1);
        product.set_name("Laptop");
        product.set_description("Asus Laptop");
        product.set_price(4999.99);
        product.set_StockAmount(5);
        productManager.Add(product);
    }
}