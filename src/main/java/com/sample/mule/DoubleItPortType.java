package com.sample.mule;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2015-04-06T22:53:11.300+05:30
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://www.example.org/contract/DoubleIt", name = "DoubleItPortType")
@XmlSeeAlso({ObjectFactory.class})
public interface DoubleItPortType {

    @WebResult(name = "responseItem", targetNamespace = "")
    @RequestWrapper(localName = "DoubleIt", targetNamespace = "http://www.example.org/schema/DoubleIt", className = "com.sample.mule.DoubleIt")
    @WebMethod(operationName = "DoubleIt")
    @ResponseWrapper(localName = "DoubleItResponse", targetNamespace = "http://www.example.org/schema/DoubleIt", className = "com.sample.mule.DoubleItResponse")
    public com.sample.mule.ItemsToResponse doubleIt(
        @WebParam(name = "requestItem", targetNamespace = "")
        com.sample.mule.ItemsToProcess requestItem
    );
}