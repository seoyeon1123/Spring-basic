package hello.core.HelloLombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("표원식");
        String name1 = helloLombok.getName();
        System.out.println("name1 = " + name1);
        System.out.println("helloLombok = " + helloLombok);


    }
}
