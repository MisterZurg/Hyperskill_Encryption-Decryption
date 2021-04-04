import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbReverse = sb.reverse();
        if (s.equals(String.valueOf(sbReverse))){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}