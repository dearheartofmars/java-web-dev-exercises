package studios.countingcharacters;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Count {
    public static void main(String[] args) {
        HashMap<Character, Integer > ToCount = new HashMap<>();
        String word = "onomatopoeia";
//        char[] charactersInString = word.toCharArray();
        for (char i : word.toLowerCase().toCharArray()) {
           if(ToCount.containsKey(i)) {
               ToCount.put(i, ToCount.get(i) + 1);
           } else {
               ToCount.put(i , 1);
               }
        }
        for(Map.Entry<Character, Integer> characters : ToCount.entrySet()) {
            System.out.println(characters.getKey() + ":" + characters.getValue() );
        }
            }

        }



