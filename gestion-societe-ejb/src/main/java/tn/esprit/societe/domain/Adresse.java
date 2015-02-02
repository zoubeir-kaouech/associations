package tn.esprit.societe.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class Adresse implements Serializable {

	private String zipCode;

	private String rue;
	private static final long serialVersionUID = 1L;
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}

}
