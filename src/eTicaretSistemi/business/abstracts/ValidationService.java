package eTicaretSistemi.business.abstracts;

import eTicaretSistemi.entities.concretes.User;

public interface ValidationService {
	boolean checkRegisterInformations(User user);
	boolean checkLoginInformations(String email, String password);
}
