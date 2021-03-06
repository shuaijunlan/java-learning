package com.sh.test;

import com.sh.hello.HelloWorld;
import com.sh.mvcdemo.controller.CourseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


/**
 * Created by Mr SJL on 2016/11/26.
 *
 * @Author Junlan Shuai
 */
public class App
{

    private static Logger log = LoggerFactory.getLogger(App.class);
    private static ApplicationContext context;
    public static void main(String[] args)
    {
//        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloBean1");
//        obj.printHello();
//
//        System.out.println("----------------------------");


//        getAllNames(a);


//        Resource res = new ClassPathResource("SpringBeans.xml");
//        XmlBeanFactory bf = new XmlBeanFactory(res);
        // 记录debug级别的信息
        log.debug("This is debug message.");
        // 记录info级别的信息
        log.info("This is info message.");
        // 记录error级别的信息
        log.error("This is error message.");
        FileSystemXmlApplicationContext fs = new FileSystemXmlApplicationContext("E:\\1-mV\\Spring\\src\\main\\resources\\SpringBeans.xml");
        HelloWorld obj1 = (HelloWorld) fs.getBean("helloBean1");
        obj1.printHello();


    }
}
