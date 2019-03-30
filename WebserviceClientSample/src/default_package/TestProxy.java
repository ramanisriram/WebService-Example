package default_package;

public class TestProxy implements default_package.Test {
	private String _endpoint = null;
	private default_package.Test test = null;

	public TestProxy() {
		_initTestProxy();
	}

	public TestProxy(String endpoint) {
		_endpoint = endpoint;
		_initTestProxy();
	}

	private void _initTestProxy() {
		try {
			test = (new default_package.TestServiceLocator()).getTestPort();
			if (test != null) {
				if (_endpoint != null)
					((javax.xml.rpc.Stub) test)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									_endpoint);
				else
					_endpoint = (String) ((javax.xml.rpc.Stub) test)
							._getProperty("javax.xml.rpc.service.endpoint.address");
			}

		} catch (javax.xml.rpc.ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return _endpoint;
	}

	public void setEndpoint(String endpoint) {
		_endpoint = endpoint;
		if (test != null)
			((javax.xml.rpc.Stub) test)._setProperty(
					"javax.xml.rpc.service.endpoint.address", _endpoint);

	}

	public default_package.Test getTest() {
		if (test == null)
			_initTestProxy();
		return test;
	}

	public java.lang.String sayHello(java.lang.String arg0)
			throws java.rmi.RemoteException {
		if (test == null)
			_initTestProxy();
		return test.sayHello(arg0);
	}

	public static void main(String args[]) {
		try {
			TestProxy abc = new TestProxy();
			System.out.println(abc.sayHello("Sriram"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}