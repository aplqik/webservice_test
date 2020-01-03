package com.hex.webservice.testservice.impl;

import com.hex.webservice.testservice.IHelloService;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**实现类必须制定命名空间和sei接口
 * @Date 2020-1-2 15:29
 * @Author hex
 * @Desc
 */
@Component
@WebService(targetNamespace = "http://testservice.webservice.hex.com/",
    endpointInterface = "com.hex.webservice.testservice.IHelloService"
)
public class HelloServiceImpl implements IHelloService {
    @Override
    @WebMethod
    public String sayHello(String name) {
        return "hello111"+name;
    }
}
