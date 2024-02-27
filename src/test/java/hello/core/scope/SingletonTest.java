package hello.core.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

    @Test
    void singletonBeanFind(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(singletonBean.class);
        singletonBean singletonBean1 = ac.getBean(singletonBean.class);
        singletonBean singletonBean2 = ac.getBean(singletonBean.class);
        System.out.println("singletonBean1 = " + singletonBean1);
        System.out.println("singletonBean2 = " + singletonBean2);

        Assertions.assertThat(singletonBean1).isSameAs(singletonBean2);
        ac.close();

    }
    static class singletonBean{

        @PostConstruct
        public void init(){
            System.out.println("singletonBean.init");
        }

        @PreDestroy
        public void destroy(){
            System.out.println("singletonBean.destroy");
        }
    }
}
