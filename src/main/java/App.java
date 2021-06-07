import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key (y/n)? ");
        String silent = in.nextLine();

        if("y".equals(silent)){
            System.out.print("Are the battery terminals corroded? ");
            String battery = in.nextLine();
            if("y".equals(battery)){
                System.out.print("Clean terminals and try starting again.");
            }else if("n".equals(battery)){
                System.out.print("Replace cables and try again.");
            }
        }
        else if("n".equals(silent)) {
            System.out.print("Does the car make a slicking noise? ");
            String slick = in.nextLine();
            if("y".equals(slick)) {
                System.out.print("Replace the battery.");
            }else if("n".equals(slick)) {
                System.out.print("Does the car crank up but fail to start? ");
                String crank = in.nextLine();
                if("y".equals(crank)) {
                    System.out.print("Check spark plug connections.");
                }else if("n".equals(crank)) {
                    System.out.print("Does the engine start and then die? ");
                    String start = in.nextLine();
                    if("y".equals(start)) {
                        System.out.print("Does your car have fuel injection? ");
                        String fuel = in.nextLine();
                        if("y".equals(fuel)) {
                            System.out.print("Get it in for service.");
                        }else if("n".equals(fuel)) {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }else if("n".equals(start)) {
                        System.out.print("This should not be possible.");
                    }
                }
            }
        }
    }
}

