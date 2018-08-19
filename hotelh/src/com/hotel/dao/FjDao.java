package com.hotel.dao;

import java.util.List;

import model.Fj;
import model.Fjlx;

public interface FjDao {

	public void addFj(Fj f);
	
	public void deleFjBy(Fj f);
	
	public void updateFj(Fj f);
	
	public Fj findFjById(int id);
	
	public List findFjByFjno(String fjno);
	
	public List findFjByFjlxno(Fjlx fx);
	
	public List findAll();
	
	public Integer fjZt(String c);
	
	public void setFjzt(Fj fj);
	
	public List findFjByFjzt(String fjzt);
	
	public Fj afindFjByFjno(String fjno);
	
	public List findAllFjFenYe(String key, String value, int first, int num);
	
	public int FjTatal(String key, String value);
	
	
}
