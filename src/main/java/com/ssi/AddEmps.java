package com.ssi;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddEmps {
	public static void main(String[] args) {

		Area a1=new Area("A111");		Area a2=new Area("A112");
		Area a3=new Area("A113");		Area a4=new Area("A114");
		Area a5=new Area("A115");		Area a6=new Area("A116");
		
		ArrayList<Area> list1=new ArrayList<Area>();
		list1.add(a1); list1.add(a2); list1.add(a3); list1.add(a5);
		
		ArrayList<Area> list2=new ArrayList<Area>();
		list2.add(a2);list2.add(a4); list2.add(a5); list2.add(a6);
		
		
		Emp e1=new Emp(111,"AAA","SalesExecutive",50000); e1.setAreas(list1);
		Emp e2=new Emp(112,"BBB","MarketingMgr",80000); e2.setAreas(list2);
		
		
		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		session.save(e1); session.save(e2);
		
		tr.commit();
		System.out.println("Emp Details Added");
	}
}
