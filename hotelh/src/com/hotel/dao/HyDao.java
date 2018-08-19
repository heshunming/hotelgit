package com.hotel.dao;

import java.util.List;

import model.Hy;

public interface HyDao {
	public void addHy(Hy hy);
	
	public void deleHy(Hy hy);
	
	public void updateHy(Hy hy);
	
	public List findAllHy();
	
	public Hy findHyByHyno(int hyno);
	
	public List findHyByHyxm(String hyxm);

}
