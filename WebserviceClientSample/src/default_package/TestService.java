/**
 * TestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package default_package;

public interface TestService extends javax.xml.rpc.Service {
    public java.lang.String getTestPortAddress();

    public default_package.Test getTestPort() throws javax.xml.rpc.ServiceException;

    public default_package.Test getTestPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
