
package com.sample.mule;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-04-06T22:53:11.283+05:30
 * Generated source version: 2.5.1
 * 
 */
public final class DoubleItPortType_DoubleItPort_Client {

    private static final QName SERVICE_NAME = new QName("http://www.example.org/contract/DoubleIt", "DoubleItService");

    private DoubleItPortType_DoubleItPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = DoubleItService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        DoubleItService ss = new DoubleItService(wsdlURL, SERVICE_NAME);
        DoubleItPortType port = ss.getDoubleItPort();  
        
        {
        System.out.println("Invoking doubleIt...");
        com.sample.mule.ItemsToProcess _doubleIt_requestItem = null;
        com.sample.mule.ItemsToResponse _doubleIt__return = port.doubleIt(_doubleIt_requestItem);
        System.out.println("doubleIt.result=" + _doubleIt__return);


        }

        System.exit(0);
    }

}
