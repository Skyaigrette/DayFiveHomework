package eTicaretSistemi.business.concretes;
import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.dataAccess.abstracts.UserDao;
import eTicaretSistemi.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}
	@Override
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	@Override
	public User getByEmail(String emailAdress) {
		return userDao.getByEmail(emailAdress);
	}



}

