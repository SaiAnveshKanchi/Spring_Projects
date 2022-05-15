package spring.start.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* spring.start.aop.springaop.*.*.*(..))")
	public void before(JoinPoint joinPoint){
		logger.info(" Aop before call - {}",joinPoint);
	}
}
