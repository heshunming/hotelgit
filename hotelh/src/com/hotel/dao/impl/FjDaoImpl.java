package com.hotel.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.Czy;
import model.Fj;
import model.Fjlx;

import com.hotel.dao.FjDao;

public class FjDaoImpl extends HibernateDaoSupport implements FjDao {

	public void addFj(Fj f) {
		getHibernateTemplate().save(f);
	}

	public void deleFjBy(Fj f) {
		getHibernateTemplate().delete(f);
	}

	public List findFjByFjlxno(Fjlx fx) {

		return getHibernateTemplate().find("from Fj f where fjlx=?", fx);
	}

	public List findFjByFjno(String fjno) {
		fjno = "%" + fjno + "%";
		return  getHibernateTemplate().find("from Fj where fjno like ?", fjno);
	}

	public Fj findFjById(int id) {
		return (Fj) getHibernateTemplate().get(Fj.class, id);

	}

	public void updateFj(Fj f) {
		getHibernateTemplate().update(f);

	}

	public List findAll() {

		return getHibernateTemplate().find("from Fj");
	}

	public Integer fjZt(String c) {
		Fj f = new Fj();
		int a = 0;
		List list = getHibernateTemplate().find("from Fj f where f.fjzt=?", c);

		if (list.size() > 0) {
			a = list.size();
		} else {
			a = 0;
		}
		return a;
	}

	public void setFjzt(Fj fj) {
		getHibernateTemplate().update(fj);

	}

	public List findFjByFjzt(String fjzt) {
		return getHibernateTemplate().find("from Fj where fjzt=?", fjzt);
	}

	public Fj afindFjByFjno(String fjno) {
		List list = null;
		list=getHibernateTemplate().find("from Fj where fjno = ?",fjno);
		if(list.size()>0){
			return (Fj)list.get(0);
		}
		return null;
	}

	public int FjTatal(String key, String value) {
		Session session = this.getSession();
		Query query = session
				.createQuery("select count(*) from Fj where lower("+key+") like lower(?) ");
		query.setString(0, "%" + value + "%");
		
		return Integer.parseInt(query.setMaxResults(1).uniqueResult() + "");
	}

	public List findAllFjFenYe(String key, String value, int first, int num) {
		Session session = this.getSession();
		Query query = session
				.createQuery("from Fj where lower("+key+") like lower(?) ");
		query.setString(0, "%" + value + "%");
		query.setFirstResult(first);
		query.setMaxResults(num);
		return query.list();
	}

}
