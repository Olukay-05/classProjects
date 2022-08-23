package chapter18;

import chapter17.SalaryCompensationModel;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {
    public static void main(String[] args) {
        Payable[] payables = new Payable[]{
                new Invoice("8172","books",2,700.0),
                new Invoice("9028","stationary", 5, 2000.0),
                new Employee("james","ola","2839",new SalaryCompensationModel(7000.0)),
        };

        System.out.println("invoices are processed polymorphically");

        for (Payable objectPayable : payables){
            System.out.printf("%n%s %n payment due: $%,.2f%n", objectPayable.toString(), objectPayable.getPaymentAmount());
        }
    }


}