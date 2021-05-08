package eTicaretSistemi.core.abstracts;

import eTicaretSistemi.entities.concretes.User;

public interface EmailSender {
	void sendEmail(String message, User user);
}
