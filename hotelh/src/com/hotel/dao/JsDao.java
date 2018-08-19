package com.hotel.dao;

import java.util.List;

import model.Js;

public interface JsDao {

	public void addJs(Js js);
	
	public void updateJs(Js js);
	
	public void deleJs(Js js);
	
	public List findJsByFjno(String fjno);
	
	public List findJsByKhmc(String khmc);
	
	public List findAllJs();
	
	public Js findJsByJsid(int jsid);
	
	public List findAllJsFenYe(String key, String value, int first, int num);
	
	public int JsTatal(String key, String value);
}
