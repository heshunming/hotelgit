package model;

import java.util.Date;

/**
 * Lsrz entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Lsrz implements java.io.Serializable {

	// Fields

	private Integer lsid;
	private String fjno;
	private String fjlx;
	private String khmc;
	private String khlxno;
	private String khdz;
	private String khzjlx;
	private String khzjbh;
	private Date rzsj;
	private Date jssj;
	private Double ssje;
	private String czy;
	private String beizhu;

	// Constructors

	/** default constructor */
	public Lsrz() {
	}

	/** full constructor */
	public Lsrz(String fjno, String fjlx, String khmc, String khlxno,
			String khdz, String khzjlx, String khzjbh, Date rzsj, Date jssj,
			Double ssje, String czy, String beizhu) {
		this.fjno = fjno;
		this.fjlx = fjlx;
		this.khmc = khmc;
		this.khlxno = khlxno;
		this.khdz = khdz;
		this.khzjlx = khzjlx;
		this.khzjbh = khzjbh;
		this.rzsj = rzsj;
		this.jssj = jssj;
		this.ssje = ssje;
		this.czy = czy;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Integer getLsid() {
		return this.lsid;
	}

	public void setLsid(Integer lsid) {
		this.lsid = lsid;
	}

	public String getFjno() {
		return this.fjno;
	}

	public void setFjno(String fjno) {
		this.fjno = fjno;
	}

	public String getFjlx() {
		return this.fjlx;
	}

	public void setFjlx(String fjlx) {
		this.fjlx = fjlx;
	}

	public String getKhmc() {
		return this.khmc;
	}

	public void setKhmc(String khmc) {
		this.khmc = khmc;
	}

	public String getKhlxno() {
		return this.khlxno;
	}

	public void setKhlxno(String khlxno) {
		this.khlxno = khlxno;
	}

	public String getKhdz() {
		return this.khdz;
	}

	public void setKhdz(String khdz) {
		this.khdz = khdz;
	}

	public String getKhzjlx() {
		return this.khzjlx;
	}

	public void setKhzjlx(String khzjlx) {
		this.khzjlx = khzjlx;
	}

	public String getKhzjbh() {
		return this.khzjbh;
	}

	public void setKhzjbh(String khzjbh) {
		this.khzjbh = khzjbh;
	}

	public Date getRzsj() {
		return this.rzsj;
	}

	public void setRzsj(Date rzsj) {
		this.rzsj = rzsj;
	}

	public Date getJssj() {
		return this.jssj;
	}

	public void setJssj(Date jssj) {
		this.jssj = jssj;
	}

	public Double getSsje() {
		return this.ssje;
	}

	public void setSsje(Double ssje) {
		this.ssje = ssje;
	}

	public String getCzy() {
		return this.czy;
	}

	public void setCzy(String czy) {
		this.czy = czy;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

}