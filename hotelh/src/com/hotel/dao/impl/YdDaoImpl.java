package com.hotel.dao.impl;

import java.util.Collection;
import java.util.List;

import model.Yd;

import org.hibernate.Query;
import org.hibernate.Session;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hotel.dao.YdDao;

public class YdDaoImpl extends HibernateDaoSupport implements YdDao {

	public void addYd(Yd yd) {
		getHibernateTemplate().save(yd);

	}

	public void deleYd() {
		// Session session = this.getSession();
		// Query query = session.createQuery("delete from yd");
		// session.delete(query.list());
	}

	public List findAllYd() {
		return getHibernateTemplate().find("from Yd");
	}

	public List findYdByKhmc(String khmc) {
		khmc = "%" + khmc + "%";
		return getHibernateTemplate().find("from Yd  where kh.khmc like ?",
				khmc);
	}

	public void deleteYdByYd(Yd yd) {
		getHibernateTemplate().delete(yd);
	}

	public Yd findYdByYdid(int ydid) {
		return (Yd) getHibernateTemplate().get(Yd.class, ydid);
	}

	public List findYdByFjno(String fjno) {
		fjno = "%" + fjno + "%";
		return getHibernateTemplate().find("from Yd  where fj.fjno like ?",
				fjno);
	}

	public void updateYd(Yd yd) {
		getHibernateTemplate().update(yd);
	}

	public boolean findYdByKhid(int khid) {
		List list = getHibernateTemplate()
				.find("from Yd where kh.khno=?", khid);
		if (list.size() == 0) {
			return true;
		}
		return false;
	}

	public int YdTatal(String key, String value) {
		Session session = this.getSession();
		Query query = session
				.createQuery("select count(*) from Yd where lower(" + key
						+ ") like lower(?) ");
		query.setString(0, "%" + value + "%");

		return Integer.parseInt(query.setMaxResults(1).uniqueResult() + "");

	}

	public List findAllYdFenYe(String key, String value, int first, int num) {
		Session session = this.getSession();
		Query query = session.createQuery("from Yd where lower(" + key
				+ ") like lower(?) ");
		query.setString(0, "%" + value + "%");
		query.setFirstResult(first);
		query.setMaxResults(num);
		return query.list();
	}
}
