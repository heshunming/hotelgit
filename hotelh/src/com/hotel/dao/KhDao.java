package com.hotel.dao;

import java.util.List;

import model.Kh;

public interface KhDao {

	public void addKh(Kh k);

	public List findAllKh();

	public Kh findKhByKhno(int khno);

	public void updateKh(Kh k);

	public List findKhByKhmc(String khmc);

	public void deleKh(Kh kh);

	public List findAllKhFenYe(String key, String value, int first, int num);

	public int KhTatal(String key, String value);
}
