package eTicaretSistemi.business.concretes;

import java.util.regex.Pattern;

import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.abstracts.ValidationService;
import eTicaretSistemi.entities.concretes.User;

public class SystemValidationManager implements ValidationService {
	
	private UserService userService;
	public SystemValidationManager(UserService userService) {
		this.userService = userService;
	}
	@Override
	public boolean checkRegisterInformations(User user) {
		if(user.getPassword().length() >= 6 && Pattern.matches("^(.+)@(.+)$", user.getEmailAdress())&&
		   
		   user.getUserRealFirstName().length()>=2&&user.getUserRealLastName().length()>=2&& 
		   
		   userService.getByEmail(user.getEmailAdress()) == null){
			
		   return true;
		
		}else {
			return false;
		}
	}
	@Override
	public boolean checkLoginInformations(String email, String password) {
		if(userService.getByEmail(email) != null && userService.getByEmail(email).getPassword() == password) {
			return true;
		}else {
			return false;
		}
		
	}

}
