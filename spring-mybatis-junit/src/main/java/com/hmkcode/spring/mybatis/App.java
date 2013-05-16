package com.hmkcode.spring.mybatis;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hmkcode.spring.mybatis.service.Service;
import com.hmkcode.spring.mybatis.vo.Child;
import com.hmkcode.spring.mybatis.vo.Parent;


public class App 
{
	private static Log log = LogFactory.getLog(App.class);

    public static void main( String[] args )
    {

    	ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
    	Service service = (Service) cxt.getBean("service");
		
    	log.info("Running App...");

    	//( 1 ) SELECT ALL PARENTS
    	System.out.println("( 1 ) selectAllParent()");
    	List<Parent> parents = service.selectAllParent();
    	System.out.println("-> "+parents);
    	
    	System.out.println("****************************************************");
    	
    	//( 2 ) SELECT ONE PARENT
    	System.out.println("( 2 ) selectParent(2)");
    	Parent parent = service.selectParent(2);
    	System.out.println("-> "+parent);
    	
    	System.out.println("****************************************************");

    	//( 3 ) INSERT ONE PARENT
    	System.out.println("( 3 ) insertParent(parent)");
    	parent = new Parent();
    	parent.setParentName("parent-4 inserted");
    	service.insertParent(parent);
    	System.out.println("-> parent inserted");
    	
    	System.out.println("****************************************************");
    	
    	//( 4 ) SELECT ALL CHILDREN OF A GIVEN PARENT
    	System.out.println("( 4 ) selectAllChildren(parentId)");
    	List<Child> children = service.selectAllChildren(1);
    	System.out.println("-> "+children);
    	
    	System.out.println("****************************************************");

    	//( 5 ) SELECT ONE CHILD
    	System.out.println("( 5 ) selectChild(1)");
    	Child child = service.selectChild(1);
    	System.out.println("-> "+child);
    	
    	System.out.println("****************************************************");

    	//( 6 ) INSERT ONE CHILD
    	System.out.println("( 6 ) selectAllChildren(parentId)");
    	child = new Child();
    	child.setChildName("child-4 inserted");
    	child.setParentId(2);
    	service.insertchild(child);
    	System.out.println("-> child inserted");
    	
    	System.out.println("****************************************************");

    	//( 7 ) SELECT ALL PARENTS (AGAIN!)
    	System.out.println("( 7 ) selectAllParent()");
    	parents = service.selectAllParent();
    	System.out.println("-> "+parents);
    	
    }
}
