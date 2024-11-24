package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllRecords {
	
 public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	//TCL is not required to fetch the records.
	Query q =em.createQuery("select b from BankHolder b");
	List<BankHolder> l =q.getResultList();
	
	if(!l.isEmpty()) {
		for(BankHolder b : l) {
			System.out.println(b.getAccountNumber()+" "+ b.getName()+" "+b.getEmail()+" "+b.getAmount());
		}
	}
	else {
		System.out.println("record not present");
	}
}

}
