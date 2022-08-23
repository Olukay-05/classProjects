package com.payrollsystem;

public class payrollSystemTest {


    public static void main (String[] args) {

            SalariedEmployee salariedEmployee = new SalariedEmployee("Segun", "Taiwo", "2398888999", 800.00);

            HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Adeleke", "22288778881", 16.75, 40);

            CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "98828277833", 10000, 0.06);

            BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Anu", "Lewis", "1092730098", 5000, 0.04, 300);

            PieceWorker pieceWorker = new PieceWorker("Tunde", "Cooper", "555-55-5555", 1.25, 990);

            Employee[] employees = new Employee[5];

            employees[0] = salariedEmployee;

            employees[1] = hourlyEmployee;

            employees[2] = commissionEmployee;

            employees[3] = basePlusCommissionEmployee;

            employees[4] = pieceWorker;

            System.out.println("Employees processed (polymorphically)");

            for (Employee currentEmployee : employees) {

                System.out.println(currentEmployee);

                System.out.printf("Earnings: %,.2f%n", currentEmployee.earnings());

                System.out.println();

            }

    }
}
