package mail;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import entity.Cliente;

public class EnviarEmail {

	public static final String HOSTNAME = "smtp.gmail.com";
	public static final String USERNAME = "cotiexemplo@gmail.com";
	public static final String PASSWORD = "@coticoti@";

	public static Email conectaEmail() throws EmailException {
		HtmlEmail mail = new HtmlEmail();
		mail.setHostName(HOSTNAME);
		mail.setSmtpPort(465);
		mail.setAuthentication(USERNAME, PASSWORD);
		mail.setTLS(true);
		mail.setSSL(true);
		mail.setFrom(USERNAME);
		return mail;
	}

	public static String enviarEmail(Cliente c) throws Exception {
		for (int i = 0; i < 2; i++) {
			HtmlEmail email = new HtmlEmail();
			email = (HtmlEmail) conectaEmail();
			email.setSubject("Seja Bem vindo ao Plano de saúde..." + i);
			email.addTo(c.getEmail());
			email.setCharset("utf-8");
			email.setMsg("Você acaba de ganhar um mês gratuito!");
			email.send();
		}
		return "Email enviado Com sucesso";
	}

	public static void main(String[] args) {
		Cliente c = new Cliente(1, "Hugo", "contatohugolopes@gmail.com", 100., "Jamil");

		try {
			EnviarEmail.enviarEmail(c);
			System.out.println("OK - Enviado com Sucesso");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
