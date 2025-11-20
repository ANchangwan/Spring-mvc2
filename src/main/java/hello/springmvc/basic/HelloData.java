package hello.springmvc.basic;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class HelloData {
    private String username;
    private int age;
}
