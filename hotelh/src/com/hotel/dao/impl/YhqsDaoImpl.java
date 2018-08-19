package com.hotel.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import model.Yhqs;

import com.hotel.dao.YhqsDao;

public class YhqsDaoImpl extends HibernateDaoSupport  implements YhqsDao {

	public Yhqs findYhqsByQsno(int qsno) {
		return (Yhqs)getHibernateTemplate().find("from Yhqs where qsno=?",qsno).get(0);
	}

}
