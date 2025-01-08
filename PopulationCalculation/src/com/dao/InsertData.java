package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.population.PopulationCusesDetails;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class InsertData {

	public void insertData(PopulationCusesDetails pcd, Session session, Transaction transaction) {
		Scanner in = new Scanner(System.in);
	
		
		System.out.println("Person Name:");
		String peopleName = in.nextLine();

		System.out.println("Person DOB:");
		String dob = in.nextLine();

		System.out.println("Person City:");
		String palce = in.nextLine();
		
		System.out.println("Person State:");
		String State = in.nextLine();
		
		System.out.println("Person Survey Date:");
		String surveyDate = in.nextLine();
		
		System.out.println("Person Mobile Number:");
		long mobileNumber = in.nextLong();
		
		in.nextLine();
		
		System.out.println("Person Occupation");
		String occupation = in.nextLine();
		
		
		String hqlquery = "insert into PopulationCusesDetails(peopleName,dob, palce,State,surveyDate,mobileNumber,occupation)values(:peopleName,:dob, :palce,:State,:surveyDate,:mobileNumber,:occupation)";
		MutationQuery query = session.createMutationQuery(hqlquery);
		query.setParameter("peopleName", peopleName);
		query.setParameter("dob", dob);
		query.setParameter("palce",  palce);
		query.setParameter("State", State);
		query.setParameter("surveyDate", surveyDate);
		query.setParameter("mobileNumber", mobileNumber);
		query.setParameter("occupation", occupation);
		query.executeUpdate();
		transaction.commit();
		System.out.println("Data Inserted Successfully");
	}

}
