package Homeworks.Assignment25OOP3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculateTolls {
    public static void main(String[] args) {


        int yesNo;
        List<String> types = new ArrayList<>();
        List<Double> distanceList = new ArrayList<>();
        List<Double> tollsList = new ArrayList<>();

        do {

            Scanner scan = new Scanner(System.in);
            String input;
            Vehicle vehicle;

            do {
                System.out.println("Enter a type of Vehicle ( car, truck or police cruiser)");
                input = scan.nextLine();
                if (!input.equalsIgnoreCase("car") && !input.equalsIgnoreCase("truck") && !input.equalsIgnoreCase("police cruiser")) {
                    System.out.println("Entered wrong data..");

                } else {
                    types.add(input);
                }
            } while (!input.equalsIgnoreCase("car") && !input.equalsIgnoreCase("truck") && !input.equalsIgnoreCase("police cruiser"));


            System.out.println("Enter the distance traveled:");
            //scan.nextLine();
            double distanceTraveled = scan.nextDouble();
            distanceList.add(distanceTraveled);


            boolean input3;
            boolean input4;
            int input5;
            double toll = 0.00;
            if (input.equalsIgnoreCase("car")) {
                System.out.println("Do you have a trailer? true/false:");
                input3 = scan.nextBoolean();
                System.out.println("isHov ? true/false:");
                input4 = scan.nextBoolean();

                vehicle = new Car(distanceTraveled, input3, input4);
                vehicle.calculateToll();
                tollsList.add(vehicle.getToll());

                //System.out.println("Your toll is " + vehicle.getToll());
                System.out.println(vehicle.toString());

            } else if (input.equalsIgnoreCase("truck")) {
                System.out.println("Enter number of axles, 4/6/8+ : ");
                input5 = scan.nextInt();
                vehicle = new Truck(distanceTraveled, input5);
                vehicle.calculateToll();
                tollsList.add(vehicle.getToll());
                System.out.println(vehicle.toString());
            } else if (input.equalsIgnoreCase("police cruiser")) {
                vehicle = new PoliceCruiser(distanceTraveled);
                vehicle.calculateToll();
                tollsList.add(vehicle.getToll());
                System.out.println(vehicle.toString());
            }


            System.out.println("Do you want to make another entry? 1.Yes  2.No");
            yesNo = scan.nextInt();
            scan.nextLine();
        } while (yesNo == 1);

//        System.out.println(" All inputs:");
//        for( int i = 0; i < types.size(); i++) {
//            System.out.println("Vehicle: " + types.get(i)+"     "+"Distance traveled: " + distanceList.get(i)
//            +"      " + "Toll: $"+tollsList.get(i));
//        }

        System.out.println("All inputs:");
        System.out.printf("%-20s %-20s %-20s%n", "Vehicle: ", "Distance traveled: ",
                 "Toll:");

        for (int i = 0; i < types.size(); i++) {
            System.out.printf("%-20s %-20s %-20s%n", types.get(i), distanceList.get(i), "$"+tollsList.get(i));
        }
    }
}

