package com.hotel.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.Fj;
import model.Kh;

import com.hotel.dao.KhDao;

public class KhDaoImpl extends HibernateDaoSupport implements KhDao {

	public void addKh(Kh k) {
		getHibernateTemplate().save(k);

	}

	public List findAllKh() {
		return getHibernateTemplate().find("from Kh");

	}

	public Kh findKhByKhno(int khno) {
		return (Kh)getHibernateTemplate().get(Kh.class , khno);
	}
	
	public List findKhByKhmc(String khmc){
		khmc="%"+khmc+"%";
		return getHibernateTemplate().find("from Kh  where khmc like ?",khmc);
	}
	
	public void updateKh(Kh k) {
		getHibernateTemplate().update(k);
		
	}

	public void deleKh(Kh kh) {
		getHibernateTemplate().delete(kh);
	}

	public int KhTatal(String key, String value) {
		Session session = this.getSession();
		Query query = session
				.createQuery("select count(*) from Kh where lower("+key+") like lower(?) ");
		query.setString(0, "%" + value + "%");
		
		return Integer.parseInt(query.setMaxResults(1).uniqueResult() + "");
	}

	public List findAllKhFenYe(String key, String value, int first, int num) {
		Session session = this.getSession();
		Query query = session
				.createQuery("from Kh where lower("+key+") like lower(?) ");
		query.setString(0, "%" + value + "%");
		query.setFirstResult(first);
		query.setMaxResults(num);
		return query.list();
	}
	
	
}
