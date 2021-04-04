package encryptdecrypt;

import java.util.HashMap;

public class SimpleEncryption {
    // Stage 1
    String alph = "abcdefghijklmnopqrstuvwxyz !";
    String revAlph = "zyxwvutsrqponmlkjihgfedcba !";
    public String encrypt(String message){
        // Создаем и заполняем мапу
        HashMap<Character, Character> encrAlph = new HashMap<>();
        for (int i = 0; i < alph.length(); i++){
            encrAlph.put(alph.charAt(i),revAlph.charAt(i));
        }

        //Свапнуть буквы
        char[] msgLetters = message.toCharArray();
        for (int i = 0; i < msgLetters.length; ++i) {
            char tmp = msgLetters[i];
            msgLetters[i] = encrAlph.get(tmp);
        }
        message = new String(msgLetters);
        return message;
    }
}
