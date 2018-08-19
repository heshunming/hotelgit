package com.hotel.dao;

import java.util.List;

import model.Fjlx;

public interface FjlxDao {

	public void addFjlx(Fjlx fx);
	
	public void deleFjlx(Fjlx fx);
	
	public void updateFjlx(Fjlx fx);
	
	public Fjlx findFjlxByFjlxno(String fxno);
	
	public List findAll();
	
	public Fjlx findFjlxByFjlxid(int id);

}
