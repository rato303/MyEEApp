package my.app.logging;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.slf4j.Logger;

@Dependent
public class LoggerFactory {

	@Produces
	@Dependent
	public Logger getLogger(InjectionPoint ip) {
		return org.slf4j.LoggerFactory.getLogger(ip.getMember().getDeclaringClass());
	}

}
