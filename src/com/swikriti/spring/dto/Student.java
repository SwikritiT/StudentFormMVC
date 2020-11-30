package com.swikriti.spring.dto;

import java.util.LinkedHashMap;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class Student {
	@NotBlank
	
	private String name;
	@NotEmpty
	private String address;
	@NotBlank
	private String country;
	private LinkedHashMap<String, String> countryOptions;
    @NotNull
	private String gender;
    @Email
    private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String[] hobbies;
	public Student() {
		super();
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("np", "Nepal");
		countryOptions.put("us", "USA");
		countryOptions.put("in", "India");
		countryOptions.put("eng", "England");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
