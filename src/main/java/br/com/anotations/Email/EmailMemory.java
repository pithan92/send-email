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
public @interface EmailMemory {

	public static class EmailMemoryLiteral extends AnnotationLiteral<EmailMemory> implements EmailMemory {
		public static final EmailMemory INSTANCE = of();
		public static EmailMemoryLiteral of() {
			return new EmailMemoryLiteral();
		}
	}
}
