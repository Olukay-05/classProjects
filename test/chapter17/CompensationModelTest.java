package chapter17;

import static org.junit.jupiter.api.Assertions.*;

class CompensationModelTest {


    public static void main(String[] args) {

        Employee employee = new Employee("Kunle", "Ade", "98202", new SalaryCompensationModel(2500));
        Employee employee1 = new Employee("Wale", "Kayode", "673854",new HourlyCompensationModel(300, 40));
        Employee employee2 = new Employee("David", "Afolabi", "37882",new BasePlusCommissionCompensationModel(3000, 500, 1.0));
        Employee employee3 = new Employee("Sola", "lekan", "287733", new CommissionCompensationModel(2000,0.8));







        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee.setCompensationModel(new BasePlusCommissionCompensationModel(5000,150,0.2));
        System.out.println(employee);
    }

}