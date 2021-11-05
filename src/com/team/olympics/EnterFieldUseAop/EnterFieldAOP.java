package com.team.olympics.EnterFieldUseAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Gu HungJou
 * @date: 2021/11/4 23:05
 * Describe:
 */
public class EnterFieldAOP {
    public static void enterAOP(String name) throws Exception {
        enterField enterField=new enterField();
        //参数：类加载器，接口数组，处理器
        //代理逻辑编写
//参数：代理对象，代理对象调用的方法（封装成对象），调用方法时传递的实际参数
        enterFieldInterface proxy_enter = (enterFieldInterface) Proxy.newProxyInstance(enterField.getClass().getClassLoader(), enterField.getClass().getInterfaces(), (proxy, method, args) -> {
            //1.增强参数
            if(method.getName().equals("enter")){
                String na= (String) args[0];
                System.out.println(na+"进行48小时内的核酸检测...");

                String o = (String) method.invoke(enterField, na);
                System.out.println(o+"并领取了观赛专用口罩...");
                System.out.println(na+"全程受监督佩戴口罩...");
                //2.增强返回值
                return "";
            }
            else {
                return method.invoke(enterField, args);
            }
        });
        String computer=proxy_enter.enter(name);
        System.out.println(computer);
    }
}
