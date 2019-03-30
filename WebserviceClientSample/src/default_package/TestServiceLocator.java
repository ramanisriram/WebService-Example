/**
 * TestServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package default_package;

public class TestServiceLocator extends org.apache.axis.client.Service implements default_package.TestService {

    public TestServiceLocator() {
    }


    public TestServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TestServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TestPort
    private java.lang.String TestPort_address = "http://localhost/WebServiceSample/services/test";

    public java.lang.String getTestPortAddress() {
        return TestPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TestPortWSDDServiceName = "TestPort";

    public java.lang.String getTestPortWSDDServiceName() {
        return TestPortWSDDServiceName;
    }

    public void setTestPortWSDDServiceName(java.lang.String name) {
        TestPortWSDDServiceName = name;
    }

    public default_package.Test getTestPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TestPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTestPort(endpoint);
    }

    public default_package.Test getTestPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            default_package.TestServiceSoapBindingStub _stub = new default_package.TestServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTestPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTestPortEndpointAddress(java.lang.String address) {
        TestPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (default_package.Test.class.isAssignableFrom(serviceEndpointInterface)) {
                default_package.TestServiceSoapBindingStub _stub = new default_package.TestServiceSoapBindingStub(new java.net.URL(TestPort_address), this);
                _stub.setPortName(getTestPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TestPort".equals(inputPortName)) {
            return getTestPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://default_package/", "TestService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://default_package/", "TestPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TestPort".equals(portName)) {
            setTestPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
