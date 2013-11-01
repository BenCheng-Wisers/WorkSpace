package com.wisers.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import com.wisers.server.WaiterSoapBindingStub;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "http://localhost:9090/AxisServerDemo/services/Waiter?wsdl";
		try {
			WaiterSoapBindingStub stub = new WaiterSoapBindingStub(new java.net.URL(url),null);
			System.out.println(stub.sayHello("bencheng"));
			System.out.println(stub.sayNo("bencheng"));
			stub.eat("apple");
			
			Service  service = new Service(); //A new axis Service.

	        Call     call    = (Call) service.createCall();
	        call.setOperationName(new QName("http://localhost:9090/AxisServerDemo/services/TestService?wsdl","test"));
	        call.setTargetEndpointAddress(new URL("http://localhost:9090/AxisServerDemo/services/TestService?wsdl"));
	        String result=(String)call.invoke(new Object[]{});
	        System.out.println("result="+result);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
