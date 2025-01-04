package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class sample {
    private static final String DIRECTORY_PATH = "D:/gitProjects/java8/src/";

    public List<String> findNthOccurrence(int rank, boolean isDescending) throws IOException {
        Map<String, Long> wordMap = new HashMap<>();

        // Get all the files from the directory
        List<Path> collect = Files.walk(Path.of(DIRECTORY_PATH))
                .filter(Files::isRegularFile)
                .collect(Collectors.toList());

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        // Read each file and update or store the frequency
        for (Path path : collect) {
            executorService.execute(() -> {
                try {
                    Files.lines(path).flatMap(line -> Arrays.stream(line.split("\\W+")))
                            .filter(word -> !word.isEmpty())
                            .forEach(word -> {
                                wordMap.merge(word, 1L, Long::sum);
                                System.out.println(Thread.currentThread().getName());
                            });
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        // Shutdown executorService
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            // Wait for all tasks to finish
        }

        System.out.println(wordMap);

        // Handle ranking by grouping words by their frequency
        Map<Long, List<String>> frequencyMap = wordMap.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));

        System.out.println("frequencyMap: " + frequencyMap);

        // Sort the frequencies based on user search (desc/asc)
        List<Long> sortedFrequency = new ArrayList<>(frequencyMap.keySet());
        sortedFrequency.sort(isDescending ? Comparator.reverseOrder() : Comparator.naturalOrder());

        System.out.println("sortedFrequency: " + sortedFrequency);

        if (rank <= 0 || rank > sortedFrequency.size()) {
            throw new IllegalArgumentException("Invalid rank");
        }

        long targetRank = sortedFrequency.get(rank - 1);

        // Return all the words with the nth rank
        return frequencyMap.getOrDefault(targetRank, Collections.emptyList());
    }

    public static void main(String[] args) {
        sample wordOccurrenceAnalyzer = new sample();
        try {
            System.out.println(wordOccurrenceAnalyzer.findNthOccurrence(1, true));
            System.out.println(wordOccurrenceAnalyzer.findNthOccurrence(2, false));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
