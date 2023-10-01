package br.com.resource;

import br.com.core.EmailRequest;
import br.com.service.EmailSenderService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("")
public class EmailSenderResource {
	
	@Inject
	private final EmailSenderService emailSenderService;

	public EmailSenderResource(EmailSenderService emailSenderService) {
		this.emailSenderService = emailSenderService;
	}

	@POST()
	@Path("send-email")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ResponseBuilder sendEmail(EmailRequest emailRequest) {
		this.emailSenderService.sendEmail(emailRequest.getTo(), emailRequest.getSubject(), emailRequest.getBody());
		return Response.ok("send email");
	}
}
