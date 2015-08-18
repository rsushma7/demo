package Day;

import javax.jws.WebService;

@WebService(endpointInterface="Day.HelloWorld")
//Service Implementaion Class
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String greetings(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name;
	}

	@Override
	public int Add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
