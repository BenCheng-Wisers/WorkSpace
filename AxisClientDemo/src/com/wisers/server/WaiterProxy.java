package com.wisers.server;

public class WaiterProxy implements com.wisers.server.Waiter {
  private String _endpoint = null;
  private com.wisers.server.Waiter waiter = null;
  
  public WaiterProxy() {
    _initWaiterProxy();
  }
  
  public WaiterProxy(String endpoint) {
    _endpoint = endpoint;
    _initWaiterProxy();
  }
  
  private void _initWaiterProxy() {
    try {
      waiter = (new com.wisers.server.WaiterServiceLocator()).getWaiter();
      if (waiter != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)waiter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)waiter)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (waiter != null)
      ((javax.xml.rpc.Stub)waiter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.wisers.server.Waiter getWaiter() {
    if (waiter == null)
      _initWaiterProxy();
    return waiter;
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (waiter == null)
      _initWaiterProxy();
    return waiter.sayHello(name);
  }
  
  public java.lang.String sayNo(java.lang.String name) throws java.rmi.RemoteException{
    if (waiter == null)
      _initWaiterProxy();
    return waiter.sayNo(name);
  }
  
  public void eat(java.lang.String food) throws java.rmi.RemoteException{
    if (waiter == null)
      _initWaiterProxy();
    waiter.eat(food);
  }
  
  
}