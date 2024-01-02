package hsh.demo.boot.property;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;

/*
    * @ConfigurationProperties : 프로퍼티 파일을 통해 필드 바인딩(setter 사용)
    * @ConfigurationPropertiesScan : @ConfigurationProperties 스캔 후 스프링 빈 등록(해당 객체는 @Component 생략 가능)
        -> @EnableConfigurationProperties 대신 사용 가능
    * @ConstructorBinding : 생성자를 통해 바인딩(불변)
    * Property 검증 가능
 */
@ConfigurationProperties(prefix = "modern.word")
@Validated
public class ModernWordDictionary {

    @NotBlank
    private final String hat;

    @NotBlank
    private final String pants;

    @NotBlank
    private final String shoes;

    private List<String> words = new ArrayList<>();

    @ConstructorBinding
    public ModernWordDictionary(String hat, String pants, String shoes) {
        this.hat = hat;
        this.pants = pants;
        this.shoes = shoes;

        words.add(hat);
        words.add(pants);
        words.add(shoes);
    }

    public String getAll() {
        return String.join(" ", words);
    }
}
