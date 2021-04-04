package encryptdecrypt;

public class CeasarEncryption {
    // Stage 2
    public String ceasarEncription(String message, int rot){
        StringBuilder result = new StringBuilder();
        for (char letter : message.toCharArray()){
            /* Stage 2
            if (letter != ' ') {
                int originalAlphabetPosition = letter - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + rot) % 26;
                char newLetter = (char) ('a' + newAlphabetPosition);
                result.append(newLetter);
            } else {
                result.append(letter);
            }
            */
            result.append((char) (letter + rot));
        }
        return result.toString();
    }

    // Stage 3
    public String ceasarDecription(String message, int rot){
        return ceasarEncription(message, -rot);
    }
}
