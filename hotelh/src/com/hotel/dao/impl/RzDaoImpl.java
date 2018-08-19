package com.hotel.dao.impl;

import java.util.List;

import model.Fj;
import model.Kh;
import model.Rz;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hotel.dao.RzDao;

public class RzDaoImpl extends HibernateDaoSupport implements RzDao {

	public void addRz(Rz r) {
		getHibernateTemplate().save(r);
	}

	public List findRzByFj(Fj fj) {
		return getHibernateTemplate().find("from Rz where fj=?", fj);

	}

	public List findRzByKh(String khmc) {
		khmc = "%" + khmc + "%";
		return getHibernateTemplate()
				.find("from Rz where kh.khmc like ?", khmc);

	}

	public List findRzByFjno(String fjno) {
		fjno = "%" + fjno + "%";
		return getHibernateTemplate()
				.find("from Rz where fj.fjno like ?", fjno);

	}

	public List findAllRz() {
		return getHibernateTemplate().find("from Rz");
	}

	public Rz findRzByRzid(int rzid) {
		return (Rz) getHibernateTemplate().get(Rz.class, rzid);
	}

	public void deleRz(Rz rz) {
		getHibernateTemplate().delete(rz);
	}

	public boolean findRzByKhid(int khid) {
		List list = getHibernateTemplate()
				.find("from Rz where kh.khno=?", khid);
		if (list.size() == 0) {
			return true;
		}
		return false;
	}

	public void updateRz(Rz rz) {
		getHibernateTemplate().update(rz);
	}
	
	public List findAllRzFenYe(String key, String value, int first, int num){
		Session session = this.getSession();
		Query query = session
				.createQuery("from Rz where lower("+key+") like lower(?) ");
		query.setString(0, "%" + value + "%");
		query.setFirstResult(first);
		query.setMaxResults(num);
		return query.list();
	}
	
	public int RzTatal(String key, String value) {
		
		Session session = this.getSession();
		Query query = session
				.createQuery("select count(*) from Rz where lower("+key+") like lower(?) ");
		query.setString(0, "%" + value + "%");
		
		return Integer.parseInt(query.setMaxResults(1).uniqueResult() + "");
	}
}
