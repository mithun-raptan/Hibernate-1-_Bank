package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		//create an object for @Entity annotation class
		BankHolder b = new BankHolder();
		b.setAccountNumber(123456);
		b.setName("mithun");
		b.setEmail("m@g.com");
		b.setAmount(6969);
		
		BankHolder b1 = new BankHolder();
		b1.setAccountNumber(123457);
		b1.setName("sazu");
		b1.setEmail("s@g.com");
		b1.setAmount(6291);
		
		//create a transaction i,e TCL
		
		et.begin(); //transaction start
//		em.persist(b);
		em.persist(b1);
		et.commit();//transaction end
		
	}

}
