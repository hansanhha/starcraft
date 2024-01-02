package hsh.demo.boot.property;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "legacy.word")
public class LegacyWordDictionary {

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

    public String getAll() {
        return String.join(" ", words);
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
