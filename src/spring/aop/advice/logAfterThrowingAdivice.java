package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class logAfterThrowingAdivice implements ThrowsAdvice{
	
	public  void afterThrowing(IllegalArgumentException e) throws Throwable {
		
		System.out.println("���ܰ� �߻��Ͽ����ϴ�, : "+e.getMessage());
		
	}

}
