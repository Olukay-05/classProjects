package com.accountpayablesystemtest;

import com.accountpayablesystem.*;
import com.payrollsystem.SalariedEmployee;

public class PayableInterfaceTest {


    public static void main(String[] args){

        Payable[] payableObjects =new Payable[5];

        payableObjects[0]=new Invoice("01234","seat",2,375.00);

        payableObjects[1]= new Invoice("56789","tire",4,79.95);

        //payableObjects[2]= new SalariedEmployee("John","Smith","111-11-1111",800.00);

        payableObjects[2]=new HourlyEmployee("Lisa","Barnes","888-88-8888",16,40, 2021);

        payableObjects[3]=new CommissionEmployee("Sue","Jones","333-33-3333",16,40, 2021, 5000.00, 0.5);

        payableObjects[4]=new BasePlusCommissionEmployee("Bob","Lewis","444-44-4444",15,40,2021, 5000.00, 0.5, 500.00);

        System.out.println("Invoices and Employees processed polymorphically:");



        for(Payable currentPayable : payableObjects){

//            System.out.println();
//
//            System.out.println(currentPayable);

            if(currentPayable instanceof BasePlusCommissionEmployee){

                BasePlusCommissionEmployee emp =(BasePlusCommissionEmployee)currentPayable;

                emp.setBaseSalary(1.10 * emp.getBaseSalary());

               // System.out.printf("%s %s: $%,.2f %n%s:$%,.2f%n","updated base salary", emp.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%.2f%n", emp.getBaseSalary());
              //  continue;
            }

            System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }
    }
}
