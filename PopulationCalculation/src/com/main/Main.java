package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dao.DeleteData;
import com.dao.InsertData;
import com.dao.ShowData;
import com.dao.UpdateData;
import com.population.PopulationCusesDetails;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(PopulationCusesDetails.class);
		
		PopulationCusesDetails pcd = new PopulationCusesDetails();
	
		
		int choice;
		do {
			
			
			System.out.println("1.Insert Data 2.Delete Data 3.Update Data 4.Show Data 0.Exit");
			System.out.println("Enter Choice For Main (0-4):");
			choice = in.nextInt();
			in.nextLine();

			switch (choice) {

			case 1:
				InsertData insert = new InsertData();
				SessionFactory sessionFactory = cfg.buildSessionFactory();
				Session session = sessionFactory.openSession(); 
				Transaction transaction = session.beginTransaction();
				insert.insertData(pcd, session, transaction);
				session.close();
				break;
			case 2:
				DeleteData delete = new DeleteData();
				SessionFactory sessionFactoryD = cfg.buildSessionFactory();
				Session sessionD = sessionFactoryD.openSession(); 
				Transaction transactionD = sessionD.beginTransaction();
				delete.deleteData(pcd , sessionD ,transactionD);
				sessionD.close();
				break;
				
			case 3:
				UpdateData update = new UpdateData();
				SessionFactory sessionFactoryU = cfg.buildSessionFactory();
				Session sessionU = sessionFactoryU.openSession(); 
				Transaction transactionU = sessionU.beginTransaction();
				update.updateData(pcd, sessionU, transactionU);
				sessionU.close();
				break;
			case 4:
				ShowData show = new ShowData();
				SessionFactory sessionFactoryS = cfg.buildSessionFactory();
				Session sessionS = sessionFactoryS.openSession();
				Transaction transactionS = sessionS.beginTransaction();
				show.showData(pcd, sessionS, transactionS);
				sessionS.close();
				break;
			case 0:
				System.out.println("Exit From Main");
				break;
			default:
				System.out.println("Invalid Choice");
				
			}
		} while (choice != 0);
		
		
		
		
		
	}

}
