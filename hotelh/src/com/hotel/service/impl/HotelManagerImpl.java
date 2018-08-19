package com.hotel.service.impl;

import java.util.ArrayList;
import java.util.List;

import model.Czy;
import model.Fj;
import model.Fjlx;
import model.Hy;
import model.Js;
import model.Kh;
import model.Khlx;
import model.Lsrz;
import model.Rz;
import model.Sygs;
import model.Yd;
import model.Yhqs;

import com.hotel.dao.CzyDao;
import com.hotel.dao.FjDao;
import com.hotel.dao.FjlxDao;
import com.hotel.dao.GsDao;
import com.hotel.dao.HyDao;
import com.hotel.dao.JsDao;
import com.hotel.dao.KhDao;
import com.hotel.dao.KhlxDao;
import com.hotel.dao.LsrzDao;
import com.hotel.dao.RzDao;
import com.hotel.dao.YdDao;
import com.hotel.dao.YhqsDao;
import com.hotel.service.HotelManager;

public class HotelManagerImpl implements HotelManager {

	private CzyDao czyDao;
	private FjDao fjDao;
	private FjlxDao fjlxDao;
	private KhDao khDao;
	private KhlxDao khlxDao;
	private RzDao rzDao;
	private YdDao ydDao;
	private JsDao jsDao;
	private HyDao hyDao;
	private GsDao gsDao;
	private LsrzDao	lsrzDao;
	private YhqsDao yhqsDao;

	public void setCzyDao(CzyDao czyDao) {
		this.czyDao = czyDao;
	}

	public void setFjDao(FjDao fjDao) {
		this.fjDao = fjDao;
	}

	public void setFjlxDao(FjlxDao fjlxDao) {
		this.fjlxDao = fjlxDao;
	}

	public void setKhDao(KhDao khDao) {
		this.khDao = khDao;
	}

	public void setKhlxDao(KhlxDao khlxDao) {
		this.khlxDao = khlxDao;
	}

	public void setRzDao(RzDao rzDao) {
		this.rzDao = rzDao;
	}

	public void setYdDao(YdDao ydDao) {
		this.ydDao = ydDao;
	}

	public void setJsDao(JsDao jsDao) {
		this.jsDao = jsDao;
	}
	public void setHyDao(HyDao hyDao) {
		this.hyDao = hyDao;
	}
	public void setGsDao(GsDao gsDao) {
		this.gsDao = gsDao;
	}
	public void setLsrzDao(LsrzDao lsrzDao) {
		this.lsrzDao = lsrzDao;
	}
	public void setYhqsDao(YhqsDao yhqsDao) {
		this.yhqsDao = yhqsDao;
	}

	public Integer validLogin(String username, String pass) {
		try {
			Czy c = czyDao.findUserByNameAndPass(username, pass);
			if (c != null) {
				return c.getCzyid();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void addFj(Fj f) {
		fjDao.addFj(f);
	}

	public Fjlx findFjlxByFjlxno(String fxno) {
		Fjlx fjlx = fjlxDao.findFjlxByFjlxno(fxno);
		return fjlx;
	}

	public List findAllFj() {

		return fjDao.findAll();
	}

	public void updateFj(Fj f) {
		fjDao.updateFj(f);
	}

	public List findFjByFjno(String fjno) {
		return fjDao.findFjByFjno(fjno);
	}

	public Fj findFjById(int id) {
		return fjDao.findFjById(id);
	}

	public void addKh(Kh k) {
		khDao.addKh(k);

	}

	public Khlx findKhlxByKxno(String kxno) {
		return khlxDao.get(kxno);
	}

	public List findAllKh() {
		return khDao.findAllKh();
	}

	public Kh findKhByKhno(int khno) {
		return khDao.findKhByKhno(khno);
	}

	public void updateKh(Kh k) {
		khDao.updateKh(k);
	}

	public void addRz(Rz r) {

		rzDao.addRz(r);
	}

	public List findFjByFjlxno(Fjlx fx) {
		return fjDao.findFjByFjlxno(fx);
	}

	public Integer fjZt(String c) {// 返回该状态房间的数量
		int a = fjDao.fjZt(c);
		return a;
	}

	public void setFjzt(Fj fj) {
		fjDao.setFjzt(fj);
	}

	public void addYd(Yd yd) {
		ydDao.addYd(yd);

	}

	public void deleYd() {
		ydDao.deleYd();

	}

	public List findFjByFjzt(String fjzt) {
		return fjDao.findFjByFjzt(fjzt);
	}

	public List findAllRz() {
		return rzDao.findAllRz();
	}

	public List findRzByFj(Fj fj) {
		// TODO Auto-generated method stub
		return rzDao.findRzByFj(fj);
	}

	public List findRzByKhmc(String khmc) {
		List list = new ArrayList();
		list = rzDao.findRzByKh(khmc);
		return list;
	}

	public Rz findRzByRzid(int rzid) {
		return rzDao.findRzByRzid(rzid);
	}

	public void deleRz(Rz rz) {
		rzDao.deleRz(rz);
	}

	public void addJs(Js js) {
		jsDao.addJs(js);
	}

	public List findAllYd() {
		return ydDao.findAllYd();
	}

	public List findYdByKhmc(String khmc) {
		return ydDao.findYdByKhmc(khmc);
	}

	public void deleteYdByYd(Yd yd) {
		ydDao.deleteYdByYd(yd);
	}

	public Yd findYdByYdid(int ydid) {
		return ydDao.findYdByYdid(ydid);
	}

	public List findYdByFjno(String fjno) {
		return ydDao.findYdByFjno(fjno);
	}

	public void deleFjBy(Fj f) {
		fjDao.deleFjBy(f);
	}

	public void updateYd(Yd yd) {
		ydDao.updateYd(yd);
	}

	public List findRzByFjno(String fjno) {
		return rzDao.findRzByFjno(fjno);
	}

	public List findKhByKhmc(String khmc) {
		return khDao.findKhByKhmc(khmc);
	}

	public void deleKh(Kh kh) {
		khDao.deleKh(kh);
	}

	public boolean findRzByKhid(int khid) {
		return rzDao.findRzByKhid(khid);
	}

	public boolean findYdByKhid(int khid) {
		return ydDao.findYdByKhid(khid);
	}

	public void updateRz(Rz rz) {
		rzDao.updateRz(rz);
	}

	public void addHy(Hy hy) {
		hyDao.addHy(hy);
	}

	public List findAllHy() {
		return hyDao.findAllHy();
	}
	public List findHyByHyxm(String hyxm){
		return hyDao.findHyByHyxm(hyxm);
	}

	public Hy findHyByHyno(int hyno) {
		return hyDao.findHyByHyno(hyno);
	}

	public void updateHy(Hy hy) {
		hyDao.updateHy(hy);
	}

	public void deleHy(Hy hy) {
		hyDao.deleHy(hy);
	}

	public void addGs(Sygs gs) {
		gsDao.addGs(gs);
	}

	public void deleGs(Sygs gs) {
		gsDao.deleGs(gs);
		
	}

	public List findGsByGsmc(String gsmc) {
		
		return gsDao.findGsByGsmc(gsmc);
	}

	public Sygs findGsByGsno(int gsno) {
		return gsDao.findGsByGsno(gsno);
	}

	public void updateGs(Sygs gs) {
		gsDao.updateGs(gs);
	}

	public List findAllGs() {
		return gsDao.findAllGs();
	}

	public void addLsrz(Lsrz lsrz) {
		lsrzDao.addLsrz(lsrz);
	}

	public List findAllLsrz() {
		return lsrzDao.findAllLsrz();
	}

	public List findLsrzByFjno(String fjno) {
		return lsrzDao.findLsrzByFjno(fjno);
	}

	public List findLsrzByKhmc(String khmc) {
		return lsrzDao.findLsrzByKhmc(khmc);
	}
	
	public void deleLsrz(Lsrz lsrz){
		lsrzDao.deleLsrz(lsrz);
	}

	public void deleJs(Js js) {
		jsDao.deleJs(js);
	}

	public List findJsByFjno(String fjno) {
		return jsDao.findJsByFjno(fjno);
	}

	public List findJsByKhmc(String khmc) {
		return jsDao.findJsByKhmc(khmc);
	}

	public List findAllJs() {
		return jsDao.findAllJs();
	}

	public Js findJsByJsid(int jsid) {
		return jsDao.findJsByJsid(jsid);
	}

	public void dele(Czy c) {
		czyDao.dele(c);
	}

	public List findAllCzy() {
		return czyDao.findAllCzy();
	}

	public List findCzyByName(String name) {
		return czyDao.findCzyByName(name);
	}

	public Czy get(int id) {
		return czyDao.get(id);
	}

	public void save(Czy c) {
		czyDao.save(c);
	}

	public void update(Czy c) {
		czyDao.update(c);
	}

	public Yhqs findYhqsByQsno(int qsno) {
		return yhqsDao.findYhqsByQsno(qsno);
	}

	public int RzTatal(String key, String value) {
		return rzDao.RzTatal(key, value);
	}

	public List findAllRzFenYe(String key, String value, int first, int num) {
		return rzDao.findAllRzFenYe(key, value, first, num);
	}

	public int JsTatal(String key, String value) {
		return jsDao.JsTatal(key, value);
	}

	public List findAllJsFenYe(String key, String value, int first, int num) {
		return jsDao.findAllJsFenYe(key, value, first, num);
	}

	public Fj afindFjByFjno(String fjno) {
		return fjDao.afindFjByFjno(fjno);
	}

	public int YdTatal(String key, String value) {
		return ydDao.YdTatal(key, value);
	}

	public List findAllYdFenYe(String key, String value, int first, int num) {
		return ydDao.findAllYdFenYe(key, value, first, num);
	}

	public int FjTatal(String key, String value) {
		return fjDao.FjTatal(key, value);
	}

	public List findAllFjFenYe(String key, String value, int first, int num) {
		return fjDao.findAllFjFenYe(key, value, first, num);
	}

	public int KhTatal(String key, String value) {
		return khDao.KhTatal(key, value);
	}

	public List findAllKhFenYe(String key, String value, int first, int num) {
		return khDao.findAllKhFenYe(key, value, first, num);
	}
}
