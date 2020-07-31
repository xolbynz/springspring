package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdivce implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Object result=invocation.proceed();
		
		
		long end = System.currentTimeMillis();
		String message= (end-start) +"ms �ð��� �ɷ�����" ;
		System.out.println(message);
		return result;
		
	}

}
