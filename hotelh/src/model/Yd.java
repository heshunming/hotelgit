package model;

import java.util.Date;

/**
 * Yd entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Yd implements java.io.Serializable {

	// Fields

	private Integer ydid;
	private Fj fj;
	private Kh kh;
	private String fjlxno;
	private String khlxno;
	private Integer yzts;
	private Date ydsj;
	private Double ydyj;
	private Double dzbl;
	private String czy;
	private String beizhu;

	// Constructors

	/** default constructor */
	public Yd() {
	}

	/** full constructor */
	public Yd(Fj fj, Kh kh, String fjlxno, String khlxno, Integer yzts,
			Date ydsj, Double ydyj, Double dzbl, String czy, String beizhu) {
		this.fj = fj;
		this.kh = kh;
		this.fjlxno = fjlxno;
		this.khlxno = khlxno;
		this.yzts = yzts;
		this.ydsj = ydsj;
		this.ydyj = ydyj;
		this.dzbl = dzbl;
		this.czy = czy;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Integer getYdid() {
		return this.ydid;
	}

	public void setYdid(Integer ydid) {
		this.ydid = ydid;
	}

	public Fj getFj() {
		return this.fj;
	}

	public void setFj(Fj fj) {
		this.fj = fj;
	}

	public Kh getKh() {
		return this.kh;
	}

	public void setKh(Kh kh) {
		this.kh = kh;
	}

	public String getFjlxno() {
		return this.fjlxno;
	}

	public void setFjlxno(String fjlxno) {
		this.fjlxno = fjlxno;
	}

	public String getKhlxno() {
		return this.khlxno;
	}

	public void setKhlxno(String khlxno) {
		this.khlxno = khlxno;
	}

	public Integer getYzts() {
		return this.yzts;
	}

	public void setYzts(Integer yzts) {
		this.yzts = yzts;
	}

	public Date getYdsj() {
		return this.ydsj;
	}

	public void setYdsj(Date ydsj) {
		this.ydsj = ydsj;
	}

	public Double getYdyj() {
		return this.ydyj;
	}

	public void setYdyj(Double ydyj) {
		this.ydyj = ydyj;
	}

	public Double getDzbl() {
		return this.dzbl;
	}

	public void setDzbl(Double dzbl) {
		this.dzbl = dzbl;
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