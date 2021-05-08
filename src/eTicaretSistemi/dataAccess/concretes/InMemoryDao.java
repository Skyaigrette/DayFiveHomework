package eTicaretSistemi.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concretes.User;

public class InMemoryDao implements UserDao{
	private List<User> userList;
	
	public InMemoryDao() {
		userList= new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		userList.add(user);
		System.out.println(user.getUserRealFirstName() + " Ýsimli Kullanýcý Eklendi.");	
	}

	@Override
	public void removeUser(User user) {
		userList.remove(user);
		System.out.println(user.getUserRealFirstName() + " Ýsimli Kullanýcý Kaldýrýldý.");
	}

	@Override
	public User getUser(int id) {
		for (User user:userList) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	@Override
	public User getByEmail(String email) {
		for (User user:userList) {
			if(user.getEmailAdress().equalsIgnoreCase(email)){
				return user;
			}
		}
		return null;
	}
	
	@Override
	public List<User> listUsers() {
		return userList;
	}

	@Override
	public User getByLoginInformation(String email, String password) {
		if(getByEmail(email).getPassword() == password) {
			return getByEmail(email);
		}
		return null;
	}

}
