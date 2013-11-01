package samples.attachments.handler;

import org.apache.axis.AxisFault;
import org.apache.axis.Message;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

public class TestHandler extends BasicHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void invoke(MessageContext msgContext) throws AxisFault {
		// TODO Auto-generated method stub
		Message requestMessage = msgContext.getRequestMessage();
		Message responseMessage = new Message(requestMessage.getSOAPEnvelope());
        String[] fooHeader = requestMessage.getMimeHeaders().getHeader("foo");
        if (fooHeader != null) {
            responseMessage.getMimeHeaders().addHeader("foo", fooHeader[0]);
        }
	//	msgContext.setResponseMessage(responseMessage);

	}

}
