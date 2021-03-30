import java.util.Scanner;

public class hw1n4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input hours: ");
        int hours = in.nextInt();
        System.out.println("Input salary per hour: ");
        double salaryPerHour = in.nextDouble();
        double salary = hours* salaryPerHour;
        System.out.printf("Your salary is %2.2f\n",salary);
        double tax1 = salary*0.05;
        System.out.println(" Salary without 1st tax is: ");
        System.out.println(salary-tax1);
        double tax2 = salary-1300 ;
        System.out.println(" Salary without 1st and 2nd tax: ");
        System.out.println(tax2-tax1);
        System.out.println("1st tax is: ");
        System.out.println(tax1);
        System.out.println("2nd tax is: ");
        System.out.println(1300);

        in.close();

    }
}
