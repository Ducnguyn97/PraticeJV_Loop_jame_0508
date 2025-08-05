import java.util.Scanner;
public class Pratice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 2;
        while (number < 100) {
            boolean isTrue = false;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isTrue = true;
                }
            }
            if (!isTrue) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
