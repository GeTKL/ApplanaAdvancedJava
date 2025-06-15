package org.example;
import java.io.*;
import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try{
            List<String> lines = new ArrayList<>();
            try(Scanner in = new Scanner(new File("src/main/resources/file.txt"))) {
                while(in.hasNext()){
                    String word = in.next().toLowerCase();
                    if(!word.isBlank()){
                        lines.add(word);
                    }
                }
            }

            Collections.sort(lines);

            Map<String, Integer> countWords = new HashMap<String, Integer>();
            for(String line : lines){
                int count = Collections.frequency(lines, line);
                countWords.put(line, count);
                System.out.println(line);
            }

            System.out.println();

            Map.Entry<String, Integer> maxEntry = Collections.max(countWords.entrySet(), Map.Entry.comparingByValue());
            for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println();
            System.out.println("Максимальное количество элементов: " + maxEntry.getKey() + "\nКоличество повторений: " + maxEntry.getValue());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}