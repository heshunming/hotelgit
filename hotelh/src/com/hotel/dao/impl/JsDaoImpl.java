package com.hotel.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.Js;

import com.hotel.dao.JsDao;

public class JsDaoImpl extends HibernateDaoSupport implements JsDao {

	public void addJs(Js js) {
		getHibernateTemplate().save(js);
	}

	public void deleJs(Js js) {
		getHibernateTemplate().delete(js);
	}

	public List findJsByFjno(String fjno) {
		fjno = "%" + fjno + "%";
		return getHibernateTemplate().find("from Js where fjno like ?", fjno);
	}

	public List findJsByKhmc(String khmc) {
		khmc = "%" + khmc + "%";
		return getHibernateTemplate().find("from Js where khmc like ?", khmc);
	}

	public void updateJs(Js js) {
		getHibernateTemplate().update(js);
	}

	public List findAllJs() {
		return getHibernateTemplate().find("from Js");
	}

	public Js findJsByJsid(int jsid) {
		return (Js) getHibernateTemplate().get(Js.class, jsid);
	}

	public List findAllJsFenYe(String key, String value, int first, int num) {
		Session session = this.getSession();
		Query query = session.createQuery("from Js where lower(" + key
				+ ") like lower(?) ");
		query.setString(0, "%" + value + "%");
		query.setFirstResult(first);
		query.setMaxResults(num);
		return query.list();
	}

	public int JsTatal(String key, String value) {

		Session session = this.getSession();
		Query query = session
				.createQuery("select count(*) from Js where lower(" + key
						+ ") like lower(?) ");
		query.setString(0, "%" + value + "%");

		return Integer.parseInt(query.setMaxResults(1).uniqueResult() + "");
	}
}
