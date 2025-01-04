package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class wordOccurrenceAnalyzer {
    private static final String FILE_PATH = "D:/gitProjects/java8/src/file1.txt";

 public List<String> findNthOccurence(int rank,boolean isDescending) throws IOException {
     Map<String,Long>wordMap=new HashMap<>();
     List<Path> collect = Files.walk(Path.of(FILE_PATH)).filter(Files::isRegularFile).collect(Collectors.toList());

     for(Path path : collect) {
         Files.lines(path).flatMap(line-> Arrays.stream(line.split("\\W+")))
//                 .forEach(word->{
//                     if(!wordMap.containsKey(word)) {
//                         wordMap.put(word, 1L);
//                     } else {
//                         wordMap.put(word, wordMap.get(word)+1);
//                     }
//                 });
                 .filter(word->!word.isEmpty())
                 .forEach(word->wordMap.merge(word,1L,Long::sum));
     }
     System.out.println(wordMap);

     Map<Long, List<String>> collect1 = wordMap.entrySet().stream()
             .collect(Collectors.
                     groupingBy(Map.Entry::getValue, Collectors.mapping(
                                     Map.Entry::getKey, Collectors.toList()
                             )
                     )
             );
     System.out.println("frequencyofWords"+collect1);
     List<Long>sortedFrequency=new ArrayList<>(collect1.keySet());

     sortedFrequency.sort(isDescending?Comparator.reverseOrder():Comparator.naturalOrder());

     System.out.println("sortedFrequency"+sortedFrequency);
     return null;
 }
    public static void main(String[] args) {
        wordOccurrenceAnalyzer wordOccurrenceAnalyzer = new wordOccurrenceAnalyzer();
        try {
            wordOccurrenceAnalyzer.findNthOccurence(1,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
