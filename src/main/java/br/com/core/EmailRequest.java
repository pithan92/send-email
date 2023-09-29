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
}
