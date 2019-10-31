package com.redhat.batigerteam.examples;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class SoapClientApp
{
    public static void main( String[] args )
    {
        try {
            URL url = new URL("http://localhost:8080/sample-webservice/SampleWebService?wsdl");
            SampleWebServiceService service = new SampleWebServiceService(url);
            SampleWebService port = service.getSampleWebServicePort();
            String response = port.sayHello("Dave.");
            System.out.println("Response: "+response);
        } catch (MalformedURLException e) {
          e.printStackTrace();
        };
    }
}
