package model;

/**
 * Hy entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Hy implements java.io.Serializable {

	// Fields

	private Integer hyno;
	private String hyxm;
	private String hymm;
	private String hyxb;
	private String zjlb;
	private String zjbh;
	private String dz;
	private String lxdh;
	private String beizhu;

	// Constructors

	/** default constructor */
	public Hy() {
	}

	/** full constructor */
	public Hy(String hyxm, String hymm, String hyxb, String zjlb, String zjbh,
			String dz, String lxdh, String beizhu) {
		this.hyxm = hyxm;
		this.hymm = hymm;
		this.hyxb = hyxb;
		this.zjlb = zjlb;
		this.zjbh = zjbh;
		this.dz = dz;
		this.lxdh = lxdh;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Integer getHyno() {
		return this.hyno;
	}

	public void setHyno(Integer hyno) {
		this.hyno = hyno;
	}

	public String getHyxm() {
		return this.hyxm;
	}

	public void setHyxm(String hyxm) {
		this.hyxm = hyxm;
	}

	public String getHymm() {
		return this.hymm;
	}

	public void setHymm(String hymm) {
		this.hymm = hymm;
	}

	public String getHyxb() {
		return this.hyxb;
	}

	public void setHyxb(String hyxb) {
		this.hyxb = hyxb;
	}

	public String getZjlb() {
		return this.zjlb;
	}

	public void setZjlb(String zjlb) {
		this.zjlb = zjlb;
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

	public String getLxdh() {
		return this.lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

}