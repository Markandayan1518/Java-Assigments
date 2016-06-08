package Assigments5;


class Person{
    protected String SSId = "SSN12121";
    public void display(){
      System.out.println("Social Security Number: "+SSId);
    }
}
class Customer extends Person{
   String customerId = "C1001";
   public void display(){
      super.display();
       System.out.println("Customer Id: "+customerId);
  } 
}
public class InheritenceDemo {
   public static void main(String args[]){
      Customer customer = new Customer();
       customer.display();
   }
}
