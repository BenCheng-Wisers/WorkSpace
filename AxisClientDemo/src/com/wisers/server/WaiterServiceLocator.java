/**
 * WaiterServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wisers.server;

public class WaiterServiceLocator extends org.apache.axis.client.Service implements com.wisers.server.WaiterService {

    public WaiterServiceLocator() {
    }


    public WaiterServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WaiterServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Waiter
    private java.lang.String Waiter_address = "http://localhost:9090/AxisServerDemo/services/Waiter";

    public java.lang.String getWaiterAddress() {
        return Waiter_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WaiterWSDDServiceName = "Waiter";

    public java.lang.String getWaiterWSDDServiceName() {
        return WaiterWSDDServiceName;
    }

    public void setWaiterWSDDServiceName(java.lang.String name) {
        WaiterWSDDServiceName = name;
    }

    public com.wisers.server.Waiter getWaiter() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Waiter_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWaiter(endpoint);
    }

    public com.wisers.server.Waiter getWaiter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.wisers.server.WaiterSoapBindingStub _stub = new com.wisers.server.WaiterSoapBindingStub(portAddress, this);
            _stub.setPortName(getWaiterWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWaiterEndpointAddress(java.lang.String address) {
        Waiter_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.wisers.server.Waiter.class.isAssignableFrom(serviceEndpointInterface)) {
                com.wisers.server.WaiterSoapBindingStub _stub = new com.wisers.server.WaiterSoapBindingStub(new java.net.URL(Waiter_address), this);
                _stub.setPortName(getWaiterWSDDServiceName());
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
        if ("Waiter".equals(inputPortName)) {
            return getWaiter();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://server.wisers.com", "WaiterService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://server.wisers.com", "Waiter"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Waiter".equals(portName)) {
            setWaiterEndpointAddress(address);
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
