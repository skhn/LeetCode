import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class p345 {
    /*

    Write a function that takes a string as input and reverse only the vowels of a string.

Esample 1:
Given s = "hello", return "holle".

Esample 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".

     */

    public static void main(String[] args) {

    }

    public String reverseVowels(String s) {

        if(s.length() < 1) {
            return s;
        }

        int i = 0;
        int j = s.length() - 1;

        ArrayList<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }
        Set<Character> hashSet = new HashSet<>();
        hashSet.add('a');
        hashSet.add('e');
        hashSet.add('i');
        hashSet.add('o');
        hashSet.add('u');
        hashSet.add('A');
        hashSet.add('E');
        hashSet.add('I');
        hashSet.add('O');
        hashSet.add('U');
        while(i < j) {
            if(hashSet.contains(s.charAt(i)) & hashSet.contains(s.charAt(j))) {
                char temp = chars.get(i);
                chars.set(i,s.charAt(j));
                chars.set(j,temp);
                i++;j--;
            } else if(!hashSet.contains(s.charAt(i))) {
                i++;
            } else if(!hashSet.contains(s.charAt(j))) {
                j--;
            }
        }

        // new s with reversed vowels
        StringBuffer buff = new StringBuffer();
        for (char c: chars) {
            buff.append(c);
        }
        return buff.toString();
    }

}
