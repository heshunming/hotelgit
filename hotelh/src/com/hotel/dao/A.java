package com.hotel.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hotel.dao.impl.RzDaoImpl;

import model.Fj;
import model.Kh;
import model.Rz;

public class A {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		RzDaoImpl s = (RzDaoImpl) context.getBean("rzDao");
		Rz r = new Rz();
		Kh k = new Kh();
		Fj f = new Fj();
		k.setKhno(1);
		f.setFjid(1);
		r.setKh(k);
		r.setFj(f);
		r.setFjlxno("1");
		r.setKhlxno("1");
		java.util.Date now = new java.util.Date();
		java.sql.Date nn = new java.sql.Date(now.getTime());
		r.setRzsj(nn);
		r.setYzts(1);
		r.setYj(200.0);
		
		// String dzbl = addRzForm.getString("dz");
		r.setDzbl(0.9);
		s.addRz(r);		
	}

}
