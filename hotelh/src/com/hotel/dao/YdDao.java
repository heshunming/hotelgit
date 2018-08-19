package com.hotel.dao;

import java.util.List;

import model.Yd;

public interface YdDao {
	public void addYd(Yd yd);

	public void deleYd();

	public List findAllYd();

	public List findYdByKhmc(String khmc);

	public void deleteYdByYd(Yd yd);

	public Yd findYdByYdid(int ydid);

	public List findYdByFjno(String fjno);

	public void updateYd(Yd yd);

	public boolean findYdByKhid(int khid);

	public List findAllYdFenYe(String key, String value, int first, int num);

	public int YdTatal(String key, String value);
}
