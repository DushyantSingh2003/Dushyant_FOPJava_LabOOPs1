package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String generatePassword() {
			Random r = new Random();
			String number = "1234567890";
			String capitalLetter = "ABCDEFGHIJKLINOPORSTUVYZ";
			String smallletter = "abcdefghijklmnopqrstuvwryz";
			String specialCharacter = "!@#$%&";
			char num;
			char caps;
			char small;
			char spchar;
			
			String generatedPass="";
			for (int i=0; i<2; i++) {
				num = number.charAt(r.nextInt(number.length()));
				generatedPass +=num;
			}
			for (int i=0; i<3; i++) {
				caps = capitalLetter.charAt(r.nextInt(capitalLetter.length()));
				generatedPass +=caps;
			}
			for (int i=0; i<2; i++) {
				small = smallletter.charAt(r.nextInt(smallletter.length()));
				generatedPass +=small;
			}
			for (int i=0; i<2; i++) {
				spchar = specialCharacter.charAt(r.nextInt(specialCharacter.length()));
				generatedPass +=spchar;
			}
			
			return generatedPass;
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".gl.com" ;
	}

	@Override
	public void showCredentials(Employee employee, String email, String password ) {
	System.out.println("Dear "+employee.getFirstName()+",");
	System.out.println("Your Email Address: "+email);
	System.out.println("Your Password: "+password);
		
	}

}
