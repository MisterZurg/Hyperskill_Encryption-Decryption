import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int first = new Scanner(System.in).nextInt();
        int second = new Scanner(System.in).nextInt();
        int counter = 0;
        int sum = 0;
        for (; first < second; first++){
            if (first % 3 == 0){
                sum += first;
                counter++;
            }
        }
    System.out.println(sum / counter);
    }
}
