
package com.dao;

import java.util.List;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.query.Query;

import com.population.PopulationCusesDetails;

public class ShowData {

	public void showData(PopulationCusesDetails pcd, Session session, Transaction transaction) {
		Scanner in = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter Choice 1.Show All Data 2.Show Single Data 0.Exit");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				String hqlquery = "from PopulationCusesDetails";
				Query<PopulationCusesDetails> query = session.createQuery(hqlquery,PopulationCusesDetails.class);
				List<PopulationCusesDetails> list = query.getResultList();

				for (PopulationCusesDetails record : list) {
					System.out.println(record);
				}
				break;
			case 2:
				System.out.println("Enter Id of Person whose data you want to fetch: ");
				int uniqueId = in.nextInt();
				String hqlqueryS = "from PopulationCusesDetails where uniqueId =:uniqueId";
				Query<PopulationCusesDetails> queryS = session.createQuery(hqlqueryS);
				queryS.setParameter("uniqueId", uniqueId);
				PopulationCusesDetails listS = queryS.getSingleResult();

				System.out.println(listS);

				break;
			case 0:
				System.out.println("Exit from Show Data");
				break;
			default:
				System.out.println("Wrong choice for data show");

			}
		} while (choice != 0);
		
		in.close();
	}

}
