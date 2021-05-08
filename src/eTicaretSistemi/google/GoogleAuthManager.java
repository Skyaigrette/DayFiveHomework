package eTicaretSistemi.google;

import eTicaretSistemi.entities.concretes.User;

public class GoogleAuthManager {
	public void signIn(User user) {
		System.out.println(user.getUserRealFirstName() + " isimli kullanýcý sisteme google'a giriþ yaptý.");
	}
	public void signUp(User user) {
		System.out.println(user.getUserRealFirstName() + " isimli kullanýcý sisteme kaydoldu. giriþ yaptý.");
	
	}
}
