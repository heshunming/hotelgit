package model;

/**
 * Czy entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Czy implements java.io.Serializable {

	// Fields

	private Integer czyid;
	private Yhqs yhqs;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public Czy() {
	}

	/** full constructor */
	public Czy(Yhqs yhqs, String username, String password) {
		this.yhqs = yhqs;
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public Integer getCzyid() {
		return this.czyid;
	}

	public void setCzyid(Integer czyid) {
		this.czyid = czyid;
	}

	public Yhqs getYhqs() {
		return this.yhqs;
	}

	public void setYhqs(Yhqs yhqs) {
		this.yhqs = yhqs;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}