package eTicaretSistemi.business.concretes;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.abstracts.ValidationService;
import eTicaretSistemi.core.abstracts.EmailSender;
import eTicaretSistemi.entities.concretes.User;
import eTicaretSistemi.google.GoogleAuthManager;

public class GoogleAuthManagerAdaptor extends BaseAuthServiceManager{
	
	public GoogleAuthManagerAdaptor(ValidationService validationService, EmailSender emailSender,
			UserService userService) {
		super(validationService, emailSender, userService);
		// TODO Auto-generated constructor stub
	}

	GoogleAuthManager googleAdaptor = new GoogleAuthManager();
	
	@Override
	public void signIn(String email, String password) {
		GoogleAuthManager googleAdapter = new GoogleAuthManager();
		if(validationService.checkLoginInformations(email, password)) {
			googleAdapter.signIn(userService.getByEmail(email));
		}else {
			System.out.println("Google hesabýyla sisteme kayýt yapýlmamýþ.");
		}
		
	}

	@Override
	public void signUp(User user) {
		if(validationService.checkRegisterInformations(user)) {
			System.out.println("Kiþi baþarýyla kaydoldu.");
			userService.addUser(user);
		}else {
			System.out.println("Aranan kriterler saðlanmamakta.");
		}
		
		
	}

	
}
