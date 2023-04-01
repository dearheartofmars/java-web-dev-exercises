package studios.countingcharacters;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Count {
    public static void main(String[] args) {
        HashMap<Character, Integer > ToCount = new HashMap<>();
        String word = "onomatopoeia";
        char[] charactersInString = word.toCharArray();
        for (char i : charactersInString) {
           if(ToCount.containsKey(i)) {
           } else {
                   ToCount.put(i , 1);
               }
               System.out.println(ToCount);
        }
            }

        }




