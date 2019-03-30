import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://default_package/", portName = "TestPort", serviceName = "TestService")
public class Test {
	public String sayHello(@WebParam(name = "arg0") String name) {
		return "hello Mr. " + name + " Sir";
	}
}