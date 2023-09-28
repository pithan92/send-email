package br.com.service;

import br.com.core.SendEmailUseCase;
import br.com.adapters.EmailSenderGatWay;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class EmailSenderService implements SendEmailUseCase {
	
	@Inject
	private final EmailSenderGatWay emailSenderGatWay;

	public EmailSenderService(EmailSenderGatWay emailSenderGatWay) {
		this.emailSenderGatWay = emailSenderGatWay;
	}

	@Override
	public void sendEmail(String to, String subject, String body) {
		this.emailSenderGatWay.sendEmail(to, subject, body);
	}

}
