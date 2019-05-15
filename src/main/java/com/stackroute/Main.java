/*
From the constructor-injection branch of spring-xml-demo repo create a autowire-xml branch. For the Movie bean, delete the constructor based object injection in the bean definition file (beans.xml) that injects an Actor bean. Use autowire byName in the Movie bean to inject an Actor bean. Run the application. Create another Movie bean and try autowire byType. Run the application and note the exception thrown. Fix the Movie bean by removing autowire byType and using constructor injection instead. Push the code to autowire-xml branch. 
 */
package com.stackroute;

import com.stackroute.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Task-1 using Application context
        ApplicationContext bean=new ClassPathXmlApplicationContext("beans.xml");
        
        Movie movie=(Movie)bean.getBean("movie1");
        
        System.out.println(movie.toString());

        Movie movi31=(Movie)applicationContext3.getBean("movie2");
        
        System.out.println(movie3.toString());

    }
}
