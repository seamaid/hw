import java.util.Scanner;

public class hw1n3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("input number: ");
            int a= in.nextInt();
            if(a>0&&a<10) {
                System.out.println("Положительное число меньше 10");
            }
            else{
                System.out.println("Положительное число больше 10 или отрицательное");

            }
            in.close();
        }
    }

