import java.util.Scanner;

public class hw1n2 {
public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input number: ");
            int a= in.nextInt();
            if(a==1) {
                System.out.println("Понедельник");
            }
            else if (a==2){
                System.out.println("Вторник");
            }
            else if (a==3){
                System.out.println("Среда");
            }
            else if (a==4){
                System.out.println("Четверг");
            }
            else if (a==5){
                System.out.println("Пятница");
            }
            else if (a==6||a==7) {
                System.out.println("Выходные");
            }
            in.close();
        }
    }

