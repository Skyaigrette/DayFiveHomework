package eTicaretSistemi.business.concretes;

import eTicaretSistemi.business.abstracts.AuthService;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.abstracts.ValidationService;
import eTicaretSistemi.core.abstracts.EmailSender;
import eTicaretSistemi.entities.concretes.User;

public abstract class BaseAuthServiceManager implements AuthService{
	protected ValidationService validationService;
	protected EmailSender emailSender;
	protected UserService userService;
	public BaseAuthServiceManager(ValidationService validationService, EmailSender emailSender, UserService userService) {
		this.validationService = validationService;
		this.emailSender = emailSender;
		this.userService = userService;
	}
	
	@Override
	public abstract void signUp(User user);

	public abstract void signIn(String email, String password);

}
