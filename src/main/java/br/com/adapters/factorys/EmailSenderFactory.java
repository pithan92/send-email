package br.com.adapters.factorys;

import br.com.adapters.EmailSenderGatWay;
import br.com.core.EmailSenderStrategy;
import jakarta.enterprise.inject.spi.CDI;

public class EmailSenderFactory {
	public static EmailSenderGatWay delivery(EmailSenderStrategy strategy) {
		return CDI.current().select(EmailSenderGatWay.class, strategy.getQualifier()).get();
	}

}
