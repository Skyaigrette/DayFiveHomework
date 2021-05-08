package eTicaretSistemi.dataAccess.abstracts;

import java.util.List;

import eTicaretSistemi.entities.concretes.User;

public interface UserDao {
	void addUser(User user);
	void removeUser(User user);
	User getUser(int id);
	User getByEmail(String email);
	User getByLoginInformation(String email, String password);
	List<User> listUsers();
}
