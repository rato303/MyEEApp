package my.app.logging;

import java.lang.reflect.Method;

import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.slf4j.Logger;

@Interceptor
@Dependent
@Logging
@Priority(Interceptor.Priority.APPLICATION)
public class LoggingInterceptor {

	@Inject
	private Logger logger;

	@AroundInvoke
	public Object invoke(InvocationContext ic) throws Exception {

		final String classAndMethod = this.getClassAndMethodName(ic);

		this.logger.info(classAndMethod + " start.");

		Object ret = null;

		try {
			ret = ic.proceed();
		} catch (Exception e) {
			this.logger.error("エラー", e);
			throw e;
		}

		this.logger.info(classAndMethod + " end.");

		return ret;
	}

	private String getClassAndMethodName(final InvocationContext ic) {
		final Class<?> targetClass = ic.getTarget().getClass().getSuperclass();
		final Method invokeMethod = ic.getMethod();
		final String targetClassName = targetClass.getName();
		final String invokeMethodName = invokeMethod.getName();
		return targetClassName + "#" + invokeMethodName;
	}

}
