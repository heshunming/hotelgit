package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Khlx entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Khlx implements java.io.Serializable {

	// Fields

	private Integer khlxid;
	private String khlxno;
	private String khlx;
	private String zksx;
	private Double zkbl;
	private String beizhu;
	private Set khs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Khlx() {
	}

	/** full constructor */
	public Khlx(String khlxno, String khlx, String zksx, Double zkbl,
			String beizhu, Set khs) {
		this.khlxno = khlxno;
		this.khlx = khlx;
		this.zksx = zksx;
		this.zkbl = zkbl;
		this.beizhu = beizhu;
		this.khs = khs;
	}

	// Property accessors

	public Integer getKhlxid() {
		return this.khlxid;
	}

	public void setKhlxid(Integer khlxid) {
		this.khlxid = khlxid;
	}

	public String getKhlxno() {
		return this.khlxno;
	}

	public void setKhlxno(String khlxno) {
		this.khlxno = khlxno;
	}

	public String getKhlx() {
		return this.khlx;
	}

	public void setKhlx(String khlx) {
		this.khlx = khlx;
	}

	public String getZksx() {
		return this.zksx;
	}

	public void setZksx(String zksx) {
		this.zksx = zksx;
	}

	public Double getZkbl() {
		return this.zkbl;
	}

	public void setZkbl(Double zkbl) {
		this.zkbl = zkbl;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Set getKhs() {
		return this.khs;
	}

	public void setKhs(Set khs) {
		this.khs = khs;
	}

}