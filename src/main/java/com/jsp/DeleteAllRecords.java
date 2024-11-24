package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteAllRecords {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		//TCL is required now, bcuz we are dealing with sensitive operation
		EntityTransaction et = em.getTransaction();
		et.begin();
		Query q =em.createQuery("delete from BankHolder b");
		int n = q.executeUpdate();
		et.commit();
		if(n!=0) {
			System.out.println("all the records deleted");
		}
		else {
			System.out.println("records not present");
		}
		
	}

}
