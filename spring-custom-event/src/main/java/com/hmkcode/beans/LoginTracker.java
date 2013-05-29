package com.hmkcode.beans;

import org.springframework.context.ApplicationListener;
import com.hmkcode.event.LoginEvent;

public class LoginTracker implements ApplicationListener<LoginEvent>  {

  @Override
	public void onApplicationEvent(LoginEvent event) {
		
		
		System.out.println("\n"+((Login)event.getSource()).getUsername()+" logged-in @ "+event.getDate()+"\n");
		

		
	}

}
