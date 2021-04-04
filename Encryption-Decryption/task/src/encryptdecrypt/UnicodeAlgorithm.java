package encryptdecrypt;

public class UnicodeAlgorithm extends Algorithm{
    @Override
    public String encrypt(String message, int key) {
        StringBuilder cipherText = new StringBuilder();

        for (char c : message.toCharArray()) {
            cipherText.append((char) (c + key));
        }

        return cipherText.toString();
    }

    @Override
    public String decipher(String message, int key) {
        return encrypt(message, -key);
    }
}
