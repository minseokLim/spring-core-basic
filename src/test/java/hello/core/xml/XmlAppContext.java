package hello.core.xml;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import hello.core.member.MemberService;

class XmlAppContext {
    @Test
    void xmlAppContext() {
        final ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        final MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
