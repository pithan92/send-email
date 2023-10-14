package br.com;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import br.com.core.EmailRequest;
import br.com.core.EmailSenderStrategy;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;

@QuarkusTest
public class EmailSenderResourceTest {

	@Test
	public void testSendEmailMailTrap() {
		var mailTrapRequest = new EmailRequest("to@to.com", "Hello Dear!", "Hello Dear! Its a nice day",
				EmailSenderStrategy.MAILTRAP);
		given()
			.contentType(ContentType.JSON)
			.body(mailTrapRequest)
		.when()
			.post("/api/send-email")
		.then()
			.statusCode(200)
			.statusLine(is("HTTP/1.1 200 OK"));
	}
	
	@Test
	public void testSendEmailMemory() {
		var mailTrapRequest = new EmailRequest("to@to.com", "Hello Dear!", "Hello Dear! Its a nice day",
				EmailSenderStrategy.MEMORY);
		given()
			.contentType(ContentType.JSON)
			.body(mailTrapRequest)
		.when()
			.post("/api/send-email")
		.then()
			.statusCode(200)
			.statusLine(is("HTTP/1.1 200 OK"));
	}

}