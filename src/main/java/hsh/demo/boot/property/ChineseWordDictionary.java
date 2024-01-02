package hsh.demo.boot.property;

import java.util.ArrayList;
import java.util.List;

// 직접 @ConfigurationProperties 사용 불가한 상황 가정 - 외부에서 property 바인딩
public class ChineseWordDictionary implements WordDictionary{

    private String hat;
    private String pants;
    private String shoes;

    private List<String> words = new ArrayList<>();

    public void init() {
        words.add(hat);
        words.add(pants);
        words.add(shoes);
    }

    @Override
    public String getAll() {
        return String.join(" ", words);
    }

    @Override
    public String getWord(String word) {
        return words.stream()
                .filter(w -> w.equals(word))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 단어가 없습니다."));
    }

    @Override
    public boolean isSupported(Language language) {
        return language.equals(Language.CHINESE);
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
