package com.hotel.quartz;

import com.hotel.service.HotelManager;

public class QsYd {
	private HotelManager hotelManager;

	public void setHotelManager(HotelManager hotelManager) {
		this.hotelManager = hotelManager;
	}

	public void deleYd() {//����quartz������ÿ��1�㶨ʱɾ��YD���е���Ϣ
		System.out.print("5555");
		hotelManager.deleYd();
	}
}
