import java.util.Scanner;

public class Pratice1 {
    public static void main(String[] args) {
        int choice =-1;
        Scanner scanner = new Scanner(System.in);
        String result = "";
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the triangle");
            System.out.println("3. Draw the inverted triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++){
                        for(int j = 0; j < 7; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++){
                        for(int j = 1; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 3:
                    for(int i= 5; i >= 1; i--){
                        for(int j =1; j<=i; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
