package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.Lsrz;

import com.hotel.dao.LsrzDao;

public class LsrzDaoImpl extends HibernateDaoSupport implements LsrzDao {

	public void addLsrz(Lsrz lsrz) {
		getHibernateTemplate().save(lsrz);
	}

	public List findAllLsrz() {
		return getHibernateTemplate().find("from Lsrz");
	}

	public List findLsrzByFjno(String fjno) {
		fjno="%"+fjno+"%";
		return getHibernateTemplate().find("from Lsrz where fjno like ?",fjno);
	}

	public List findLsrzByKhmc(String khmc) {
		khmc="%"+khmc+"%";
		return getHibernateTemplate().find("from Lsrz where khmc like ?",khmc);
	}

	public void deleLsrz(Lsrz lsrz) {
		getHibernateTemplate().delete(lsrz);
	}

}
