package tn.esprit.societe.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: Projet
 *
 */
@Entity
@Table(name="t_projet")

public class Projet implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Date dateCreation;

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


@Temporal(TemporalType.DATE)
@Column(name="date_creation")
	public Date getDateCreation() {
		return dateCreation;
	}



	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}



	public Projet() {
		super();
	}
   
}
