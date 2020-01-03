package com.hex.webservice.testservice.impl;

import com.hex.webservice.testservice.IHelloService2;
import org.springframework.stereotype.Component;

/**
 * @Date 2020-1-2 16:32
 * @Author hex
 * @Desc
 */
@Component
public class HelloServiceImpl2 implements IHelloService2 {
    @Override
    public String sayHello(String name) {
        return "hello2"+name;
    }
}
