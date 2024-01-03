package com.starcraft.hansanhha.boot_feature_test.property;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

// setter를 통해 바인딩
@Configuration
@ConfigurationProperties(prefix = "japanese.word")
public class JapaneseWordDictionary implements WordDictionary {

    private String hat;
    private String pants;
    private String shoes;

    private List<String> words = new ArrayList<>();

    @PostConstruct
    public void init() {
        words.add(hat);
        words.add(pants);
        words.add(shoes);
    }

    @Override
    public String getWord(String word) {
        return words.stream()
                .filter(w -> w.equals(word))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 단어가 없습니다."));
    }

    @Override
    public String getAll() {
        return String.join(" ", words);
    }

    @Override
    public boolean isSupported(Language language) {
        return language.equals(Language.JAPANESE);
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }
}
