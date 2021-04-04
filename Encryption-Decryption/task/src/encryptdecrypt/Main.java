package encryptdecrypt;

public class Main {
    public static void main(String[] args){

        // System.out.println("we found a treasure!");

        // First Stage
        // String message = "we found a treasure!";
        // System.out.println(encrypt(message));

        Enigma enigma = new Enigma();
        enigma.parseArgs(args);
        enigma.execute();
    }
}
