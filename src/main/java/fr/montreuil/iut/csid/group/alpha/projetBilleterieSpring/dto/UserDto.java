package fr.montreuil.iut.csid.group.alpha.projetBilleterieSpring.dto;

import java.util.Date;

import fr.montreuil.iut.csid.group.alpha.projetBilleterieSpring.modeles.User;

public class UserDto {

	private String firstName;
	private String lastName;
	private Date birthDate;
	private String userName;
	private String email;
	private String password;
	private Date createdDate;
	private boolean enabled;
	
	public UserDto(String firstName, String lastName, Date birthDate, String userName, String email, String password, Date createdDate, boolean enabled) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.createdDate = createdDate;
		this.enabled = enabled;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public User userDtoToUser() {
		return new User(this.getFirstName(),this.getLastName(),this.getBirthDate(),this.getUserName(),this.getEmail(),this.getPassword(),this.getCreatedDate(),this.isEnabled());
	}
}
