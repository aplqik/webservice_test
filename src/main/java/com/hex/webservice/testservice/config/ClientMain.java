package com.hex.webservice.testservice.config;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

/**
 * @Date 2020-1-3 12:51
 * @Author hex
 * @Desc
 */
public class ClientMain {
    public static void main(String[] args) {
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8060/hex/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects;
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("sayHello", "hex");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}
