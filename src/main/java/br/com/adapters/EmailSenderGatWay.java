package br.com.adapters;

public interface EmailSenderGatWay {

	void sendEmail(String to, String subject, String body);
}
