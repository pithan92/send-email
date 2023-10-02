package br.com.infra.mailtrap;

import org.jboss.logging.Logger;

import br.com.adapters.EmailSenderGatWay;
import br.com.anotations.Email.EmailMailTrap;
import io.quarkus.arc.Unremovable;
import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import io.quarkus.mailer.MailerName;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@EmailMailTrap
@Unremovable
@ApplicationScoped
public class MailTrapEmailSender implements EmailSenderGatWay {

	@Inject
	Logger LOG;

	@Inject
	@MailerName("mail-trap") 
	Mailer mailer;

	@Override
	public void sendEmail(String to, String subject, String body) {
		LOG.info("Sending email to: " + to);

		mailer.send(Mail.withText(to, subject, body));

		LOG.info("Email sent successfully");

	}

}
