package org.spt.firstthymleaf;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootTest
class FirstthymleafApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("--------------------------------");
        System.out.println("contextLoads");
        System.out.println("--------------------------------");
    }

    @Autowired
    TemplateEngine templateEngine;

    @Test
    public void test1() throws MessagingException {
        Context context = new Context();
        context.setVariable("username","li4");
        context.setVariable("position","java enginer");
        context.setVariable("salary",99999);
        String mail = templateEngine.process("mail",context);
        System.out.println(mail);
    }

}
