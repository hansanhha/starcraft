package hsh.demo.boot.property;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WordDictionaryClient {

    private final List<WordDictionary> wordDictionaries;

    public WordDictionaryClient(List<WordDictionary> wordDictionaries) {
        this.wordDictionaries = wordDictionaries;
    }

    @PostConstruct
    public void printWordDictionary() {
        System.out.println();
        System.out.println("===all word dictionaries===");
        System.out.println("hat, pants, shoes:");
        wordDictionaries.forEach(dictionary -> System.out.println(dictionary.getAll()));

        System.out.println();
        System.out.println("===korean word dictionary===");
        wordDictionaries.stream()
                .filter(dictionary -> dictionary.isSupported(Language.KOREAN))
                .findFirst()
                .ifPresent(dictionary -> System.out.println(dictionary.getAll()));
    }
}
