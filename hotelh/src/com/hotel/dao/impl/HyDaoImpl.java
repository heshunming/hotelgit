package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.Hy;

import com.hotel.dao.HyDao;

public class HyDaoImpl extends HibernateDaoSupport implements HyDao {

	public void addHy(Hy hy) {
		getHibernateTemplate().save(hy);
	}

	public void deleHy(Hy hy) {
		getHibernateTemplate().delete(hy);
	}

	public List findAllHy() {
		return getHibernateTemplate().find("from Hy");
	}

	public Hy findHyByHyno(int hyno) {
		return (Hy)getHibernateTemplate().get(Hy.class, hyno);
	}

	public List findHyByHyxm(String hyxm) {
		hyxm = "%"+hyxm+"%";
		return getHibernateTemplate().find("from Hy where hyxm like ?",hyxm);
	}

	public void updateHy(Hy hy) {
		getHibernateTemplate().update(hy);
	}

}
