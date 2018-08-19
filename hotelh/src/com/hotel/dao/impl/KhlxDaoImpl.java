package com.hotel.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.Fjlx;
import model.Kh;
import model.Khlx;

import com.hotel.dao.KhlxDao;

public class KhlxDaoImpl extends HibernateDaoSupport implements KhlxDao {

	public Khlx get(String kxno) {
		// TODO Auto-generated method stub
		return (Khlx)getHibernateTemplate().find("from Khlx where khlxno=?",kxno).get(0);
	}

}
