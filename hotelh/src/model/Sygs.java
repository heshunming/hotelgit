package model;

/**
 * Sygs entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Sygs implements java.io.Serializable {

	// Fields

	private Integer gsno;
	private String mm;
	private String gsmc;
	private String gsdz;
	private String gsdh;
	private String beizhu;

	// Constructors

	/** default constructor */
	public Sygs() {
	}

	/** full constructor */
	public Sygs(String mm, String gsmc, String gsdz, String gsdh, String beizhu) {
		this.mm = mm;
		this.gsmc = gsmc;
		this.gsdz = gsdz;
		this.gsdh = gsdh;
		this.beizhu = beizhu;
	}

	// Property accessors

	public Integer getGsno() {
		return this.gsno;
	}

	public void setGsno(Integer gsno) {
		this.gsno = gsno;
	}

	public String getMm() {
		return this.mm;
	}

	public void setMm(String mm) {
		this.mm = mm;
	}

	public String getGsmc() {
		return this.gsmc;
	}

	public void setGsmc(String gsmc) {
		this.gsmc = gsmc;
	}

	public String getGsdz() {
		return this.gsdz;
	}

	public void setGsdz(String gsdz) {
		this.gsdz = gsdz;
	}

	public String getGsdh() {
		return this.gsdh;
	}

	public void setGsdh(String gsdh) {
		this.gsdh = gsdh;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

}