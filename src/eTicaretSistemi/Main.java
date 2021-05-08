package eTicaretSistemi;

import java.time.LocalDate;

import eTicaretSistemi.business.abstracts.AuthService;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.abstracts.ValidationService;
import eTicaretSistemi.business.concretes.BaseAuthServiceManager;
import eTicaretSistemi.business.concretes.GoogleAuthManagerAdaptor;
import eTicaretSistemi.business.concretes.SystemAuthManager;
import eTicaretSistemi.business.concretes.SystemValidationManager;
import eTicaretSistemi.business.concretes.UserManager;
import eTicaretSistemi.core.abstracts.EmailSender;
import eTicaretSistemi.core.concretes.SystemEmailSender;
import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.dataAccess.concretes.InMemoryDao;
import eTicaretSistemi.entities.concretes.User;

public class Main {
	// Çizgi Çezme Test Amaçlý Konulmuþtur. Testler bittikten sonra silinecektir.
	public static void main(String[] args) {
		UserDao inMemory = new InMemoryDao();
		EmailSender emailSender = new SystemEmailSender();
		UserService userManager = new UserManager(inMemory);
		ValidationService systemValidationService = new SystemValidationManager(userManager);
		BaseAuthServiceManager googleManager = new GoogleAuthManagerAdaptor(systemValidationService, emailSender,userManager); //validation, email userservice
		BaseAuthServiceManager systemAuthManager = new SystemAuthManager(systemValidationService, emailSender, userManager);
		User user1 = new User(1, "12345678901", "Göktuð Furkan", "Arýca", "abc@gmail.com", "123456", LocalDate.of(2005,06,18));
		User user2 = new User(2, "12345678911", "Murathan", "Arýca", "abc@gmail.com", "123456", LocalDate.of(2009,10,10));
		User user3 = new User(3, "12345678111", "Engin", "Demiroð", "adamgibiadam@gmail.com", "senBirIproductDAOsun", LocalDate.of(1985,01,06));

		systemAuthManager.signUp(user1);
		printLine();
		systemAuthManager.signUp(user2);
		printLine();
		googleManager.signUp(user3);
		printLine();
		googleManager.signUp(user3);
		printLine();
		systemAuthManager.signIn("abc@gmail.com", "123456");
		googleManager.signIn("abcd@gmail.com", "13456"); //kiþi google hesabýyla google tabanýndan giriþ yapacaðý için parametrenin bir önemi yok.

	}
	
	public static void printLine() {
		System.out.println("--------------------------------");
	}

}
