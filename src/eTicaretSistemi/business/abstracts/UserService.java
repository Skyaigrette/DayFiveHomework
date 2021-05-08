package eTicaretSistemi.business.abstracts;

import eTicaretSistemi.entities.concretes.User;

public interface UserService {
	void addUser(User user);
	User getUser(int id);
	User getByEmail(String emailAdress);
}
