/**
 * Waiter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wisers.server;

public interface Waiter extends java.rmi.Remote {
    public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String sayNo(java.lang.String name) throws java.rmi.RemoteException;
    public void eat(java.lang.String food) throws java.rmi.RemoteException;
}
