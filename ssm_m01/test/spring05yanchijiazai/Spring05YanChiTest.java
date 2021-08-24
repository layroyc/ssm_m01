package spring05yanchijiazai;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring05YanChiTest {
    @Test
    public void test01(){
        String xml = "spring05yanchijiazai/applicationContext.xml";
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        System.out.println("ac = " + ac);
        //lazy-init="true"  加上就是延时加载
    }
}
