package chapter6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Enter the number of hours parked: ");

        double duration = scanner.nextDouble();


        ParkingChargesApp customer = new ParkingChargesApp(name, duration, 2.00);

        System.out.println("Hi " + name + ". Your parking charges are $" + customer.calculateCharges());

        yesterdaysTotal();

    }

    public static void yesterdaysTotal(){



        double total = 0.0;
        double parkingDurationCounter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter yesterday's parking records or 0 to quit");
        double duration = scanner.nextDouble();


        while (duration != 0){

            total = total + duration;
            parkingDurationCounter = parkingDurationCounter + 1;

            System.out.println("Enter duration or 0 to quit: ");
            duration = scanner.nextDouble();
        }

//        ParkingChargesApp totalCustomer = new ParkingChargesApp(duration);
//
//        if (parkingDurationCounter != 0){
//
//           double totalCharge = charges * total;
//
//
//            System.out.printf(("%nTotal of the %f grades entered is %f%n", parkingDurationCounter, total);
//
//        }


    }
}
