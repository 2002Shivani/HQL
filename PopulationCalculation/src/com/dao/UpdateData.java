package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

import com.population.PopulationCusesDetails;

import jakarta.persistence.Column;

public class UpdateData {

	public void updateData(PopulationCusesDetails pcd, Session session, Transaction transaction) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Id whose data you want to change:");
		int uniqueId = in.nextInt();
		int choice;
		do {
			
			System.out.println("Enter Choice To Correct 1.peopleName 2.City 3.State  4.surveyDate 5.occupation 0.Exit:");
			choice = in.nextInt();
			in.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter New Name:");
				String peopleName = in.nextLine();
				String hqlQuery = "update PopulationCusesDetails set peopleName =:peopleName where uniqueId =:uniqueId";
				MutationQuery query = session.createMutationQuery(hqlQuery);
				query.setParameter("peopleName",peopleName);
				query.setParameter("uniqueId",  uniqueId);
				query.executeUpdate();
				System.out.println("Name Updated");
				transaction.commit();
				break;
			case 2:
				System.out.println("Enter New City Name:");
				 String palce = in.nextLine();
				String hqlQueryC = "update PopulationCusesDetails set palce =:palce where uniqueId =:uniqueId";
				MutationQuery queryC = session.createMutationQuery(hqlQueryC);
				queryC.setParameter("palce",palce);
				queryC.setParameter("uniqueId",  uniqueId);
				queryC.executeUpdate();
				System.out.println("City Updated");
				transaction.commit();
				break;
			case 3:
				System.out.println("Enter New State Name:");
				String State = in.nextLine();
				String hqlQueryS = "update PopulationCusesDetails set State =:State where uniqueId =:uniqueId";
				MutationQuery queryS = session.createMutationQuery(hqlQueryS);
				queryS.setParameter("State",State);
				queryS.setParameter("uniqueId",  uniqueId);
				queryS.executeUpdate();
				System.out.println("State Updated");
				transaction.commit();
				break;
			case 4:
				System.out.println("Enter New Survey date:");
				String surveyDate = in.nextLine();
				String hqlQueryV = "update PopulationCusesDetails set surveyDate =:surveyDate where uniqueId =:uniqueId";
				MutationQuery queryV = session.createMutationQuery(hqlQueryV);
				queryV.setParameter("surveyDate",surveyDate);
				queryV.setParameter("uniqueId",  uniqueId);
				queryV.executeUpdate();
				System.out.println("Survey date Updated");
				transaction.commit();
				break;
			case 5:
				System.out.println("Enter New Occupation Name:");
				String occupation = in.nextLine();
				String hqlQueryO = "update PopulationCusesDetails set occupation =:occupation where uniqueId =:uniqueId";
				MutationQuery queryO = session.createMutationQuery(hqlQueryO);
				queryO.setParameter("occupation",occupation);
				queryO.setParameter("uniqueId", uniqueId);
				System.out.println("Occupation Updated");
				queryO.executeUpdate();
				transaction.commit();
				break;
			case 0:
				System.out.println("Exit form Update....");
				break;
			default: System.out.println("Invalid choice for correction....");
			}
			
		}while(choice!=0);
		
	}

}
