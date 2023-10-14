package br.com.core;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {
	@Schema(required = true, example = "to@to.com")
	private String to;
	@Schema(required = true, example = "Hello Dear!")
	private String subject;
	@Schema(required = true, example = "Hello Dear! Its a nice day")
	private String body;
	@Schema(required = true, example = "MAILTRAP")
	private EmailSenderStrategy sender;

	public EmailRequest() {
	}

	public EmailRequest(String to, String subject, String body, EmailSenderStrategy sender) {
		this.to = to;
		this.subject = subject;
		this.body = body;
		this.sender = sender;
	}

}
