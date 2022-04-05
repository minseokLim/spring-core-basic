package hello.core.autowired;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import hello.core.member.Member;

class AutowiredTest {
    @Test
    void autowiredOption() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean {
        @Autowired(required = false) // Member 타입의 빈이 없을 경우, 아예 호출이 안됨
        public void setNoBean1(Member noBean1) {
            System.out.println("noBean1 = " + noBean1);
        }

        @Autowired // Member 타입의 빈이 없을 경우, null이 들어감
        public void setNoBean2(@Nullable Member noBean2) {
            System.out.println("noBean2 = " + noBean2);
        }

        @Autowired // Member 타입의 빈이 없을 경우, Optional.empty()가 들어감
        public void setNoBean3(@Nullable Optional<Member> noBean3) {
            System.out.println("noBean3 = " + noBean3);
        }
    }
}
