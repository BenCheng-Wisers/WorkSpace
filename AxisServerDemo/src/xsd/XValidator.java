package xsd;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class XValidator {

    /**
     * @param args
     */
    public static void main(String[] args) throws SAXException, IOException {
    	String xsdPath="F:/workspace/AxisServerDemo/WebContent/xsd/Persons.xsd";
    	String xmlPath="F:/workspace/AxisServerDemo/WebContent/xsd/Persons.xml";
        System.out.println();
        // 1. Lookup a factory for the W3C XML Schema language
        SchemaFactory factory = 
            SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        
        // 2. Compile the schema. 
        // Here the schema is loaded from a java.io.File, but you could use 
        // a java.net.URL or a javax.xml.transform.Source instead.
        File schemaLocation = new File(xsdPath);
        Schema schema = factory.newSchema(schemaLocation);
    
        // 3. Get a validator from the schema.
        Validator validator = schema.newValidator();
        
        // 4. Parse the document you want to check.
        Source source = new StreamSource(xmlPath);
        
        // 5. Check the document
        try {
            validator.validate(source);
            System.out.println(xmlPath + " is valid.");
        }
        catch (SAXException ex) {
            System.out.println("Error: " + xmlPath + " is not valid because: ");
            System.out.println(ex.getMessage());
        }  
        
    }

}
class SimpleErrorHandler implements ErrorHandler{

    public void error(SAXParseException arg0) throws SAXException {
        System.out.printf("error=%s\n", arg0.getMessage());
    }

    public void fatalError(SAXParseException arg0) throws SAXException {
        System.out.printf("fatalError=%s\n", arg0.getMessage());
        
    }

    public void warning(SAXParseException arg0) throws SAXException {
        System.out.printf("warning=%s\n", arg0.getMessage());
        
    }
    
}
