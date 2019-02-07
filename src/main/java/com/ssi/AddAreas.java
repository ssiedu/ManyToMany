package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddAreas {

	public static void main(String[] args) {

		Area a1=new Area("A111","Indore-East","Indore","MP");
		Area a2=new Area("A112","Indore-West","Indore","MP");
		Area a3=new Area("A113","Bhopal-East","Bhopal","MP");
		Area a4=new Area("A114","Bhopal-West","Bhopal","MP");
		Area a5=new Area("A115","Ujjain-East","Ujjain","MP");
		Area a6=new Area("A116","Ujjain-West","Ujjain","MP");
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(a1); session.save(a2); session.save(a3);
		session.save(a4); session.save(a5); session.save(a6);
		tr.commit();
		System.out.println("Area Details Added");
	}

}


