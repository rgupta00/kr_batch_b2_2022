package com.empapp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmfFactory {
	private static EntityManagerFactory emf=null;
	
	public static  EntityManagerFactory getEntityManagerFactory() {
		emf=Persistence.createEntityManagerFactory("kronos_pu");
		return emf;
	}
}
