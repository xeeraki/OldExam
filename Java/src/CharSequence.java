/**
 * Created by shafai on 2017-04-01.
 */

public class CharSequence {
    private static final int INITIAL_CAPACITY = 3;
    // characters in the character sequence
    private char[] chars;
    // the number of characters
    private int charCount;

    public CharSequence(){
        this.chars = new char[INITIAL_CAPACITY];
        this.charCount = 0;
    }
    public void add(char c){
        if(charCount == chars.length){
            char[] ca = new char[2*chars.length];
            for(int i = 0; i < ca.length; i++){
            ca[i] = chars[i];
            chars = ca;
            }
        }
        chars[charCount] = c;
        charCount++;
    }

    public void replace(int index , char c) {
        //throw java.lang.IndexOutOfBoundsException
        {
            if (index < 0 || index >= charCount) {
                throw new java.lang.IndexOutOfBoundsException("bad Index");
                //chars[index] = c;
            }
        }
    }

    public String toString(){
        return "[" + chars.length + ", " + new String(chars, 0, charCount) + "]";
    }

    public static void main(String[] args) {
        CharSequence cs = new CharSequence();
        for (char c = 'a'; c <= 'e'; c++) {
            cs.add(c);
            System.out.println(cs);
        }
        cs.replace(1, 'B');
        System.out.println(cs);
        cs.replace(5, 'B');
    }
}
