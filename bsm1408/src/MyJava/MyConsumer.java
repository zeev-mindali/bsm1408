package MyJava;

import beans.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyConsumer {

    public static void main(String[] args) {
        Customer zeev = new Customer("Zeev","052-4043142");
        //customer.greetCustomer();
        Consumer<Customer> customerConsumer= customer-> System.out.println("Hello "+customer.getCustomerName()+" thanks for registering phone number "+ customer.getCustomerPhone());
        BiConsumer<Customer,Boolean> customerConsumerV2= (customer,showMe)-> System.out.println("Hello "+customer.getCustomerName()+" thanks for registering phone number "+ (showMe?customer.getCustomerPhone():"***-*******"));


        customerConsumer.accept(zeev);

        customerConsumerV2.accept(zeev,false);
    }
}
