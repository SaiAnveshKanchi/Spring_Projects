package spring.start.aop.springaop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.start.aop.springaop.data.Dao2;

@Service
public class Bussiness2 {
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething() {
		return dao2.retriveSomething();
	}
	
}
