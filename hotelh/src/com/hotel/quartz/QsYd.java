package com.hotel.quartz;

import com.hotel.service.HotelManager;

public class QsYd {
	private HotelManager hotelManager;

	public void setHotelManager(HotelManager hotelManager) {
		this.hotelManager = hotelManager;
	}

	public void deleYd() {//采用quartz方法在每天1点定时删除YD表中的信息
		System.out.print("5555");
		hotelManager.deleYd();
	}
}
