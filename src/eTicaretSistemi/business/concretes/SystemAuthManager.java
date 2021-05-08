package eTicaretSistemi.business.concretes;

import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.abstracts.ValidationService;
import eTicaretSistemi.core.abstracts.EmailSender;
import eTicaretSistemi.entities.concretes.User;

public class SystemAuthManager extends BaseAuthServiceManager{

	public SystemAuthManager(ValidationService validationService, EmailSender emailSender, UserService userService) {
		super(validationService, emailSender, userService);
	}

	@Override
	public void signIn(String email, String password) {
		if(super.validationService.checkLoginInformations(email, password)) {
			System.out.println("Giriþ baþarýlý.");
		}else {
			System.out.println("Sistem böyle bir kullanýcý bulunmamakta.");
		}
		
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


}
