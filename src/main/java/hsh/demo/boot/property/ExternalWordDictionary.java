package hsh.demo.boot.property;

import java.util.ArrayList;
import java.util.List;

public class ExternalWordDictionary {

    private String hat;
    private String pants;
    private String shoes;

    private List<String> words = new ArrayList<>();

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
