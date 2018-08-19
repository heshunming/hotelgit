package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Fjlx entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Fjlx implements java.io.Serializable {

	// Fields

	private Integer fjlxid;
	private String fjlxno;
	private String fjlx;
	private Integer cws;
	private Double dj;
	private String zdf;
	private Double zdfj;
	private String beizhu;
	private Set fjs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Fjlx() {
	}

	/** full constructor */
	public Fjlx(String fjlxno, String fjlx, Integer cws, Double dj, String zdf,
			Double zdfj, String beizhu, Set fjs) {
		this.fjlxno = fjlxno;
		this.fjlx = fjlx;
		this.cws = cws;
		this.dj = dj;
		this.zdf = zdf;
		this.zdfj = zdfj;
		this.beizhu = beizhu;
		this.fjs = fjs;
	}

	// Property accessors

	public Integer getFjlxid() {
		return this.fjlxid;
	}

	public void setFjlxid(Integer fjlxid) {
		this.fjlxid = fjlxid;
	}

	public String getFjlxno() {
		return this.fjlxno;
	}

	public void setFjlxno(String fjlxno) {
		this.fjlxno = fjlxno;
	}

	public String getFjlx() {
		return this.fjlx;
	}

	public void setFjlx(String fjlx) {
		this.fjlx = fjlx;
	}

	public Integer getCws() {
		return this.cws;
	}

	public void setCws(Integer cws) {
		this.cws = cws;
	}

	public Double getDj() {
		return this.dj;
	}

	public void setDj(Double dj) {
		this.dj = dj;
	}

	public String getZdf() {
		return this.zdf;
	}

	public void setZdf(String zdf) {
		this.zdf = zdf;
	}

	public Double getZdfj() {
		return this.zdfj;
	}

	public void setZdfj(Double zdfj) {
		this.zdfj = zdfj;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Set getFjs() {
		return this.fjs;
	}

	public void setFjs(Set fjs) {
		this.fjs = fjs;
	}

}