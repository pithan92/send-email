package br.com.service;

import br.com.adapters.EmailSenderGatWay;
import br.com.adapters.factorys.EmailSenderFactory;
import br.com.core.EmailRequest;
import br.com.core.EmailSenderStrategy;
import br.com.core.SendEmailUseCase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmailSenderService implements SendEmailUseCase {

	@Override
	public void sendEmail(EmailRequest emailRequest) {
		EmailSenderGatWay emailSenderGatWay = selectStrategy(emailRequest.getSender());
		emailSenderGatWay.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
	}

	private EmailSenderGatWay selectStrategy(EmailSenderStrategy strategy) {
		return EmailSenderFactory.delivery(strategy);
	}

}
