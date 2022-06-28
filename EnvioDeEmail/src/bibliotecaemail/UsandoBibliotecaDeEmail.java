package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator( "romaryjane", "Romariodev@"));
		email.setSSLOnConnect(true);
		email.setFrom("romaryjane@hotmail.com");
		email.setSubject("TestMail");
		email.setMsg("se teste realizado com sucesso!)");
		email.addTo("romariodev53@gmail.com");
		email.send();
		
		System.out.println("Fim..");

	}

}
