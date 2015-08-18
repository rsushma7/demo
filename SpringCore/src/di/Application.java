package di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Application {
	
	public static void main(String[] args) {
	BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans/Spring.xml"));
	MyMessageSender ms=(MyMessageSender)factory.getBean("ms");
	ms.sendMsg();
	}
}
