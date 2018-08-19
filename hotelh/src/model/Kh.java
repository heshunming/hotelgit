package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Kh entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Kh implements java.io.Serializable {

	// Fields

	private Integer khno;
	private Khlx khlx;
	private String khmc;
	private String khxb;
	private String zjlx;
	private String zjbh;
	private String dz;
	private Integer rs;
	private String beizhu;
	private Set yds = new HashSet(0);
	private Set rzs = new HashSet(0);
	private Set rzs_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Kh() {
	}

	/** full constructor */
	public Kh(Khlx khlx, String khmc, String khxb, String zjlx, String zjbh,
			String dz, Integer rs, String beizhu, Set yds, Set rzs, Set rzs_1) {
		this.khlx = khlx;
		this.khmc = khmc;
		this.khxb = khxb;
		this.zjlx = zjlx;
		this.zjbh = zjbh;
		this.dz = dz;
		this.rs = rs;
		this.beizhu = beizhu;
		this.yds = yds;
		this.rzs = rzs;
		this.rzs_1 = rzs_1;
	}

	// Property accessors

	public Integer getKhno() {
		return this.khno;
	}

	public void setKhno(Integer khno) {
		this.khno = khno;
	}

	public Khlx getKhlx() {
		return this.khlx;
	}

	public void setKhlx(Khlx khlx) {
		this.khlx = khlx;
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

	public String getDz() {
		return this.dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public Integer getRs() {
		return this.rs;
	}

	public void setRs(Integer rs) {
		this.rs = rs;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Set getYds() {
		return this.yds;
	}

	public void setYds(Set yds) {
		this.yds = yds;
	}

	public Set getRzs() {
		return this.rzs;
	}

	public void setRzs(Set rzs) {
		this.rzs = rzs;
	}

	public Set getRzs_1() {
		return this.rzs_1;
	}

	public void setRzs_1(Set rzs_1) {
		this.rzs_1 = rzs_1;
	}

}