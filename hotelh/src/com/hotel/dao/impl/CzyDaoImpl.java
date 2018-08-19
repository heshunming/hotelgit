package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import model.Czy;


import com.hotel.dao.CzyDao;

public class CzyDaoImpl extends HibernateDaoSupport implements CzyDao {

	public void save(Czy c) {
		getHibernateTemplate().save(c);
		
	}

	public void dele(Czy c) {
		getHibernateTemplate().delete(c);		
	}

	public List findAllCzy() {
		return   getHibernateTemplate().find("from Czy");
	}

	public Czy findUserByNameAndPass(String username, String password) {
		String[] args = {username , password};
        List ul = getHibernateTemplate().find("from Czy c where c.username = ? and c.password = ?" , args);
        System.out.println("ul.size():"+ul.size());
        if (ul.size() == 1)
        {
            return (Czy)ul.get(0);
        }
        return null;
	}

	public void update(Czy c) {
		 getHibernateTemplate().saveOrUpdate(c);
		
	}

	public Czy get(int id) {
	   return (Czy)getHibernateTemplate().get(Czy.class , id);
	}

	public List findCzyByName(String name) {
		name = "%"+name+"%";
		return getHibernateTemplate().find("from Czy where username like ?",name);
	}

}
