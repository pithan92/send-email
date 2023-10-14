package br.com.core.exceptions;

public class EmailServiceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmailServiceException(String message) {
		super(message);
	}

	public EmailServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
