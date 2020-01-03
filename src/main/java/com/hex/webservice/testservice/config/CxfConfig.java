package com.hex.webservice.testservice.config;

import com.hex.webservice.testservice.IHelloService;
import com.hex.webservice.testservice.IHelloService2;
import com.hex.webservice.testservice.impl.HelloServiceImpl2;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @Date 2020-1-2 16:21
 * @Author hex
 * @Desc
 */
@Configuration
public class CxfConfig {
    @Autowired
    private IHelloService helloService;

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    /**定义webservice访问路径,主路径在application.properties中配置
     * @date 2020-1-2
     * @params  []
     * @return  javax.xml.ws.Endpoint
     * @author hex
     */
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), helloService);
        endpoint.publish("/api");
        return endpoint;
    }

    @Bean
    public IHelloService2 helloService2() {
        return new HelloServiceImpl2();
    }
    @Bean
    public Endpoint endpoint1() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), helloService2());
        endpoint.publish("/api2");
        return endpoint;
    }

}
