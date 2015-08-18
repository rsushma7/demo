package Day;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style=Style.DOCUMENT)
//Service End Point Interface
public interface HelloWorld {
	@WebMethod
public String greetings(String name);
	@WebMethod
public int Add(int a,int b);
}
