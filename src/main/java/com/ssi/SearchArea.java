package com.ssi;

import java.util.List;

import org.hibernate.Session;

public class SearchArea {

	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Area area=session.get(Area.class, "A113");
		System.out.println(area.getAcode());
		System.out.println(area.getAdesc());
		System.out.println(area.getCity());
		System.out.println(area.getState());
		List<Emp> emps=area.getEmps();
		for(Emp e:emps){
			System.out.println(e);
		}
		session.close();

	}

}
