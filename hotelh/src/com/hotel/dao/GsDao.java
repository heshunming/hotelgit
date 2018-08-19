package com.hotel.dao;

import java.util.List;

import model.Sygs;

public interface GsDao {
public void addGs(Sygs gs);

public void deleGs(Sygs gs);

public void updateGs(Sygs gs);

public Sygs findGsByGsno(int gsno);

public List findGsByGsmc(String gsmc);

public List findAllGs();
}
