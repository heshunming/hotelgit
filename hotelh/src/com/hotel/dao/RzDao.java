package com.hotel.dao;

import java.util.List;

import model.Fj;
import model.Kh;
import model.Rz;

public interface RzDao {

	public void addRz(Rz r);
	
	public List findRzByFj(Fj fj);
	
	public List findRzByKh(String khmc);
	
	public List findAllRz();
	
	public Rz findRzByRzid(int rzid);
	
	public void deleRz(Rz rz);
	
	public List findRzByFjno(String fjno);
	
	public boolean findRzByKhid(int khid);
	
	public void updateRz(Rz rz);
	
	public List findAllRzFenYe(String key, String value, int first, int num);
	
	public int RzTatal(String key, String value);
}
