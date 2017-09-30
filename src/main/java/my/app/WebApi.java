package my.app;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;

import my.app.logging.Logging;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Stereotype
@RequestScoped
@Logging
public @interface WebApi {
}
