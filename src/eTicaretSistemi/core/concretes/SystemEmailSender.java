package eTicaretSistemi.core.concretes;

import eTicaretSistemi.core.abstracts.EmailSender;
import eTicaretSistemi.entities.concretes.User;

public class SystemEmailSender implements EmailSender {
	
	@Override
	public void sendEmail(String message, User user) {
		System.out.println(user.getEmailAdress() + " Mailine Mail Gönderildi.");
	}

}
