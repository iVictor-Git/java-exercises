package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {

        String search = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis " +
                "augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet " +
                "suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, " +
                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        char[] searchArray = search.toCharArray();

        Integer start = 1;
        HashMap<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < searchArray.length; i++) {
            if (!characters.containsKey(searchArray[i])) {
                Integer initialValue;
                characters.put(searchArray[i], initialValue = start);
            } else {
                characters.replace(searchArray[i], characters.get(searchArray[i]),characters.get(searchArray[i]) + 1);
            }
        }

        for (Map.Entry<Character, Integer> character: characters.entrySet()) {
            System.out.printf("%s : %s\n", character.getKey().toString(), character.getValue().toString());
        }
    }
}
