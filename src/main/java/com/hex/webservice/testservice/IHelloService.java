package com.hex.webservice.testservice;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**SEI<Service Endpoint Interface 发布的服务接口>
 * bindingType:支持soap12协议
 * @date 2020-1-2
 * @params
 * @return
 * @author hex
 */
@WebService(targetNamespace = "http://testservice.webservice.hex.com/")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public interface IHelloService {
    String sayHello(String name);
}
