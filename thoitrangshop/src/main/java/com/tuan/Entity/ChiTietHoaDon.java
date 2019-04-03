package com.tuan.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity(name="CHITIETHOADON")
//@IdClass(ChiTietHoaDonId.class)
public class ChiTietHoaDon {
	@EmbeddedId
	// do có biến ngoại lai nên tạo thêm class ChiTietHoaDonId
	
	ChiTietHoaDonId chiTietHoaDonId;

	int soluong;
	int giatien;
	public ChiTietHoaDonId getChiTietHoaDonId() {
		return chiTietHoaDonId;
	}
	public void setChiTietHoaDonId(ChiTietHoaDonId chiTietHoaDonId) {
		this.chiTietHoaDonId = chiTietHoaDonId;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getGiatien() {
		return giatien;
	}
	public void setGiatien(int giatien) {
		this.giatien = giatien;
	}
	
	
}
