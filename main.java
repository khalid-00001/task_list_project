import java.util.Scanner;
import java.util.ArrayList;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1- Create task.");
            System.out.println("2- Show task.");
            System.out.println("3- Update task.");
            System.out.println("4- Delete task.");
            System.out.println("5- Tasks list.");
            System.out.println("6- Latest tasks.");
            System.out.println("7- Done tasks.");
            System.out.println("8- In progress tasks.");
            System.out.println("9- Canceled tasks.");
            System.out.println("0- Exit.");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 0:
                System.exit(0);
                    break;
            }
        }
    }

    public class CreateTask{
        String title, description, id, status, date;
        

    }
}