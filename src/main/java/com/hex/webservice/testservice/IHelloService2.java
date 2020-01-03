package com.hex.webservice.testservice;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface IHelloService2 {

    String sayHello(String name);
}
