package com.veera.springAOP.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("getPintCuts()")
	public void loggingAdvice()
	{
		System.out.println("Advice is run. get method is called");
	}
	
	
	@After("getPintCuts()")
	public void loggingAdviceAfter()
	{
		System.out.println("Advice is run after. get method is called");
	}
	
	@Pointcut("within(com.veera.springAOP..*)")
	public void getPintCuts() {}
	
	@Pointcut("within(com.veera.springAOP.model.*())")
	public void getPintCutsOfSpecificClassWithNoArg() {}
	
	
	@Pointcut("within(com.veera.springAOP.model.*(*))")
	public void getPintCutsOfSpecificClassWithArg() {}
	
	
	@Pointcut("within(com.veera.springAOP.model.*(..))")
	public void getPintCutsOfSpecificClassWithOrWithOutArg() {}
	
	//you can combain to pointcuts like below
	
	@Before("getPintCuts() && getPintCutsOfSpecificClassWithNoArg")
	public void loggingAdviceTwo()
	{
		System.out.println("Advice is run. get method is called");
	}
	
	
	
	
	///if you want display name of method or class
	@Before("getPintCuts()")
	public void loggingAdviceWithJointPonit(Joinpoint joinpoint)
	{
		System.out.println("Advice is run. get method is called" +joinpoint.getClass());
	}
	
	//this method will help you log the error when string arg is passed
	@Before("args(String)")
	public void AdviceToCall(Joinpoint joinpoint)
	{
		System.out.println("Advice is run. string arg was passed");
	}
	
	
	//this method will help you log the error when string arg is passed and to know the value of arg passed
	@Before("args(name)")
	public void AdviceToCall1(String name)
	{
		System.out.println("Advice is run. string arg was passed and value is" +name);
	}

}
