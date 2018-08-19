package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Fj entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Fj implements java.io.Serializable {

	// Fields

	private Integer fjid;
	private Fjlx fjlx;
	private String fjno;
	private String fjzt;
	private Integer lc;
	private String fjdh;
	private Integer ydzt;
	private String beizhu;
	private Set rzs = new HashSet(0);
	private Set yds = new HashSet(0);
	private Set rzs_1 = new HashSet(0);

	// Constructors

	/** default constructor */
	public Fj() {
	}

	/** full constructor */
	public Fj(Fjlx fjlx, String fjno, String fjzt, Integer lc, String fjdh,
			Integer ydzt, String beizhu, Set rzs, Set yds, Set rzs_1) {
		this.fjlx = fjlx;
		this.fjno = fjno;
		this.fjzt = fjzt;
		this.lc = lc;
		this.fjdh = fjdh;
		this.ydzt = ydzt;
		this.beizhu = beizhu;
		this.rzs = rzs;
		this.yds = yds;
		this.rzs_1 = rzs_1;
	}

	// Property accessors

	public Integer getFjid() {
		return this.fjid;
	}

	public void setFjid(Integer fjid) {
		this.fjid = fjid;
	}

	public Fjlx getFjlx() {
		return this.fjlx;
	}

	public void setFjlx(Fjlx fjlx) {
		this.fjlx = fjlx;
	}

	public String getFjno() {
		return this.fjno;
	}

	public void setFjno(String fjno) {
		this.fjno = fjno;
	}

	public String getFjzt() {
		return this.fjzt;
	}

	public void setFjzt(String fjzt) {
		this.fjzt = fjzt;
	}

	public Integer getLc() {
		return this.lc;
	}

	public void setLc(Integer lc) {
		this.lc = lc;
	}

	public String getFjdh() {
		return this.fjdh;
	}

	public void setFjdh(String fjdh) {
		this.fjdh = fjdh;
	}

	public Integer getYdzt() {
		return this.ydzt;
	}

	public void setYdzt(Integer ydzt) {
		this.ydzt = ydzt;
	}

	public String getBeizhu() {
		return this.beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Set getRzs() {
		return this.rzs;
	}

	public void setRzs(Set rzs) {
		this.rzs = rzs;
	}

	public Set getYds() {
		return this.yds;
	}

	public void setYds(Set yds) {
		this.yds = yds;
	}

	public Set getRzs_1() {
		return this.rzs_1;
	}

	public void setRzs_1(Set rzs_1) {
		this.rzs_1 = rzs_1;
	}

}