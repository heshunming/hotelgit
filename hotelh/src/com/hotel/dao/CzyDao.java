package com.hotel.dao;

import java.util.List;

import model.Czy;

public interface CzyDao {

	public Czy get(int id);
	
	public void save(Czy c);
	
	public void dele(Czy c);
	
	public void update(Czy c);
	
	public List findAllCzy();
	
	public List findCzyByName(String name);
	
	public Czy findUserByNameAndPass(String username,String password);
}
