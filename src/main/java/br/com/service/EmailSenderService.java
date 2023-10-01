package br.com.service;

import br.com.adapters.EmailSenderGatWay;
import br.com.adapters.factorys.EmailSenderFactory;
import br.com.core.EmailSenderStrategy;
import br.com.core.SendEmailUseCase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmailSenderService implements SendEmailUseCase {

	@Override
	public void sendEmail(String to, String subject, String body) {
		EmailSenderGatWay emailSenderGatWay = selectStrategy(EmailSenderStrategy.MAILTRAP);
		emailSenderGatWay.sendEmail(to, subject, body);
	}

	private EmailSenderGatWay selectStrategy(EmailSenderStrategy strategy) {
		return EmailSenderFactory.delivery(strategy);
	}

}
