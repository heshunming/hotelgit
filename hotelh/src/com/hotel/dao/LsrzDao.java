package com.hotel.dao;

import java.util.List;

import model.Lsrz;

public interface LsrzDao {

	public void addLsrz(Lsrz lsrz);
	
	public List findAllLsrz();
	
	public List findLsrzByKhmc(String khmc);
	
	public List findLsrzByFjno(String fjno);
	
	public void deleLsrz(Lsrz lsrz);
}
