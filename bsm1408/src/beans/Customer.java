package beans;

public class Customer {
    private final String customerName;
    private final String customerPhone;

    public Customer(String customerName, String customerPhone) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                '}';
    }

//    public void greetCustomer(){
//        System.out.println("Hello "+this.customerName+" thanks for registering phone number "+this.customerPhone);
//    }
}
