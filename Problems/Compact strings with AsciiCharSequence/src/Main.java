import java.util.*;
/*
The solution doesn't have anything to do with the lesson.  Here are the steps to solve:
1. Create an array of bytes
2. create the constructor
3. length method should return the length of the byte array
4. charAt returns the byte at the index given in the parameter.  Also need to caste to "char" type
5. for subsequence method, use the Arrays.copyofRange method to get the sequence.  Then use "new AsciiCharSequence() method to convert the sequence to the CharSequence type we need to return
6. for the toString method, need to return a new String
 */
class AsciiCharSequence  implements  java.lang.CharSequence/* extends/implements */ {
    private byte [] copyOfRange;

    public AsciiCharSequence(byte[] copyOfRange) {
        this.copyOfRange = copyOfRange;
    }

    @Override
    public int length() {
        return copyOfRange.length;
    }

    @Override
    public char charAt(int i) {
        return (char)copyOfRange[i];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(copyOfRange, start, end));
    }

    @Override
    public String toString(){
        return new String(this.copyOfRange);
    }
    // implementation
}

abstract class Gay {
    public Gay() {
    }

    static void sayGayStuff(){

    }
}

interface Nigger {
    static void sayNword(){

    }
}
class NiggerGay extends Gay implements  Nigger{

}