package com.assignment4;

import java.util.Scanner;

public class CandidateDemo {

	public static void main(String[] args) throws AgeException, EducationException {
		// TODO Auto-generated method stub
		Candidate candidate = new Candidate();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Candidate Name :: ");
		String name = s.next();
		candidate.setName(name);
		System.out.print("Enter Candidate age :: ");
		int age = s.nextInt();
		validateAge(age);
		candidate.setAge(age);
		System.out.print("Enter Candidate Education :: ");
		String education = s.next();
		validateEducation(education);
		candidate.setEducation(education);
		System.out.println("Candidate details>>>"+candidate);
	}

	private static void validateEducation(String education) throws EducationException {
					if (!(education.equalsIgnoreCase("Btech")))
				throw new EducationException("Sorry,Invalid education");
			
		

	}

	private static void validateAge(int age) throws AgeException {
		
			if (age < 18)
				throw new AgeException("under age");
			else if(age >60)
				throw new AgeException("Over age");
		
	}

}
