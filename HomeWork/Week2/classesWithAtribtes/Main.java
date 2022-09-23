public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(2);
        product.setName("Laptop");
        product.setDescription("Msi laptop");
        product.setStockAmount(5);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getName());
    }
}