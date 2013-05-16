package com.hmkcode.spring.mybatis;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hmkcode.spring.mybatis.service.Service;
import com.hmkcode.spring.mybatis.vo.Parent;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring-config.xml")
public class AppTest {

	private static Log log = LogFactory.getLog(AppTest.class);
	
	@Autowired private Service service;


	@Test
	public void testSelectAllParent(){
		log.info("testing selectAllParent()...");
		
		List<Parent> parents = service.selectAllParent();
		
		assertNotNull("failure - parents is null", parents);
		
		assertTrue("failure - expected 3 parents", parents.size() == 3);

		assertTrue("failure - expected 2 children", parents.get(0).getChildren().size() == 2);

		log.info(parents);
	}
	
	@Test
	public void testSelectParent(){
		log.info("testing selectParent()...");
		int parentId = 2;
		String parentName = "parent-2";
		Parent parent = service.selectParent(parentId);
		
		assertNotNull("failure - parents is null", parent);
		
		assertTrue("failure - parent name is not right", parent.getParentName().equals(parentName));

		assertTrue("failure - expected 1 child", parent.getChildren().size() == 1);
	}
	
	@Test
	public void testInsertParent(){
		
		log.info("testing insertParent()...");
		
		int parentId = 4;
		String parentName = "parent-4 inserted";
		
		Parent parent = new Parent();
		parent.setParentName(parentName);
		
		service.insertParent(parent);
		
		parent = service.selectParent(4);
		
		assertNotNull("failure - parents is null", parent);
		
		assertTrue("failure - parent name is not right", parent.getParentName().equals(parentName));

		assertTrue("failure - expected 0 child", parent.getChildren().size() == 0);
		
	}
}
