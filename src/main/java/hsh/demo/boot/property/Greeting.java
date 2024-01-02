package hsh.demo.boot.property;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
    * PropertySource 사용(@Value)
    * 프로퍼티 파일
    * OS 환경변수
    * 시스템 속성
    * SPRING_APPLICATION_JSON
    * CLI 인자
    * Property Placeholders 기본값
 */
@Component
public class Greeting {

    @Value("${message.hello:placeholder default hello message}")
    private String helloMessage;

    @Value("${message.bye:placeholder default bye message}")
    private String byeMessage;

    @Value("${message.home:placeholder default home message}")
    private String homeMessage;

    @PostConstruct
    public void init() {
        System.out.println("@Value() 바인딩 결과");
        sayHello();
        sayHome();
        sayBye();
    }

    public void sayHello() {
        System.out.println(helloMessage);
    }

    public void sayBye() {
        System.out.println(byeMessage);
    }

    public void sayHome() {
        System.out.println(homeMessage);
    }
}
