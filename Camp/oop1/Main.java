import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        //set
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("image.url1");


        Product product2 = new Product();
        product2.setName("Philips Kahve Makinesi");
        product2.setDiscount(10);
        product2.setUnitPrice(5500);
        product2.setUnitInStock(3);
        product2.setImageUrl("image.url2");

        Product product3 = new Product();
        product3.setName("kitchen Kahve Makinesi");
        product3.setDiscount(12);
        product3.setUnitPrice(8500);
        product3.setUnitInStock(5);
        product3.setImageUrl("image.url3");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }
        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(2);
        individualCustomer.setPhone("132132131");
        individualCustomer.setCustomerNumber("5465546546546");
        individualCustomer.setFirstName("Erdal");
        individualCustomer.setLastName("Bars");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("5464564654");
        corporateCustomer.setTaxNumber("56464563284");
        corporateCustomer.setCustomerNumber("5643213218");


        Customer[] customers = {individualCustomer, corporateCustomer};


    }
}