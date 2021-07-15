package com.masai.a1415july_retrofit_we1;

import java.io.Serializable;

public class DataModel implements Serializable {
	private int id;
	private String email;
	private String firstName;
	private String lastName;
	private String avatar;

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public String getAvatar(){
		return avatar;
	}

	@Override
 	public String toString(){
		return 
			"DataModel{" + 
			"id = '" + id + '\'' + 
			",email = '" + email + '\'' + 
			",first_name = '" + firstName + '\'' + 
			",last_name = '" + lastName + '\'' + 
			",avatar = '" + avatar + '\'' + 
			"}";
		}
}