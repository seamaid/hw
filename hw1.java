import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {

     Scanner in= new Scanner(System.in);
     System.out.println("Your name is: ");
     String name= in.nextLine() ;
     System.out.println("Your patronymic is: ");
     String patronymic =in.nextLine() ;
     System.out.println("Your surname is: ");
     String surname =in.nextLine() ;
     System.out.println("Your age is: ");
     int age = in.nextInt();
     System.out.printf("Hello!\n name = %s;patronymic = %s;surname = %s;age= %d\n",name,patronymic,surname,age);
     int currentYear= 2021;
     System.out.print("Year of birth:");
     System.out.println( currentYear-age);
     in.close();



            }
}
