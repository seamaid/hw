import java.util.Scanner;

public class hw1n1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Input number: ");
        int a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case  2:
                System.out.println("Вторник");
                break;
            case  3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case  5:
                System.out.println("Пятница");
                break;
            case  6 :
            case 7:
                System.out.println("Выходной");
                break;
        }

            }
        }
