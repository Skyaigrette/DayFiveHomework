package eTicaretSistemi.business.concretes;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.abstracts.ValidationService;
import eTicaretSistemi.core.abstracts.EmailSender;
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
		System.out.println("Kullanýcý Google'la Giriþ Yaptý.");
	}

	
}
