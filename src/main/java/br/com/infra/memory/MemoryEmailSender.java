package br.com.infra.memory;

import org.jboss.logging.Logger;

import br.com.adapters.EmailSenderGatWay;
import br.com.anotations.Email.EmailMemory;
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@EmailMemory
@Unremovable
@ApplicationScoped
public class MemoryEmailSender implements EmailSenderGatWay {

	@Inject
	Logger LOG;

	@Override
	public void sendEmail(String to, String subject, String body) {
		LOG.info("send email1");

	}

}
