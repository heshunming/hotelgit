package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.Fjlx;

import com.hotel.dao.FjlxDao;

public class FjlxDaoImpl extends HibernateDaoSupport implements FjlxDao {

	public void addFjlx(Fjlx fx) {
		// TODO Auto-generated method stub

	}

	public void deleFjlx(Fjlx fx) {
		// TODO Auto-generated method stub

	}

	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Fjlx findFjlxByFjlxid(int id) {
		
		return null;
	}

	public Fjlx findFjlxByFjlxno(String fxno) {
		
		return (Fjlx)getHibernateTemplate().find("from Fjlx where fjlxno=?",fxno).get(0);
	}

	public void updateFjlx(Fjlx fx) {
		// TODO Auto-generated method stub

	}
}
