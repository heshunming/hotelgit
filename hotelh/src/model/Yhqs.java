package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Yhqs entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Yhqs implements java.io.Serializable {

	// Fields

	private Integer qsid;
	private Integer qsno;
	private String qsmc;
	private Set czies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Yhqs() {
	}

	/** full constructor */
	public Yhqs(Integer qsno, String qsmc, Set czies) {
		this.qsno = qsno;
		this.qsmc = qsmc;
		this.czies = czies;
	}

	// Property accessors

	public Integer getQsid() {
		return this.qsid;
	}

	public void setQsid(Integer qsid) {
		this.qsid = qsid;
	}

	public Integer getQsno() {
		return this.qsno;
	}

	public void setQsno(Integer qsno) {
		this.qsno = qsno;
	}

	public String getQsmc() {
		return this.qsmc;
	}

	public void setQsmc(String qsmc) {
		this.qsmc = qsmc;
	}

	public Set getCzies() {
		return this.czies;
	}

	public void setCzies(Set czies) {
		this.czies = czies;
	}

}