package br.com.core;

import java.lang.annotation.Annotation;

import br.com.anotations.Email.EmailMailTrap;
import br.com.anotations.Email.EmailMemory;
import br.com.infra.mailtrap.MailTrapEmailSender;

public enum EmailSenderStrategy {
	MAILTRAP {
		@Override
		public Annotation getQualifier() {
			return EmailMailTrap.EmailMailTrapLiteral.INSTANCE;
		}
	},
	MEMORY {
		@Override
		public Annotation getQualifier() {
			return EmailMemory.EmailMemoryLiteral.INSTANCE;
		}
	};

	public abstract Annotation getQualifier();
}
