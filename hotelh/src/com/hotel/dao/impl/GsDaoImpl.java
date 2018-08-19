package com.hotel.dao.impl;

import java.util.List;

import model.Sygs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hotel.dao.GsDao;

public class GsDaoImpl extends HibernateDaoSupport implements GsDao {

	public void addGs(Sygs gs) {
		getHibernateTemplate().save(gs);
	}

	public void deleGs(Sygs gs) {
		getHibernateTemplate().delete(gs);

	}

	public List findGsByGsmc(String gsmc) {
		gsmc="%"+gsmc+"%";
		return getHibernateTemplate().find("from Sygs where gsmc like ?",gsmc);
	}

	public Sygs findGsByGsno(int gsno) {
		return (Sygs)getHibernateTemplate().get(Sygs.class, gsno);
	}

	public void updateGs(Sygs gs) {
		getHibernateTemplate().update(gs);

	}

	public List findAllGs() {
		return getHibernateTemplate().find("from Sygs");
	}

}
