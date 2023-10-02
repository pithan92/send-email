package br.com.anotations.Email;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.enterprise.util.AnnotationLiteral;
import jakarta.inject.Qualifier;

@Qualifier
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
public @interface EmailMailTrap {

	public static class EmailMailTrapLiteral extends AnnotationLiteral<EmailMailTrap> implements EmailMailTrap {
		public static final EmailMailTrap INSTANCE = of();
		public static EmailMailTrapLiteral of() {
			return new EmailMailTrapLiteral();
		}
	}
}
