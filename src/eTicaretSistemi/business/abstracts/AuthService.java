package eTicaretSistemi.business.abstracts;

import eTicaretSistemi.entities.concretes.User;

public interface AuthService {
	void signUp(User user);
	void signIn(String email, String password);

}
