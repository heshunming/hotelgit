package com.hotel.service;

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

public interface HotelManager {

	public Integer validLogin(String username, String pass);

	public Czy get(int id);

	public void save(Czy c);

	public void dele(Czy c);

	public void update(Czy c);

	public List findAllCzy();

	public List findCzyByName(String name);

	public Fjlx findFjlxByFjlxno(String fxno);

	public void addFj(Fj f);

	public void deleFjBy(Fj f);

	public List findAllFj();

	public void updateFj(Fj f);

	public List findFjByFjno(String fjno);

	public Fj findFjById(int id);

	public Khlx findKhlxByKxno(String kxno);

	public void addKh(Kh k);

	public List findAllKh();

	public Kh findKhByKhno(int khno);

	public List findKhByKhmc(String khmc);

	public void deleKh(Kh kh);

	public void updateKh(Kh k);

	public void addRz(Rz r);

	public void updateRz(Rz rz);

	public boolean findRzByKhid(int khid);

	public List findFjByFjlxno(Fjlx fx);

	public Integer fjZt(String c);

	public void setFjzt(Fj fj);

	public void addYd(Yd yd);// 用预定信息插入到预定表中

	public boolean findYdByKhid(int khid);

	public void updateYd(Yd yd);

	public void deleYd();// 删除所有预定表中的信息。

	public List findFjByFjzt(String fjzt);// 通用房间状态查找房间

	public List findRzByFj(Fj fj);

	public List findRzByKhmc(String khmc);

	public List findRzByFjno(String fjno);

	public List findAllRz();// 查的所有入住信息

	public Rz findRzByRzid(int rzid);

	public void deleRz(Rz rz);

	public void addJs(Js js);

	public List findAllYd();

	public List findYdByKhmc(String khmc);

	public void deleteYdByYd(Yd yd);

	public Yd findYdByYdid(int ydid);

	public List findYdByFjno(String fjno);

	public void addHy(Hy hy);

	public List findAllHy();

	public List findHyByHyxm(String hyxm);

	public Hy findHyByHyno(int hyno);

	public void updateHy(Hy hy);

	public void deleHy(Hy hy);

	public void addGs(Sygs gs);

	public void deleGs(Sygs gs);

	public void updateGs(Sygs gs);

	public Sygs findGsByGsno(int gsno);

	public List findGsByGsmc(String gsmc);

	public List findAllGs();

	public void addLsrz(Lsrz lsrz);

	public List findAllLsrz();

	public List findLsrzByKhmc(String khmc);

	public List findLsrzByFjno(String fjno);

	public void deleLsrz(Lsrz lsrz);

	public void deleJs(Js js);

	public List findJsByFjno(String fjno);

	public List findJsByKhmc(String khmc);

	public List findAllJs();

	public Js findJsByJsid(int jsid);

	public Yhqs findYhqsByQsno(int qsno);

	public List findAllRzFenYe(String key, String value, int first, int num);

	public int RzTatal(String key, String value);

	public List findAllJsFenYe(String key, String value, int first, int num);

	public int JsTatal(String key, String value);

	public Fj afindFjByFjno(String fjno);

	public List findAllYdFenYe(String key, String value, int first, int num);

	public int YdTatal(String key, String value);

	public List findAllFjFenYe(String key, String value, int first, int num);

	public int FjTatal(String key, String value);
	
	public List findAllKhFenYe(String key, String value, int first, int num);

	public int KhTatal(String key, String value);
}
