package eTicaretSistemi.entities.concretes;

import java.time.LocalDate;

import eTicaretSistemi.entities.abstracts.UserEntity;

public class User implements UserEntity {
	private int id;
	private String nationalIdentity;
	private String userRealFirstName;
	private String userRealLastName;
	private String emailAdress;
	private String password;
	private boolean isGoogleAccountAuthorized = false;
	private LocalDate birthday;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int id, String nationalIdentity, String userRealFirstName, String userRealLastName, String emailAdress,
			String password, LocalDate birthday) {
		super();
		this.id = id;
		this.nationalIdentity = nationalIdentity;
		this.userRealFirstName = userRealFirstName;
		this.userRealLastName = userRealLastName;
		this.emailAdress = emailAdress;
		this.password = password;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public String getUserRealFirstName() {
		return userRealFirstName;
	}

	public void setUserRealFirstName(String userRealFirstName) {
		this.userRealFirstName = userRealFirstName;
	}

	public String getUserRealLastName() {
		return userRealLastName;
	}

	public void setUserRealLastName(String userRealLastName) {
		this.userRealLastName = userRealLastName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public boolean getIsGoogleAccountAuthorized() {
		return isGoogleAccountAuthorized;
	}

	public void setGoogleAccountAuthorized(boolean isGoogleAccountAuthorized) {
		this.isGoogleAccountAuthorized = isGoogleAccountAuthorized;
	}
	
}
