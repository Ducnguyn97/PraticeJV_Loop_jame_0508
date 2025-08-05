import java.util.Scanner;

public class Pratice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố: ");
        int n = Integer.parseInt(scanner.nextLine());
        int number = 2;
        int counter = 0;
        while (counter < n) {
            boolean isTrue = false;
            for (int i = 2; i < number ; i++ ){
                if (number % i == 0){
                    isTrue = true;
                }
            }
            if(!isTrue){
                System.out.print(number+ " ");
                counter++;
            }
            number++;
        }
    }
}
