package eTicaretSistemi.google;

import eTicaretSistemi.entities.concretes.User;

public class GoogleAuthManager {
	public void signIn(User user) {
		System.out.println(user.getUserRealFirstName() + " isimli kullan�c� sisteme google'a giri� yapt�.");
	}
	public void signUp(User user) {
		System.out.println(user.getUserRealFirstName() + " isimli kullan�c� sisteme kaydoldu. giri� yapt�.");
	
	}
}
