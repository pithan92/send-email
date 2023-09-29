package br.com.infra.memory;

import org.jboss.logging.Logger;

import br.com.adapters.EmailSenderGatWay;
import jakarta.inject.Inject;


public class MemoryEmailSender implements EmailSenderGatWay {

	@Inject
	Logger LOG;

	@Override
	public void sendEmail(String to, String subject, String body) {
		LOG.info("send email1");

	}

}
