package model;

import java.util.Date;

/**
 * Rz entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Rz implements java.io.Serializable {

	// Fields

	private Integer rzid;
	private Fj fj;
	private Kh kh;
	private String fjlxno;
	private String khlxno;
	private Date rzsj;
	private Integer yzts;
	private Double yj;
	private String czy;
	private String beizhu;
	private Double dzbl;

	// Constructors

	/** default constructor */
	public Rz() {
	}

	/** full constructor */
	public Rz(Fj fj, Kh kh, String fjlxno, String khlxno, Date rzsj,
			Integer yzts, Double yj, String czy, String beizhu, Double dzbl) {
		this.fj = fj;
		this.kh = kh;
		this.fjlxno = fjlxno;
		this.khlxno = khlxno;
		this.rzsj = rzsj;
		this.yzts = yzts;
		this.yj = yj;
		this.czy = czy;
		this.beizhu = beizhu;
		this.dzbl = dzbl;
	}

	// Property accessors

	public Integer getRzid() {
		return this.rzid;
	}

	public void setRzid(Integer rzid) {
		this.rzid = rzid;
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

	public Date getRzsj() {
		return this.rzsj;
	}

	public void setRzsj(Date rzsj) {
		this.rzsj = rzsj;
	}

	public Integer getYzts() {
		return this.yzts;
	}

	public void setYzts(Integer yzts) {
		this.yzts = yzts;
	}

	public Double getYj() {
		return this.yj;
	}

	public void setYj(Double yj) {
		this.yj = yj;
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

	public Double getDzbl() {
		return this.dzbl;
	}

	public void setDzbl(Double dzbl) {
		this.dzbl = dzbl;
	}

}