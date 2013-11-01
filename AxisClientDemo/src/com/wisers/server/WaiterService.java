/**
 * WaiterService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wisers.server;

public interface WaiterService extends javax.xml.rpc.Service {
    public java.lang.String getWaiterAddress();

    public com.wisers.server.Waiter getWaiter() throws javax.xml.rpc.ServiceException;

    public com.wisers.server.Waiter getWaiter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
