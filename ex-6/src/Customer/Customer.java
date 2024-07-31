package Customer;

public class Customer {

    // 고객번호, 고객이름, 주소
    // customerId, customerName, address

    private static int serialNum = 100;

    private int customerId;
    private String customerName;
    private String address;

    public Customer(){}
    public Customer(String customerName, String address){
        this.customerId = ++serialNum;
        this.customerName = customerName;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return customerId + "/" +customerName + "/" + address;
    }
}
