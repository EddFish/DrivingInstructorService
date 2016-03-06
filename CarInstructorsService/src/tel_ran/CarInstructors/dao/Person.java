package tel_ran.CarInstructors.dao;

import javax.persistence.*;

@Entity
public abstract class Person {
	@Id
	@GeneratedValue
	int id;
	String firstName;
	String surname;
	Boolean sex;
	String phone;
	
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getSurname() {
		return surname;
	}
	public Boolean getSex() {
		return sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", surname=" + surname + ", sex=" + sex + ", phone=" + phone + "]";
	}
	
	
}
