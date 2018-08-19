package model;

import java.util.Date;

/**
 * Js entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Js implements java.io.Serializable {

	// Fields

	private Integer jsid;
	private String khmc;
	private String khxb;
	private String zjlx;
	private String zjbh;
	private String fjno;
	private Integer szts;
	private Double ysje;
	private Date jssj;
	private String beizhu;

	// Constructors

	/** default constructor */
	public Js() {
	}

	/** full constructor */
	public Js(String khmc, String khxb, String zjlx, String zjbh, String fjno,
			Integer szts, Double ysje, Date jssj, String beizhu) {
		this.khmc = khmc;
		this.khxb = khxb;
		this.zjlx = zjlx;
		this.zjbh = zjbh;
		this.fjno = fjno;
		this.szts = szts;
		this.ysje = ysje;
		this.jssj = jssj;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Integer getJsid() {
		return this.jsid;
	}

	public void setJsid(Integer jsid) {
		this.jsid = jsid;
	}

	public String getKhmc() {
		return this.khmc;
	}

	public void setKhmc(String khmc) {
		this.khmc = khmc;
	}

	public String getKhxb() {
		return this.khxb;
	}

	public void setKhxb(String khxb) {
		this.khxb = khxb;
	}

	public String getZjlx() {
		return this.zjlx;
	}

	public void setZjlx(String zjlx) {
		this.zjlx = zjlx;
	}

	public String getZjbh() {
		return this.zjbh;
	}

	public void setZjbh(String zjbh) {
		this.zjbh = zjbh;
	}

	public String getFjno() {
		return this.fjno;
	}

	public void setFjno(String fjno) {
		this.fjno = fjno;
	}

	public Integer getSzts() {
		return this.szts;
	}

	public void setSzts(Integer szts) {
		this.szts = szts;
	}

	public Double getYsje() {
		return this.ysje;
	}

	public void setYsje(Double ysje) {
		this.ysje = ysje;
	}

	public Date getJssj() {
		return this.jssj;
	}

	public void setJssj(Date jssj) {
		this.jssj = jssj;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

}