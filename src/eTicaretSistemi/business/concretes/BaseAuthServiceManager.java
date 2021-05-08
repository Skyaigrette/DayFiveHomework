package eTicaretSistemi.business.concretes;

import eTicaretSistemi.business.abstracts.AuthService;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.abstracts.ValidationService;
import eTicaretSistemi.core.abstracts.EmailSender;
import eTicaretSistemi.entities.concretes.User;

public abstract class BaseAuthServiceManager implements AuthService{
	protected ValidationService validationService;
	private EmailSender emailSender;
	private UserService userService;
	public BaseAuthServiceManager(ValidationService validationService, EmailSender emailSender, UserService userService) {
		this.validationService = validationService;
		this.emailSender = emailSender;
		this.userService = userService;
	}
	
	@Override
	public void signUp(User user) {
		if(validationService.checkRegisterInformations(user)) {
			emailSender.sendEmail("verification message", user);
			userService.addUser(user);
			System.out.println("Mailinize doðrulama linki gönderildi.");
		}else {
			System.out.println("Girdiðiniz bilgiler kriterlere uymamaktadýr. Lütfen tekrar deneyiniz.");
		}
	}

	public abstract void signIn(String email, String password);

}
