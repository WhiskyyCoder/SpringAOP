package com.test.SpringAOP_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.Beans.CarDAO;
import com.test.Beans.MemberDAO;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        ctx.getBean("car",CarDAO.class).addCar();
        ctx.getBean("member",MemberDAO.class).addData();
        ctx.getBean("member",MemberDAO.class).deleteData();
        ctx.getBean("member",MemberDAO.class).addData("text");
    }
}
