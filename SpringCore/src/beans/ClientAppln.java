package beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientAppln {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans/Spring.xml"));
		Employee employee=(Employee)factory.getBean("emp");
		/*employee.setCode(123);
		employee.setName("sushma");*/
		System.out.println(employee.getCode()+" "+employee.getName()+" "+employee.getAddr().getCity());

	}

}
