package com.dao;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.population.PopulationCusesDetails;

public class DeleteData {

	

	public void deleteData(	PopulationCusesDetails pcd ,Session session, Transaction tranc) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ID to delete");
		int uniqueId = in.nextInt();
		String q = "delete from PopulationCusesDetails where uniqueId = :uniqueId";
		Query<PopulationCusesDetails> query = session.createQuery(q);
		query.setParameter("uniqueId", uniqueId);
		query.executeUpdate();
		tranc.commit();
		in.close();
		
	}
}
