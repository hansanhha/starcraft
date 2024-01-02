package hsh.demo.boot.property;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class WordDictionaryClient {

    private final ModernWordDictionary modernWordDictionary;
    private final LegacyWordDictionary legacyWordDictionary;
    private final ExternalWordDictionary externalWordDictionary;

    public WordDictionaryClient(ModernWordDictionary modernWordDictionary, LegacyWordDictionary legacyWordDictionary, ExternalWordDictionary externalWordDictionary) {
        this.modernWordDictionary = modernWordDictionary;
        this.legacyWordDictionary = legacyWordDictionary;
        this.externalWordDictionary = externalWordDictionary;
    }

    @PostConstruct
    public void printWordDictionary() {
        System.out.println("print modern word dictionary");
        System.out.println(modernWordDictionary.getAll());

        System.out.println();
        System.out.println();

        System.out.println("print legacy word dictionary");
        System.out.println(legacyWordDictionary.getAll());

        System.out.println();
        System.out.println();
        System.out.println("print external word dictionary");
        System.out.println(externalWordDictionary.getAll());
    }
}
