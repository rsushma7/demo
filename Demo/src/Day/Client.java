package Day;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class Client {

	public static void main(String[] args) throws MalformedURLException {
		
		URL url=new URL("http://localhost:1502/Day/greet");
		QName qname=new QName("http://Day/","HelloWorldImplService");
		Service service=Service.create(url,qname);
		HelloWorld world=service.getPort(HelloWorld.class);
		System.out.println(world.greetings("sushma"));
		System.out.println(world.Add(4, 3));

	}

}
