package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {

        System.out.println(args.toString());
        char[] searchArray = args.toString().toLowerCase().toCharArray();

        Integer start = 1;
        HashMap<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < searchArray.length; i++) {
            if (Character.isLetter(searchArray[i])) {
                if (!characters.containsKey(searchArray[i])) {
                    Integer initialValue;
                    characters.put(searchArray[i], initialValue = start);
                } else {
                    characters.replace(searchArray[i], characters.get(searchArray[i]), characters.get(searchArray[i]) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> character: characters.entrySet()) {
            System.out.printf("%s : %s\n", character.getKey().toString(), character.getValue().toString());
        }
    }
}
